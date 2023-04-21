# Spring Boot Project for Counting Visitors on a URL.

- Frameworks and Language used :
  - Spring Boot (SNAPSHOT 3.0.5)
  - Java 17

- Data Flow :
  1. Controller
      - getHitCount : This method is used to call the getHitCount method of service class to get the total number of hits made by all the user from the database.
      - getHitCountByUsername : This method is used to call the getHitCountByUsername method of service class to get the total number of hits made by a single user from the database.
     
  2. Services
      - getHitCount : This method is used to call the getCount method of repository class get the total number of hits made by all the user from the database.
      - getHitCountByUsername :  This method is used to call the getCountByUsernmae method of repository class get the total number of hits made by a single user from the database.
      
  3. Repository
      - getCount : This method is used to fetch the total number of hits made by all the user from the database.
      - getCountByUsernmae : This method is used to fetch the total number of hits made by a single user from the database.
      
  4. Database Design
      - Used HashMap to store username as a key and visitor object as a value.
   
- Data Structure used in your project :
  - HashMap

- Project Summary :
```
  This is a Spring Boot project for counting visitors on a particular url. We can get the total number of hits made by all the users
  as well as the total number of hits made by a single user on the url.
```
