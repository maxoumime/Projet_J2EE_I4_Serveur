/**
 * Created by MhD on 26/02/15.
 */

var produitModule = angular.module('produit.module', ['EPSIapp']);

produitModule.config(['$routeProvider', function($routeProvider) {
    $routeProvider.when('/produit',    {templateUrl: 'templates/produitView.html', controller: 'ProduitCtrl'});
}]);

produitModule.controller('ProduitCtrl', ['$scope', '$routeParams', function($scope, $routeParams) {

    $scope.produits = "Hey";
}]);