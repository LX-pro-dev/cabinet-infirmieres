# Cabinet Médical

The best online  medical office !

## Lancer le projet
- dans le dossier cabinet_db :  créer un dossier data
- depuis le dossier cabient_db : docker compose up
- mvn install (pour la première fois)  
- faire un fichier de conf  
- src/main/resources/application.yml (pour la connexion bdd)  
- mvn spring-boot:run (pour lancer le serveur)

## Routes API

### ADRESSE

#### GET /adresses/{id}

Structure de retour exemple:
    
    "id": 6,"
    "numero": "1",
    "rue": "la rue",
    "cp": 93290,
    "ville": "Labassebien"

#### GET /adresses

Même structure que GET /adresse/{id} mais en liste

#### POST /adresse
Exemple de données attendues:

    "id": 8,
    "numero": "1",
    "rue": "la rue",
    "cp": 93290,
    "ville": "Labassebien"

#### PUT /adresses

Même structure que le PUT /adresses mais avec l'id de l'art à modifier

#### DELETE /adresses/{id}

Supprime l'adresse avec l'id correspondant
