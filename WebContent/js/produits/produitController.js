/**
 * Created by MhD on 26/02/15.
 */

produitModule.controller('ProduitCtrl', ['$scope', '$rootScope', '$location', '$routeParams', 'produitService', function($scope, $rootScope, $location, $routeParams, produitService) {

produitModule.controller('ProduitCtrl', ['$scope', '$routeParams', function($scope, $routeParams) {
 
    if($rootScope.token === undefined)
        $location.path("/login");

    produitService.getlist().success(function(data){
        if(data != undefined) {
            $scope.produits = data;
        }
        console.log(typeof $scope.produits)
    });
}]);