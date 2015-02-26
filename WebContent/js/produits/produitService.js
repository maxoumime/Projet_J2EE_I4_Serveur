/**
 * Created by MhD on 26/02/15.
 */
app.factory('produitFactory', function ($http, $q){
    var factory = {};
    factory.getlist = function(){
        return $http.get('http://localhost:8080/rest/produit?format=json'). // Ajout de {'Access-Control-Allow-Origin': 'localhost:*'}
            then(function(response) {                                       // Pour effectuer requete HTTP sans credentials
                console.log(response);
                return (response.data.itemsToReturn);
            });
    }
    return factory;
});