# Spring Boot Project User Management System.

- Frameworks and Language used :
  - Spring Boot `SNAPSHOT 3.0.6`
  - Java 17

- Data Flow :
  1. Controller
      <br/>
      - addJob : This method is used to call the addJob method of the service class to save the job data into the database.
      - updateJobById : This method is used to call the updateJobById method of the service class to updated the job data into the database based on selected job id.
      - deleteJobById : This method is used to call the deleteJobById method of the service class to delete the job from the database based on selected job id.
      - getAllJobs : This method is used to call the getAllJobs method of the service class to get the list of jobs data available in the database.
      - getJobById :  This method is used to call the getJobById method of the service class to get the job data from the database based on selected job id.
      - getJobsByTitle : This method is used to call the getJobsByTitle method of the service class to get the list of job data available in the database based on selected job title.
      - getJobsBySalaryGreaterThan : This method is used to call the getJobsBySalaryGreaterThan method of the service class to get the list of jobs data available in the database where job salary is greater than selected job salary.
      - getJobsByAppliedDate : This method is used to call the getJobsByAppliedDate method of the service class to get the list of jobs data available in the database based on selected job applied date.
      - getJobsByKeyword : This method is used to call the getJobsByKeyword method of the service class to get the list of jobs data available in the database based on selected keyword.
      
  2. Services
      <br/>
      - addJob : This method is used to call the save method of the repository class to save the job data into the database.
      - updateJobById :  This method is also used to call the save method of the repository class to updated the job into the database based on selected job id.
      - deleteJobById : This method is used to call the deleteById method of the repository class to delete the job data from the database based on selected job id.
      - getAllJobs : This method is used to call the findAll method of the repository class to get the list of jobs data available in the database. 
      - getJobById :  This method is used to call the findById method of the repository class to get the job data from the database based on selected job id.
      - getJobsByTitle : This method is used to call the findAllByTitle method of the repository class to get the list of jobs data available in the database based on selected job title.
      - getJobsBySalaryGreaterThan : This method is used to call the findAllBySalaryGreaterThan method of the repository class to get the list of jobs data available in the database where job salary is greater than selected job salary.
      - getJobsByAppliedDate : This method is used to call the findAllByAppliedDate method of the repository class to get the list of jobs data available in the database based on selected job applied date.
      - getJobsByKeyword : This method is used to call the findAll method of the repository class to get the list of jobs available in the database then after based on defined business logic a list of filtered jobs based on keyword is returned.
      
  3. Repository
      - Used `Predefined` JpaRepository methods such as findById , save , deleteById , findAll for basic CRUD operations.
        
      - findAllByTitle `Userdefined` : This method is used to return the list of jobs based on selected job title.
      - findAllBySalaryGreaterThan `Userdefined` : This method is used to return the list of jobs where job salary is greater than selected job salary.
      - findAllByAppliedDate `Userdefined` : This method is used to return the list of jobs based on selected job applied date.
      
  4. Database Design
      - Used H2 Database
      ```
		table job (
        	job_id bigint not null,
        	applied_date date not null,
        	company_name varchar(255) not null,
        	description varchar(255) not null,
        	employer_name varchar(255) not null,
        	job_type varchar(255) not null,
        	location varchar(255) not null,
        	salary float(53) not null,
        	title varchar(255) not null,
        	primary key (job_id)
    	)
      ```
   
- Data Structure used in project :
  - List

- Project Summary :
```
  This is a Spring Boot project of Job Search Portal. Companies can register their jobs data by filling the required information.
  Upon registration basic validation applied to filled data if all the validation passes then and only then a data is registered into the portal.
  Companies can able to fetch their saved job information , can able to update the information ,
  as well as can able to unregister/delete the job data from the portal if they want to.
  Also using this portal candidates can able search for their required jobs based on job's title , date , salary and keyword. Here, keyword will be
  matched against the job description then, jobs data will be fetched.
```
