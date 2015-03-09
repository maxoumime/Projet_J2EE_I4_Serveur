/**
 * Created by MhD on 26/02/15.
 */

var produitModule = angular.module('produit.module', ['EPSIapp']);

produitModule.config(['$routeProvider', function($routeProvider) {
    $routeProvider.when('/produit',    {templateUrl: 'templates/productDisplay.html', controller: 'ProduitCtrl'});
}]);

produitModule.controller('ProduitCtrl', ['$scope', '$routeParams', function($scope, $routeParams) {

    $scope.products = [{"nom":"Table Rouge","reference":"1EE3F","quantity":10},{"nom":"Table Verte","reference":"8HD8J","quantity":5},{"nom":"Chaise Bleu","reference":"9IK7J","quantity":8},{"nom":"Chaise Jaune","reference":"0KS6T","quantity":2}];
    
}]);