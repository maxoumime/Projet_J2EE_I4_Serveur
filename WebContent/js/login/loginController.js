/**
 * Created by MhD on 26/02/15.
 */

loginModule.controller('LoginCtrl', ['$scope', '$rootScope', '$location', '$routeParams', '$http', function($scope, $rootScope, $location, $routeParams, $http) {

    $scope.login = function(){

        $http({
            method: 'POST',
            url: 'http://localhost:8080/rest/login',
            headers: {'Content-Type': 'application/x-www-form-urlencoded'},
            transformRequest: function(obj) {
                var str = [];
                for(var p in obj)
                    str.push(encodeURIComponent(p) + "=" + encodeURIComponent(obj[p]));
                return str.join("&");
            },
            data: {user: $scope.user, password: $scope.password}
        }).success(function (data) {
            $rootScope.token = data;
            $location.path('/produit')
        });
    }

}]);