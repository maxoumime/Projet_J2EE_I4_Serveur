/**
 * Created by MhD on 26/02/15.
 */

produitModule.controller('ProduitCtrl', ['$scope', '$rootScope', '$location', '$routeParams', 'produitService', function($scope, $rootScope, $location, $routeParams, produitService) {

    if($rootScope.token === undefined)
        $location.path("/login");
    else {
        produitService.getlist().success(function (data) {
            if (data != undefined) {
                $scope.products = data;
            }
        });
    }
}]);