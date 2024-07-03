package car.agency;

public class Customer extends person {

    public Customer() {
    }

    public Customer(String first_name, String last_name, String phone, String email, String street, String city, String zip_code) {
        super(first_name, last_name, phone, email, street, city, zip_code);
    }

    @Override
    public String toString() {
        return "Customer{" + "first_name=" + getFirst_name() + ", last_name=" + getLast_name() + ", phone=" + getPhone() + ", email=" + getEmail() + ", street=" + getStreet() + ", city=" + getCity() + ", zip_code=" + getZip_code() + '}';

    }

}
