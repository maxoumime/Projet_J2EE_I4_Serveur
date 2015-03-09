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