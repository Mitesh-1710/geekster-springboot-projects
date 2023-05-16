# Spring Boot Project Employee Management System.

- Frameworks and Language used :
  - Spring Boot `SNAPSHOT 3.0.6`
  - Java 17

- Data Flow :
  1. Controller
      <br/>
      > Student
      - createStudent : This method is used to call the createStudent method of the service class to saves student into the database.
      - getStudentById : This method is used to call the getStudentById method of the service class to get student from the database based on selected student id.
      - getAllStudents : This method is used to call the getAllStudents method of the service class to get the list of students available in the database.
      - updateStudent : This method is used to call the updateStudent method of the service class to updated student data in the database based on selected student id.
      - deleteStudent :  This method is used to call the deleteStudent method of the service class to delete student from the database based on selected student id.
        
      <br/>
      
      > Course
      - createCourse : This method is used to call the createCourse method of the service class to saves course into the database.
      - getCourseById : This method is used to call the getCourseById method of the service class to get course from the database based on selected course id.
      - getAllCourses : This method is used to call the getAllCourses method of the service class to get the list of courses available in the database.
      - updateCourse : This method is used to call the updateCourse method of the service class to updated course data in the database based on selected course id.
      - deleteCourse :  This method is used to call the deleteCourse method of the service class to delete course from the database based on selected course id.
        
      <br/>
       
      > Book
      - createBook : This method is used to call the createBook method of the service class to saves book into the database.
      - getBookById : This method is used to call the getBookById method of the service class to get book from the database based on selected book id.
      - getAllBooks : This method is used to call the getAllBooks method of the service class to get the list of books available in the database.
      - updateBook : This method is used to call the updateBook method of the service class to updated book data in the database based on selected book id.
      - deleteBook :  This method is used to call the deleteBook method of the service class to delete book from the database based on selected book id.
        
      <br/>
      
      > Laptop
      - createLaptop : This method is used to call the createLaptop method of the service class to saves laptop into the database.
      - getLaptopById : This method is used to call the getLaptopById method of the service class to get laptop from the database based on selected laptop id.
      - getAllLaptops : This method is used to call the getAllLaptops method of the service class to get the list of laptops available in the database.
      - updateLaptop : This method is used to call the updateLaptop method of the service class to updated laptop data in the database based on selected laptop id.
      - deleteLaptop :  This method is used to call the deleteLaptop method of the service class to delete laptop from the database based on selected laptop id.
        
  2. Services
      <br/>
      > Student
      - createStudent : This method is used to call the save method of the repository class to saves student into the database.
      - getStudentById : This method is used to call the findById method of the repository class to get student from the database based on selected student id.
      - getAllStudents : This method is used to call the findAll method of the repository class to get the list of students available in the database.
      - updateStudent : This method is also used to call the save method of the repository class to updated student data in the database based on selected student id.
      - deleteStudent : This method is used to call the deleteById method of the repository class to delete student from the database based on selected student id.
      
      <br/>
      
      > Course
      - createCourse : This method is used to call the save method of the repository class to saves course into the database.
      - getCourseById : This method is used to call the findById method of the repository class to get course from the database based on selected course id.
      - getAllCourses : This method is used to call the findAll method of the repository class to get the list of courses available in the database.
      - updateCourse : This method is also used to call the save method of the repository class to updated course data in the database based on selected course id.
      - deleteCourse : This method is used to call the deleteById method of the repository class to delete course from the database based on selected course id.
      
      <br/>
       
      > Book
      - createBook : This method is used to call the save method of the repository class to saves book into the database.
      - getBookById : This method is used to call the findById method of the repository class to get book from the database based on selected book id.
      - getAllBooks : This method is used to call the findAll method of the repository class to get the list of books available in the database.
      - updateBook : This method is also used to call the save method of the repository class to updated book data in the database based on selected book id.
      - deleteBook : This method is used to call the deleteById method of the repository class to delete book from the database based on selected book id.
      
      <br/>
      
      > Laptop
      - createLaptop : This method is used to call the save method of the repository class to saves laptop into the database.
      - getLaptopById : This method is used to call the findById method of the repository class to get laptop from the database based on selected laptop id.
      - getAllLaptops : This method is used to call the findAll method of the repository class to get the list of laptops available in the database.
      - updateLaptop : This method is also used to call the save method of the repository class to updated laptop data in the database based on selected laptop id.
      - deleteLaptop : This method is used to call the deleteById method of the repository class to delete laptop from the database based on selected laptop id.
      
  3. Repository
      - Used `Predefined` JpaRepository methods such as findById , save , deleteById , findAll for basic CRUD operations.
      
  4. Database Design
      - Used MySQL Database
      ```
       table student (
       	id bigint not null auto_increment,
        	country varchar(255) not null,
        	district varchar(255) not null,
        	landmark varchar(255) not null,
        	state varchar(255) not null,
	        zipcode varchar(255) not null,
	        age varchar(255) not null,
	        branch varchar(255) not null,
	        department varchar(255) not null,
	        name varchar(255) not null,
	        phone_number varchar(255) not null,
        	primary key (id)
    	)
    	
    	table course (
       	id bigint not null auto_increment,
	        description varchar(255) not null,
	        duration varchar(255) not null,
	        title varchar(255) not null,
	        primary key (id)
    	)
    	
    	table laptop (
       	id bigint not null auto_increment,
        	brand varchar(255) not null,
	        name varchar(255) not null,
	        price integer not null,
	        student_id bigint not null,
	        primary key (id)
    	)
    	
    	table book (
       	id bigint not null auto_increment,
	        author varchar(255) not null,
	        description varchar(255) not null,
	        price varchar(255) not null,
	        title varchar(255) not null,
	        student_id bigint,
	        primary key (id)
    	)
      ```
   
- Data Structure used in project :
  - List

- Project Summary :
```
  This is a Spring Boot project for practicing mappings of different entity. We can perform basic CRUD operations on Student , Laptop , Course and Book entity.
```
