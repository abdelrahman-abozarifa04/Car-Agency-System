package car.agency;

public class Employee extends person {

    double salary;
    private static int employee_id = 1;
    private int hired_date;
    private boolean active;
    private int id;

    public Employee() {

    }

    public Employee(double salary, int hired_date, boolean active, String first_name, String last_name, String phone, String email, String street, String city, String zip_code) {
        super(first_name, last_name, phone, email, street, city, zip_code);
        this.salary = salary;
        this.hired_date = hired_date;
        this.active = active;
        this.id = employee_id;
        employee_id++;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public int getHired_date() {
        return hired_date;
    }

    public void setHired_date(int hired_date) {
        this.hired_date = hired_date;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Employee{" + " first_name=" + getFirst_name() + ", last_name=" + getLast_name() + ", id=" + getId() + ", phone=" + getPhone() + ", email=" + getEmail() + ", street=" + getStreet() + ", city=" + getCity() + ", zip_code=" + getZip_code() + ", salary=" + salary + ", hired_date=" + hired_date + ", active=" + active + '}';

    }

}
