/**
 * Created by MhD on 26/02/15.
 */
produitModule.factory('produitService', ['$http', '$rootScope', function ($http, $rootScope){
    var factory = {};
    factory.getlist = function(){
        return $http.get('http://localhost:8080/rest/produit?token='
            + $rootScope.token
        );
    };
    return factory;
}]);