
Project Overview
This project is an Object-Oriented Programming (OOP) implementation of a car agency system in Java. The system models various real-world entities such as employees, customers, cars, and car accessories, providing functionalities for managing and interacting with these entities.

Key Features
Modeling People
Person Info Interface:

Defines common attributes for people.
Person Class:

Implements the Person Info interface.
Stores basic information like name, contact details, and address.
Serves as a base class for both customers and employees.
Employee Class:

Extends Person to include:
Salary
Hire date
Employment status (active or not)
Unique employee ID (automatically generated)
Customer Class:

Extends Person without adding additional fields.
Modeling Products
Products Class:

Base class storing common properties like:
Product name
Model year
List price
Quantity in stock
Availability status
Unique product ID
Cars Class:

Inherits from Products.
Adds attributes specific to cars:
Color
Number of seats
Car Accessories Class:

Inherits from Products.
Adds an attribute for the accessory category.
Main Class (NewClass)
Manages information about employees, customers, cars, and car accessories.
Provides operations for selling, renting, and returning cars, as well as selling accessories.
Uses ArrayLists to store data.
Implements a simple user interface using JOptionPane.
Main Function (carAgency)
User Role Selection:

Prompts the user to choose between system admin or customer roles.
System Admin Features:

Adding new employees, cars, car accessories, and customers.
Viewing the contents of employee, customer, accessory, and car files.
Customer Features:

Sign up as a new customer.
View available cars and initiate purchase.
Buy car accessories.
Rent a car.
File Handling:

Uses text files to store data for employees, customers, cars, and accessories.
Includes a function to read and display the contents of specified files.
User Interaction:

Uses Java Swing's JOptionPane for prompts, choices, and displaying information.
Key Points
Provides basic functionality for managing car agency data and customer interactions.
Some features, like buying accessories and renting cars, are not yet implemented.
Could benefit from error handling, input validation, and more structured data organization.
Technologies Used
Language: Java
Libraries: Java Swing for user interface
