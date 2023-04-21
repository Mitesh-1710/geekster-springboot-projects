# Spring Boot Project User Management System.

- Frameworks and Language used :
  - Spring Boot (SNAPSHOT 3.0.5)
  - Java 17

- Data Flow :
  1. Controller
      - addUser : saves user into the database.
      - getUser : get user from the database based on selected user id.
      - getAllUser : get the list of users available in the database.
      - updateUser : updated user data in the database  based on selected user id.
      - deleteUser : delete user from the database based on selected user id.
  2. Services
      - addUser : saves user into the database.
      - getUser : get user from the database based on selected user id.
      - getAllUser : get the list of users available in the database.
      - updateUser : updated user data in the database  based on selected user id.
      - deleteUser : delete user from the database based on selected user id.
  3. Repository
      - save : saves user into the database.
      - findById : get user from the database based on selected user id.
      - findAll : get the list of users available in the database.
      - update : updated user data in the database  based on selected user id.
      - delete : delete user from the database based on selected user id.
  4. Database Design
      - Used HashMap to store userId as a key and user object as a velue.
   
- Data Structure used in your project :
  - List
  - HashMap

- Project Summary :
```
  This is a Spring Boot project of User Management System. User can register themselves by filling the required information.
  User can able to fetch their saved information , can able to update the information ,
  as well as can able to unregister themselves from the system if they want to.
```
