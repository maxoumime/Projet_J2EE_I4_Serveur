##Projet J2EE EPSI I4

###Sujet
Dans le premier projet, une entreprise fournissait des services WEB afin de passer des commandes de produits. Ces services vont être utilisés pour créer une application cliente afin de :
- s'authentifier
- lister les produits et la quantité disponible
- sélectionner un produit, saisir une quantité
- commander un produit

###Implémentation
- Définir et implémenter en REST les services WEB nécessaires au bon fonctionnement de cette application.
- Créer les écrans de l'application grâce au framework AngularJS qui utilisera les services REST
- Tester le service de surveillance de stock grâce aux services SOAP
- Les règles de gestion suivantes devront être vérifiées par des tests d'intégration et
lors de la démonstration :
	- si le login est incorrect, l'utilisateur ne doit pas pouvoir passer de commandes
	- si la quantité est supérieure à la disponibilité, la commande sera annulée
	- si une référence n'existe pas, la commande ne doit pas pouvoir être enregistrée
	- on ne doit pas pouvoir passer une commande sans s'authentifier



==Groupe : DEWILDE/BERTHEAU/DENIS/MAHMAL==