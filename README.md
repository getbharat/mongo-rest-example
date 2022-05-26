# mongo-rest-example, the project demonstrates REST integration with Mongo.
 ### Follow the below steps to run the project locally.
   - Make sure docker and docker compose is installed.
   - Clone the repository using git clone.
   - Navigate to the directory where docker compose file resides, and run the containers using ``docker compose up -d``
   - Mongo Express, Mongo DB, and mongo-rest-example containers would be started. 
   - Connect MonogDB using Mongo Express, it can be connected using http://localhost:8081
   - Create a database called products.

  ### Now a client can consume the exposed APIs.
   - POST API - To create product. 
   - URL - http://localhost:8070/product/add
   - Request body example -
          
          {
             "productId":3,
             "name":"Mysore Sandal",
             "description":"Bath Soap",
             "category":"SOAP",
             "price":120,
             "mfgDate":"2021-09-07T15:50-04:00"
          }
   - GET API - To get all the products.
   - URL - http://localhost:8070/product/get
   - Response body example - 

           [
              {
                  "productId": 1,
                  "name": "Mysore Sandal",
                  "category": "SOAP",
                  "description": "Bath Soap",
                  "price": 120.0,
                  "mfgDate": "2021-09-07T19:50:00.000+00:00"
              },
              {
                  "productId": 2,
                  "name": "Lux Soap",
                  "category": "SOAP",
                  "description": "Bath Soap",
                  "price": 100.0,
                  "mfgDate": "2021-12-07T19:50:00.000+00:00"
              }
           ]
           
### If you want to create your own image of this project, please follow the below steps.
 - Clone the project using git clone.
 - Build the project using ``mvn clean package``
 - Navigate to the directory where Dockerfile resides.
 - Build image using ``docker build -t {name}:{tag} .``, provide the tag and name of the image that you want to give.
 - Tag the image and push it to your own docker hub.
 - Now change the docker compose file [here](https://github.com/getbharat/mongo-rest-example/blob/master/docker-compose.yml#L46), it should point to the image that you pushed.
 - Follow the steps mentioned in the bginning to run the containers.
