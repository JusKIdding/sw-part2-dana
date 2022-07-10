# Sunway Part 2 Asessment - Spring Boot Framework 
For Sunway Part 2 Asessment from candidate Dana

Please note:
The BE is developed from scratch using Spring Boot Framework. Experience is limited to maintenance of FE and BE systems.

I apologize if the codes doesn't look too clean or optimize according to Part 2 of the IT assessment. 
***
Please have:
1) maven
2) java 8
3) node.js
4) Postman (the program not the person - haha)
5) postgreSQL
6) vscode

Steps 
1) clone project to new folder
2) go to Customer_FE folder via cmd prompt
3) Enter command: " npm install "
4) Enter command: " ng s --open "__
This will open a new tab in browser for viewing/navigation

5) Open Customer folder with vscode
6) Open terminal and enter " mvn spring-boot:run ".
This will activate the Spring Boot project

7) To verify if the database and the Customer table is available, enter command " psql -U posgres " and enter the password (that user had first created when first installing postgreSQL)
8) In the same command prompt with psql, enter command: " \c customer "
9) In the same command prompt with psql, enter command: " SELECT * FROM customer; ". <br\>If it is working, user should be able to see 2 rows of data from the query.

10) Open Postman software
11) POST: http://localhost:8080/api/v1/customer
In the Body tab:
{
    "idNo":"333333-10-3333",
    "name":"Customer Name 3",
    "dob":"2003-03-03",
    "address":"address 3",
    "regDate":"2022-07-09"    
}

12) PUT: http://localhost:8080/api/v1/customer/1?idNo=000000100000&address=Changed 
In the Params tab:
KEY   VALUE
idNO  000000100000
address Changed Value

13) In the same command prompt with psql, enter command: " SELECT * FROM customer; ". The cust_id_key row with the value of 1 will have updated values.



***
Missing validation:
__FE__
1) DOB [Registration User Page]

Missing connection for FE to BE (due to lack of understanding despite successfully managed to test BE with Spring Boot framework)
Therefore, unable to INSERT and UPDATE as according to Part 2 assessment.

***
Reference:
1) Spring Boot Tutorial - https://youtu.be/9SGDpanrc8U
2) Spring Boot Full Stack with Angular | Full Course [2021]  https://youtu.be/Gx4iBLKLVHk
3) Integrating an Angular project with Spring Boot - https://medium.com/@majdasab/integrating-an-angular-project-with-spring-boot-e3a043b7307b
4) Stackoverflow forum [when encountering errors]
5) w3schools


***
todo:
1) Clean up codes/optimization
2) Get more practice on development side for FE to BE connection
