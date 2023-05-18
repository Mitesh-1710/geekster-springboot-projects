# Spring Boot Project Todo App.

- Frameworks and Language used :
  - Spring Boot (SNAPSHOT 3.0.6)
  - Java 17

- Data Flow :
  1. Controller
      - addTodo : This method is used to call the addTodo method of the service class to saves todo into the database.
      - getAllTodos : This method is used to call the getAllTodos method of the service class to get the list of todos available in the database.
      - updateTodo : This method is used to call the updateTodo method of the service class to updated todo data in the database based on selected todo id.
      - deleteTodo :  This method is used to call the deleteTodo method of the service class to delete todo from the database based on selected todo id.
      
  2. Services
      - addTodo : This method is used to call the save method of the repository class to saves todo into the database.
      - getAllTodos : This method is used to call the findAll method of the repository class to get the list of todos available in the database.
      - updateTodo : This method is used to call the update method of the repository class to updated todo data in the database based on selected todo id.
      - deleteTodo : This method is used to call the delete method of the repository class to delete todo from the database based on selected todo id.
      
  3. Repository
      - save : This method is used to saves todo into the database.
      - findAll : This method is used to get the list of todos available in the database.
      - update : This method is used to updated todo data in the database  based on selected todo id.
      - delete : This method is used to delete todo from the database based on selected todo id.
      
  4. Database Design
      - Used HashMap to store todoId as a key and todo object as a value.
   
- Data Structure used in your project :
  - List
  - HashMap

- Project Summary :
```
  This is a Spring Boot project of Todo App. We can create Todos by filling the required information.
  Upon creation/save Todo, basic validation applied to filled data if all the validation passes then and only then a Todo is stored into the system.
  We can able to fetch all the saved todo information , can able to update the information ,
  as well as can able to delete todos from the system if we want to.
```
