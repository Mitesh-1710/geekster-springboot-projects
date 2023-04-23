# Spring Boot Project Restaurant Management System.

- Frameworks and Language used :
  - Spring Boot (SNAPSHOT 3.0.6)
  - Java 17

- Data Flow :
  1. Controller
      - addRestaurant : This method is used to call the addRestaurant method of the service class to saves restaurant data into the database.
      - getRestaurant : This method is used to call the getRestaurant method of the service class to get restaurant data from the database based on selected restaurant id.
      - getAllRestaurants : This method is used to call the getAllRestaurants method of the service class to get the list of restaurants available in the database.
      - updateRestaurant : This method is used to call the updateRestaurant method of the service class to updated restaurant data in the database based on selected restaurant id.
      - deleteRestaurant :  This method is used to call the deleteRestaurant method of the service class to delete restaurant data from the database based on selected restaurant id.
      
  2. Services
      - addRestaurant : This method is used to call the save method of the repository class to saves restaurant data into the database.
      - getRestaurant : This method is used to call the findById method of the repository class to get restaurant data from the database based on selected restaurant id.
      - getAllRestaurants : This method is used to call the findAll method of the repository class to get the list of restaurants available in the database.
      - updateRestaurant : This method is used to call the update method of the repository class to updated restaurant data in the database based on selected restaurant id.
      - deleteRestaurant : This method is used to call the delete method of the repository class to delete restaurant from the database based on selected restaurant id.
      
  3. Repository
      - save : This method is used to saves restaurant data into the database.
      - findById : This method is used to get restaurant data from the database based on selected restaurant id.
      - findAll : This method is used to get the list of restaurants available in the database.
      - update : This method is used to updated restaurant data in the database based on selected restaurant id.
      - delete : This method is used to delete restaurant from the database based on selected restaurant id.
      
  4. Database Design
      - Used HashMap to store restaurantId as a key and restaurant object as a value.
   
- Data Structure used in your project :
  - List
  - HashMap

- Project Summary :
```
  This is a Spring Boot project of Restaurant Management System. Restaurants can register themselves by filling the required information.
  Restaurants can be able to fetch their saved information , can be able to update the information ,
  as well as can unregister themselves from the system if they want to.
```
