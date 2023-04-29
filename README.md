# Spring Boot Project User Management System.

- Frameworks and Language used :
  - Spring Boot (SNAPSHOT 3.0.6)
  - Java 17

- Data Flow :
  1. Controller
      - addUser : This method is used to call the addUser method of the service class to saves user into the database.
      - getUser : This method is used to call the getUser method of the service class to get user from the database based on selected user id.
      - getAllUser : This method is used to call the getAllUser method of the service class to get the list of users available in the database.
      - updateUser : This method is used to call the updateUser method of the service class to updated user data in the database based on selected user id.
      - deleteUser :  This method is used to call the deleteUser method of the service class to delete user from the database based on selected user id.
      
  2. Services
      - addUser : This method is used to call the save method of the repository class to saves user into the database.
      - getUser : This method is used to call the findById method of the repository class to get user from the database based on selected user id.
      - getAllUser : This method is used to call the findAll method of the repository class to get the list of users available in the database.
      - updateUser : This method is used to call the update method of the repository class to updated user data in the database based on selected user id.
      - deleteUser : This method is used to call the delete method of the repository class to delete user from the database based on selected user id.
      
  3. Repository
      - save : This method is used to saves user into the database.
      - findById : This method is used to get user from the database based on selected user id.
      - findAll : This method is used to get the list of users available in the database.
      - update : This method is used to updated user data in the database  based on selected user id.
      - delete : This method is used to delete user from the database based on selected user id.
      
  4. Database Design
      - Used HashMap to store userId as a key and user object as a value.
   
- Data Structure used in your project :
  - List
  - HashMap

- Project Summary :
```
  This is a Spring Boot project of User Management System. User can register themselves by filling the required information.
  Upon registration basic validation applied to filled data if all the validation passes then and only then a data is registered into the system.
  User can able to fetch their saved information , can able to update the information ,
  as well as can able to unregister themselves from the system if they want to.
```
