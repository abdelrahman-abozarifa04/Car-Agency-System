package car.agency;

public abstract class  Products {

    private static int product_id = 1;
    private String product_name;
    private int model_year;
    private double list_price;
    private int quantity;
    boolean available;
    private int id;

    public Products() {
       
    }

    public Products(String product_name, int model_year, double list_price, int quantity, boolean available) {
        this.product_name = product_name;
        this.model_year = model_year;
        this.list_price = list_price;
        this.quantity = quantity;
        this.available=available;
         this.id = product_id++;
    }

    public int getProduct_id() {
        return id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getModel_year() {
        return model_year;
    }

    public void setModel_year(int model_year) {
        this.model_year = model_year;
    }

    public double getList_price() {
        return list_price;
    }

    public void setList_price(double list_price) {
        this.list_price = list_price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public  abstract boolean isAvailable() ;
   
    public abstract void setAvailable(boolean available) ;
    
    @Override
    public String toString() {
        return "Products{" + "product_name=" + product_name + ", model_year=" + model_year + ", list_price=" + list_price + ", quantity=" + quantity + ", available=" + available + ", id=" + id + '}';
    }

}
