var app = angular.module('produits', []);
//Création du Controller
app.controller('produitList', function ($scope, $http) {
    $scope.refreshGrid = function (page) {
        //Appel REST sur l'URL
        $http({
            url: 'rest/produit',
            method: 'GET',
            params: {
                page: page
            }
        }).success(function (data) {
            $scope.persons = data;
        });
    };

    $scope.$watch('', function () {
    }, true);
});