/**
 * Created by maxoumime on 09/03/15.
 */
var produitModule = angular.module('produit.module', ['EPSIapp']);

produitModule.config(['$routeProvider', function($routeProvider) {
    $routeProvider.when('/produit',    {templateUrl: 'templates/productDisplay.html', controller: 'ProduitCtrl'});
}]);