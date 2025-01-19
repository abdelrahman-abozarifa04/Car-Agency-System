

# 🚗 Car Agency System

Welcome to the **Car Agency System** project! This **Java-based** implementation utilizes **Object-Oriented Programming (OOP)** principles to simulate a car agency environment. The system effectively handles management tasks for employees, customers, cars, and car accessories, while offering various functionalities to ensure smooth operations and interaction.

---

## ⚙️ Key Features

### 🧑‍🤝‍🧑 Modeling People

- **Person Info Interface**:
  - Defines common attributes for all people in the system.

- **Person Class**:
  - Implements the **Person Info** interface.
  - Stores essential details like:
    - Name
    - Contact details
    - Address
  - Serves as the foundation class for both **customers** and **employees**.

- **Employee Class**:
  - Extends the **Person** class and includes:
    - Salary
    - Hire date
    - Employment status (active or not)
    - Unique employee ID (auto-generated)

- **Customer Class**:
  - Inherits from **Person** without adding extra fields, simplifying customer management.

### 🚙 Modeling Products

- **Products Class**:
  - The base class for products, containing:
    - Product name
    - Model year
    - List price
    - Quantity in stock
    - Availability status
    - Unique product ID

- **Cars Class**:
  - Inherits from **Products**.
  - Adds car-specific attributes:
    - Color
    - Number of seats

- **Car Accessories Class**:
  - Extends from **Products**.
  - Includes an **accessory category** attribute.

### 🔧 Main Class (`NewClass`)

- **Responsibilities**:
  - Handles the data of **employees, customers, cars,** and **car accessories**.
  - Provides core functionality such as:
    - Selling, renting, and returning cars
    - Selling car accessories
- **Data Storage**: 
  - Uses `ArrayLists` to manage data efficiently.
  - Features a simple **user interface** using `JOptionPane`.

### 🏠 Main Function (`carAgency`)

- **User Role Selection**:
  - Prompts the user to select their role: **System Admin** or **Customer**.

- **System Admin Features**:
  - Add new employees, cars, car accessories, and customers.
  - View records of employees, customers, cars, and accessories stored in text files.

- **Customer Features**:
  - Sign up as a new customer.
  - Browse and purchase cars.
  - Buy car accessories.
  - Rent a car.

- **File Handling**:
  - **Text file storage** for all entities: employees, customers, cars, and accessories.
  - Displays contents of these files on request.

- **User Interaction**:
  - Utilizes **Java Swing's `JOptionPane`** for smooth prompts and navigation within the system.

---

## 🛠️ Technologies Used

- **Language**: Java
- **Libraries**: Java Swing for user interface development

---

## 🚀 Getting Started

### 📝 Prerequisites

- A Java development environment (e.g., IntelliJ IDEA, Eclipse).
- Basic understanding of **Java** and **OOP principles**.

### 🖥️ Installation

1. **Clone the repository**:

    ```sh
    git clone https://github.com/abdelrahman-abozarifa04/car-agency-system.git
    ```

2. **Navigate to the project directory**:

    ```sh
    cd car-agency-system
    ```

3. **Open the project in your IDE**:

    - Open IntelliJ IDEA, Eclipse, or your preferred IDE to load the project.

### 🏃‍♂️ Usage

1. **Compile the project**: Use your IDE to compile the Java code.
2. **Run the application**: Execute the compiled Java application.
3. **Interact with the system**:
    - Select your role (admin or customer) and use corresponding features.
    - Manage records, view data, and complete transactions.

---

## 🤝 Contributing

We welcome contributions! Feel free to fork the repository, make enhancements, and submit a pull request.

---

## 📜 License

This project is licensed under the **MIT License**. For more details, check the [LICENSE](LICENSE) file.

---

## 📬 Contact

For questions, feedback, or suggestions, please reach out to [as0144549@gmail.com](mailto:as0144549@gmail.com).

Thank you for your interest in the **Car Agency System**! We hope it serves as an effective foundation for managing car agency data and streamlining customer interactions.
