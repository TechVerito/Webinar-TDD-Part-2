## Test Driven Development Outside In Approach

This demo project is a not full web application. It just has service and DAO layers. 
While developing the project, test driving is started at service layer and functionality for DAO layer and 
domain object was drilled out to prove the benefits of outside in and unit testing in isolation.

Outside in starts at Service layer as service layer is core business logic is built in isolation 
without worrying about DAO implementation and DAO api contract to be discovered naturally.
#### User Story 1: User registration

As a user I want to register my account on online shopping cart website so that I can shop online

##### Acceptance criteria 1

Given username does not already exist in the system
When registration request is sent with details of username, password, first name, last name
Then user should be registered in the system with provided details

##### Acceptance criteria 2

Given username already exist in the system
When registration request is sent with username, password, first name, last name
Then report error "Username already exists"

### User Story 2: Show full name
As a user I want my full name to be displayed on online shopping cart website

##### Acceptance criteria 1
Given username already exists in the system
And username is provided in the request
Then return full name of the user for requested username