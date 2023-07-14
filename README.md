# :popcorn: CineWave :popcorn:
### Project descriprion:

The CineWave is a web application that allows users to search for movies,
to make order, to choose cinema-halls, etc. So lets start!

## :zap:App features:zap:
- register as a user/admin
- add/find a user by email
- add/get by id/get all movies or cinema halls
- complete/get order history
- add/find by user/clear the shopping cart

#### ⚠️You need to be registered as admin to be able to do all CRUD operations with cinema halls, moveis, movie sessions. If you are registered as a user you will be able to add movie sessions to shopping cart, check order histor and compelte orders

## 📁  Project structure 📁 
3 tier architecture 
- DAO ➤ all interaction with DataBase
- SERVICE ➤ all busines-logic
- Controller ➤ work with WEB


## 🔧 Technologies 🔧
- Java 17
- Spring framework(Security/Core/WebMvc)
- Hibernate 5.6.14.Final
- Apache Maven 4.0.0
- Json
- Jackson
- HQL
- MySql
- Apache Tomcat 9.0.50

## :question: How to use :question:
- Change data in `resources/db.properties`
``` code
db.driver=YOUR_DRIVER
db.url=YOUR_URL
db.user=YOUR_USERNAME
db.password=YOUR_PASSWORD
```
- Add and configure `Apache Tomcat 9.0.50`
- Run the project
- And now you can login with paramethers admin@gmail.com:admin as admin
or user@gmail.com:user as user
- You can change this paramethers in `util.DataInizializer`

Change this to login as admin
```java 
userAdmin.setEmail("admin@gmail.com");
userAdmin.setPassword("admin");
```
Change this to login as user
```java
userUser.setEmail("user@gmail.com");
userUser.setPassword("user");
```
