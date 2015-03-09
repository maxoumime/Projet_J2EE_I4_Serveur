// Declare app level module which depends on filters, and services
var app = angular.module('EPSIapp', [
    'ngRoute',
    'produit.module',
    'login.module'

]);

/**
 * Main configuration
 */
app.config(['$routeProvider', function($routeProvider) {
    $routeProvider.otherwise({redirectTo: '/'});
}]);