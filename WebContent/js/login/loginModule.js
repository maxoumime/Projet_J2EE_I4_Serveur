/**
 * Created by maxoumime on 09/03/15.
 */
var loginModule = angular.module('login.module', ['EPSIapp']);

produitModule.config(['$routeProvider', function($routeProvider) {
    $routeProvider.when('/login',    {templateUrl: 'templates/login.html', controller: 'LoginCtrl'});
}]);