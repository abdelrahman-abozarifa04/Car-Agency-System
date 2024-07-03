package car.agency;

public class person implements PersonInfo {

    private String first_name;
    private String last_name;
    private String phone;
    private String email;
    private String street;
    private String city;
    private String zip_code;
    private int id;

    public person() {

    }

    public person(String first_name, String last_name, String phone, String email, String street, String city, String zip_code) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone = phone;
        this.email = email;
        this.street = street;
        this.city = city;
        this.zip_code = zip_code;
    }

    @Override
    public String getFirst_name() {
        return first_name;
    }

    @Override
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    @Override
    public String getLast_name() {
        return last_name;
    }

    @Override
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getStreet() {
        return street;
    }

    @Override
    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getZip_code() {
        return zip_code;
    }

    @Override
    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "person{" + "first_name=" + first_name + ", last_name=" + last_name + ", phone=" + phone + ", email=" + email + ", street=" + street + ", city=" + city + ", zip_code=" + zip_code + ", id=" + id + '}';
    }

}
