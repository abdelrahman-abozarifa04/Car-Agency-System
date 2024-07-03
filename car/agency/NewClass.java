package car.agency;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class NewClass {

    private ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<CarAccessories> accessories = new ArrayList<>();
    private ArrayList<cars> cars = new ArrayList<>();

    public NewClass() {

    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addCar(cars car) {
        cars.add(car);
    }

    public void addCarAccessories(CarAccessories accessory) {
        accessories.add(accessory);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<cars> getCars() {
        return cars;
    }

    public List<CarAccessories> getAccessories() {
        return accessories;
    }

    public void saleCar(Customer customer, cars car, Employee employee) {
        if (car.isAvailable()) {
            car.setAvailable(false);

            JOptionPane.showMessageDialog(null, "The " + car.getProduct_name() + " car with model " + car.getModel_year()
                    + " is sold to " + customer.getFirst_name() + " " + customer.getLast_name()
                    + "\nEmployee name: " + employee.getFirst_name() + "    ID: " + employee.getId());
        } else {
            JOptionPane.showMessageDialog(null, "Sorry, Car not available for sale.");
        }
    }

    public void rentCar(Customer customer, cars car, Employee employee) {
        if (car.isAvailable()) {

            JOptionPane.showMessageDialog(null, "The " + car.getProduct_name() + " car with model " + car.getModel_year()
                    + " is rented to " + customer.getFirst_name() + " " + customer.getLast_name()
                    + "\nEmployee name: " + employee.getFirst_name() + "    ID: " + employee.getId());
                        car.setAvailable(false);
        } else {
            JOptionPane.showMessageDialog(null, "Sorry, Car not available for rent.");
        }
    }

    public void returnCar(Customer customer, cars car) {

        car.setAvailable(true);
        JOptionPane.showMessageDialog(null, "The " + car.getProduct_name() + " car with model " + car.getModel_year()
                + " is return to Agency ");
    }

    public void saleCarAccessories(Customer customer, CarAccessories accessories, Employee employee) {
        if (accessories.isAvailable()) {
            
            JOptionPane.showMessageDialog(null, "The " + accessories.getProduct_name()
                    + " is sold to " + customer.getFirst_name() + " " + customer.getLast_name()
                    + "\nEmployee name: " + employee.getFirst_name() + "    ID: " + employee.getId());
            accessories.setAvailable(false); 
        } else {
            JOptionPane.showMessageDialog(null, "Sorry, Car not available for sale.");
        }
    }
}
