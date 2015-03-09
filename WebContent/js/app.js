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
    $routeProvider.when('/login', {templateUrl: 'templates/login.html'});
    $routeProvider.when('/produit', {templateUrl: 'templates/produitView.html'});
    $routeProvider.otherwise({redirectTo: '/'});
}]);