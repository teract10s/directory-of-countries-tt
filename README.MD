# **📚Directory of countries Project**

Welcome to the directory of countries project! This project is a Java-based web application built using Spring Boot,
Hibernate, Swagger and other technologies to create a robust online bookstore.

## **📝1. Introduction**

This project is a country directory that provides users with an endpoint to view country information. It is built 
using Java with a Spring Boot infrastructure using technologies such as Hibernate for database interaction, Swagger 
for API documentation. <br> With the start of program execution, all information from the resource: 
http://analityk1.com.ua:9111/api/reference/RiskCountries will be added to the application database. After that, when 
the user sends a request to receive information about the country, the server will check whether there is such a 
country in the database, if so, then you will receive a JSON response with the data. Or NOT_FOUND, if there is no 
country with such data in the database.

---

## **💻2. Technologies Used**

* Java 17
* Spring v3.1.4 (Boot, Web, JPA)
* Hibernate
* Docker 3.8
* Swagger
* Mapstruct

---

## **📃3. API Documentation**

### **Country Controller:**

| **HTTP method** | **Endpoint** | **Function**                                                                                                                                                                                                                                         |
|:---------------:|:------------:|:-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|       GET       | `/countries` | As a user you have to give country name(in cyrillic or latin) or country code in a path `?countryName=&countryCode=`. As a request you will get NOT_FOUND if we don't have info about this country or json if we have information about the country. |

---

## **🏁4. Getting Started**
If you want locally run this project follow these steps:
- Clone the repository from GitHub: `git clone https://github.com/teract10s/directory-of-countries-tt.git`
- Create a .env file and fill it with the necessary variables (an example of all the necessary variables in the .env.sample file)
- Run `mvn clean package` command
- Install and setup Docker: https://www.docker.com/products/docker-desktop/
- Run `docker-compose build && docker-compose up` command to build and start the Docker containers
- The project will be launched at the following link: http://localhost:8081
- Also you can use swagger for testing at the following link: http://localhost:8081/swagger-ui/index.html#
---