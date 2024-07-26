# Car Agency System

Welcome to the Car Agency System project! This Java-based implementation employs Object-Oriented Programming (OOP) principles to model a car agency environment. The system manages various entities such as employees, customers, cars, and car accessories, providing functionalities for efficient management and interaction.

## Key Features

### Modeling People

- **Person Info Interface:**
  - Defines common attributes for people.
  
- **Person Class:**
  - Implements the Person Info interface.
  - Stores basic information like name, contact details, and address.
  - Serves as a base class for both customers and employees.

- **Employee Class:**
  - Extends Person to include:
    - Salary
    - Hire date
    - Employment status (active or not)
    - Unique employee ID (automatically generated)

- **Customer Class:**
  - Extends Person without adding additional fields.

### Modeling Products

- **Products Class:**
  - Base class storing common properties like:
    - Product name
    - Model year
    - List price
    - Quantity in stock
    - Availability status
    - Unique product ID

- **Cars Class:**
  - Inherits from Products.
  - Adds attributes specific to cars:
    - Color
    - Number of seats

- **Car Accessories Class:**
  - Inherits from Products.
  - Adds an attribute for the accessory category.

### Main Class (NewClass)

- Manages information about employees, customers, cars, and car accessories.
- Provides operations for:
  - Selling, renting, and returning cars
  - Selling accessories
- Uses `ArrayLists` to store data.
- Implements a simple user interface using `JOptionPane`.

### Main Function (carAgency)

- **User Role Selection:**
  - Prompts the user to choose between system admin or customer roles.

- **System Admin Features:**
  - Adding new employees, cars, car accessories, and customers.
  - Viewing the contents of employee, customer, accessory, and car files.

- **Customer Features:**
  - Sign up as a new customer.
  - View available cars and initiate a purchase.
  - Buy car accessories.
  - Rent a car.

- **File Handling:**
  - Uses text files to store data for employees, customers, cars, and accessories.
  - Includes a function to read and display the contents of specified files.

- **User Interaction:**
  - Utilizes Java Swing's `JOptionPane` for prompts, choices, and displaying information.

## Technologies Used

- **Language:** Java
- **Libraries:** Java Swing for user interface

## Getting Started

### Prerequisites

- A Java development environment (e.g., IntelliJ IDEA, Eclipse).
- Basic knowledge of Java and OOP principles.

### Installation

1. **Clone the repository:**

    ```sh
    git clone https://github.com/abdelrahman-abozarifa04/car-agency-system.git
    ```

2. **Navigate to the project directory:**

    ```sh
    cd car-agency-system
    ```

3. **Open the project in your IDE:**

    - Open IntelliJ IDEA, Eclipse, or your preferred IDE and load the project.

### Usage

1. **Compile the Project:** Use your IDE to compile the Java source code.
2. **Run the Application:** Execute the compiled application.
3. **Interact with the System:**
    - Choose a user role (admin or customer) and access the corresponding features.
    - Manage records, view data, and perform transactions as specified.

## Contributing

Contributions are welcome! Fork this repository, make your enhancements, and submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For any questions or suggestions, please contact [as0144549@gmail.com](mailto:as0144549@gmail.com).

Thank you for your interest in the Car Agency System project! We hope it provides a solid foundation for managing car agency data and customer interactions.
