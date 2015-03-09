// Declare app level module which depends on filters, and services
var app = angular.module('EPSIapp', [
    'ngRoute',
    'produit.module'
]);

/**
 * Main configuration
 */
app.config(['$routeProvider', function($routeProvider) {
    $routeProvider.when('/', {templateUrl: 'templates/welcome.html'});
    $routeProvider.otherwise({redirectTo: '/'});
}]);

app.run(function($rootScope, $http) {

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
        data: {user: 'john', password: 'doe'}
    }).success(function (data) {
        $rootScope.token = data;
        console.log($rootScope.token)
    });
});