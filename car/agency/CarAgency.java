package car.agency;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.*;
import javax.swing.JOptionPane;

public class CarAgency {

    public static void main(String[] args) {

        NewClass agency = new NewClass();

        Customer customer1 = new Customer("Ahmed", "Mohamed", "01097457086", "AhmedMohamed@gmail.com", "Fesal", "Giza", " +40 252321");
        agency.addCustomer(customer1);

        cars car2 = new cars("red", 4, "Honda_Tusan", 2020, 200000.253, 10, true);
        agency.addCar(car2);

        Employee employee2 = new Employee(4000, 2020, true, "Ali", "Mansor", "01279025412", "AliMansor@gmail.com", "Naser city", "cairo", " +20 225325");
        agency.addEmployee(employee2);

        CarAccessories Accessorie1 = new CarAccessories("accessroires", "mirorr", 2023, 422.30, 8, true);
        agency.addCarAccessories(Accessorie1);

        try {
            
                try (FileWriter employeeWriter = new FileWriter("employees.txt")) {
                    employeeWriter.write("Employees:\n");
                    for (Employee employee : agency.getEmployees()) {
                        employeeWriter.write(employee.toString() + "\n");
                    }
                }

                try (FileWriter customerWriter = new FileWriter("customers.txt")) {
                    customerWriter.write("Customers:\n");
                    for (Customer customer : agency.getCustomers()) {
                        customerWriter.write(customer.toString() + "\n");
                    }
                }
                try (FileWriter accessoryWriter = new FileWriter("accessories.txt")) {
                    accessoryWriter.write("CarAccessories:\n");
                    for (CarAccessories accessory : agency.getAccessories()) {
                        accessoryWriter.write(accessory.toString() + "\n");
                    }
                }

                try (FileWriter carWriter = new FileWriter("cars.txt")) {
                    carWriter.write("Cars:\n");
                    for (cars car : agency.getCars()) {
                        carWriter.write(car.toString() + "\n");
                    }
                }

               
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving data to file:\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        boolean running = true;
        while (running) {
            int choice = Integer.parseInt(JOptionPane.showInputDialog(null, "Welcome to our System.\nIf you are System Admin, choose: 1\nIf you are Customer, choose: 2"));
            if (choice == 1) {

                int choice2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose an action:\n"
                        + "1. Add Employee\n"
                        + "2. Add Car\n"
                        + "3. Add Accessory\n"
                        + "4. Add Customer\n"
                        + "5. Access Data Files\n"
                        + "6. Exit"));

                switch (choice2) {

                    case 1:
                        int employee_num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter The Number Of Employees You Want To Add: "));
                        for (int i = 0; i < employee_num; i++) {

                            Employee employee1 = new Employee(
                                    Double.parseDouble(JOptionPane.showInputDialog("Enter salary")),
                                    Integer.parseInt(JOptionPane.showInputDialog("Enter start year")),
                                    Boolean.parseBoolean(JOptionPane.showInputDialog("Enter active (true/false)")),
                                    JOptionPane.showInputDialog("Enter first name"),
                                    JOptionPane.showInputDialog("Enter last name"),
                                    JOptionPane.showInputDialog("Enter ID"),
                                    JOptionPane.showInputDialog("Enter email"),
                                    JOptionPane.showInputDialog("Enter address"),
                                    JOptionPane.showInputDialog("Enter city"),
                                    JOptionPane.showInputDialog("Enter postal code"));
                            agency.addEmployee(employee1);
                            try {
                                int confirmation = JOptionPane.showConfirmDialog(null, "Do you want to save data to file?", "Save Data", JOptionPane.YES_NO_OPTION);
                                if (confirmation == JOptionPane.YES_OPTION) {

                                    try (FileWriter employeeWriter = new FileWriter("employees.txt", true)) {
                                        employeeWriter.write("Employees:\n");
                                        for (Employee employee : agency.getEmployees()) {
                                            employeeWriter.write(employee.toString() + "\n");
                                        }
                                    }

                                    JOptionPane.showMessageDialog(null, "Data saved to file successfully!");
                                }
                            } catch (IOException e) {
                                JOptionPane.showMessageDialog(null, "Error saving data to file:\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        break;
                    case 2:

                        int car_num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter The Number Of cars You Want To Add: "));

                        for (int i = 0; i < car_num; i++) {

                            cars car1 = new cars(
                                    JOptionPane.showInputDialog("Enter car color "),
                                    Integer.parseInt(JOptionPane.showInputDialog("Enter Number Of seats")),
                                    JOptionPane.showInputDialog("Enter Car Brand"),
                                    Integer.parseInt(JOptionPane.showInputDialog("Enter The Car Model Year")),
                                    Double.parseDouble(JOptionPane.showInputDialog("Enter price")),
                                    Integer.parseInt(JOptionPane.showInputDialog("Enter The Quantity Of This car")),
                                    Boolean.parseBoolean(JOptionPane.showInputDialog("Enter available for car (true/false)"))
                            );
                            agency.addCar(car1);
                            try {
                                int confirmation = JOptionPane.showConfirmDialog(null, "Do you want to save data to file?", "Save Data", JOptionPane.YES_NO_OPTION);
                                if (confirmation == JOptionPane.YES_OPTION) {

                                    try (FileWriter carWriter = new FileWriter("cars.txt", true)) {
                                        carWriter.write("Cars:\n");
                                        for (cars car : agency.getCars()) {
                                            carWriter.write(car.toString() + "\n");
                                        }
                                    }

                                    JOptionPane.showMessageDialog(null, "Data saved to file successfully!");
                                }
                            } catch (IOException e) {
                                JOptionPane.showMessageDialog(null, "Error saving data to file:\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        break;
                    case 3:

                        int CarAccessorie_num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter The Number Of CarAccessorie You Want To Add: "));

                        for (int i = 0; i < CarAccessorie_num; i++) {

                            CarAccessories Accessorie = new CarAccessories(
                                    JOptionPane.showInputDialog("Enter The Category "),
                                    JOptionPane.showInputDialog("Enter Accessorie Name"),
                                    Integer.parseInt(JOptionPane.showInputDialog("Enter Accessorie Model Year")),
                                    Double.parseDouble(JOptionPane.showInputDialog("Enter The Accesssorie Price")),
                                    Integer.parseInt(JOptionPane.showInputDialog("Enter Quantity Of This Accessorie")),
                                    Boolean.parseBoolean(JOptionPane.showInputDialog("available for Accessorie (true/false)"))
                            );

                            agency.addCarAccessories(Accessorie);
                            try {
                                int confirmation = JOptionPane.showConfirmDialog(null, "Do you want to save data to file?", "Save Data", JOptionPane.YES_NO_OPTION);
                                if (confirmation == JOptionPane.YES_OPTION) {

                                    try (FileWriter accessoryWriter = new FileWriter("accessories.txt", true)) {
                                        accessoryWriter.write("CarAccessories:\n");
                                        for (CarAccessories accessory : agency.getAccessories()) {
                                            accessoryWriter.write(accessory.toString() + "\n");
                                        }
                                    }
                                    JOptionPane.showMessageDialog(null, "Data saved to file successfully!");
                                }
                            } catch (IOException e) {
                                JOptionPane.showMessageDialog(null, "Error saving data to file:\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        break;
                    case 4:
                        int customer_num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter The Number Of Customers You Want To Add: "));

                        for (int i = 0; i < customer_num; i++) {

                            Customer customer2 = new Customer(
                                    JOptionPane.showInputDialog("Enter first name"),
                                    JOptionPane.showInputDialog("Enter last name"),
                                    JOptionPane.showInputDialog("Enter Phone Number"),
                                    JOptionPane.showInputDialog("Enter email"),
                                    JOptionPane.showInputDialog("Enter address"),
                                    JOptionPane.showInputDialog("Enter city"),
                                    JOptionPane.showInputDialog("Enter postal code")
                            );
                            agency.addCustomer(customer2);
                            try {
                                int confirmation = JOptionPane.showConfirmDialog(null, "Do you want to save data to file?", "Save Data", JOptionPane.YES_NO_OPTION);
                                if (confirmation == JOptionPane.YES_OPTION) {
                                    try (FileWriter customerWriter = new FileWriter("customers.txt", true)) {
                                        customerWriter.write("Customers:\n");
                                        for (Customer customer : agency.getCustomers()) {
                                            customerWriter.write(customer.toString() + "\n");
                                        }
                                    }

                                    JOptionPane.showMessageDialog(null, "Data saved to file successfully!");
                                }
                            } catch (IOException e) {
                                JOptionPane.showMessageDialog(null, "Error saving data to file:\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        break;
                    case 5:

                        int choice3 = JOptionPane.showOptionDialog(null, "Which file do you want to view?", "View Data",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                                new String[]{"Employees", "Customers", "Accessories", "Cars"}, "Employees");

                        switch (choice3) {
                            case 0:
                                readFileAndDisplay("employees.txt");
                                break;
                            case 1:
                                readFileAndDisplay("customers.txt");
                                break;
                            case 2:
                                readFileAndDisplay("accessories.txt");
                                break;
                            case 3:
                                readFileAndDisplay("cars.txt");
                                break;
                        }
                    case 6:
                        break;

                }

            } else {
                boolean run = true;
                while (run) {
                    int choice4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Welcome. Choose:\n1. Sign in as a new Customer\n2. Buy a new Car\n3. Buy Car Accessories\n4. Rent a Car\n5. Return The Rented Car\n6. Exit"));

                    switch (choice4) {

                        case 1:
                            Customer customer2 = new Customer(
                                    JOptionPane.showInputDialog("Enter first name"),
                                    JOptionPane.showInputDialog("Enter last name"),
                                    JOptionPane.showInputDialog("Enter ID"),
                                    JOptionPane.showInputDialog("Enter email"),
                                    JOptionPane.showInputDialog("Enter address"),
                                    JOptionPane.showInputDialog("Enter city"),
                                    JOptionPane.showInputDialog("Enter postal code")
                            );
                            agency.addCustomer(customer2);
                            try {
                                int confirmation = JOptionPane.showConfirmDialog(null, "Do you want to save data to file?", "Save Data", JOptionPane.YES_NO_OPTION);
                                if (confirmation == JOptionPane.YES_OPTION) {

                                    try (FileWriter customerWriter = new FileWriter("customers.txt", true)) {
                                        customerWriter.write("Customers:\n");
                                        for (Customer customer : agency.getCustomers()) {
                                            customerWriter.write(customer.toString() + "\n");
                                        }
                                    }

                                    JOptionPane.showMessageDialog(null, "Data saved to file successfully!");
                                }
                            } catch (IOException e) {
                                JOptionPane.showMessageDialog(null, "Error saving data to file:\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        case 2:

                            readFileAndDisplay("cars.txt");

                            int choicen_id = Integer.parseInt(JOptionPane.showInputDialog(null, "please Enter The Car Id You Want To Buy :"));
                            agency.saleCar(customer1, car2, employee2);
                            break;
                        case 3:
                            readFileAndDisplay("accessories.txt");
                            choicen_id = Integer.parseInt(JOptionPane.showInputDialog(null, "please Enter The CarAccessorie Id You Want To Buy :"));
                            agency.saleCarAccessories(customer1, Accessorie1, employee2);
                            break;
                        case 4:
                            readFileAndDisplay("cars.txt");
                            choicen_id = Integer.parseInt(JOptionPane.showInputDialog(null, "please Enter The Car Id You Want To Rent :"));
                            agency.rentCar(customer1, car2, employee2);
                            break;
                        case 5:
                            choicen_id = Integer.parseInt(JOptionPane.showInputDialog(null, "please Enter The Car Id You Want To Return :"));
                            agency.returnCar(customer1, car2);
                            break;
                        case 6:
                            run = false;

                    }
                }
            }

            int continueChoice = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Continue?", JOptionPane.YES_NO_OPTION);
            if (continueChoice == JOptionPane.NO_OPTION) {
                running = false;
            }

        }
        JOptionPane.showMessageDialog(null, "Exiting the system...");

    }

    private static void readFileAndDisplay(String filename) {
        StringBuilder fileContents = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                fileContents.append(line).append("\n");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(null, fileContents.toString(), filename, JOptionPane.INFORMATION_MESSAGE);
    }

}
