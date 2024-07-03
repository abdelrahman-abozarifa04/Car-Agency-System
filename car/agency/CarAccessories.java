package car.agency;

public class CarAccessories extends Products {

    private String category;

    public CarAccessories() {
    }

    public CarAccessories(String category, String product_name, int model_year, double list_price, int quantity, boolean available) {
        super(product_name, model_year, list_price, quantity, available);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    @Override
     public  boolean isAvailable() {
        return available;
    }
    @Override
      public  void setAvailable(boolean available) {
        this.available = available;
    }
    @Override
    public String toString() {
        return "carAccessories{" + "Accessories_name=" + getProduct_name() + ", model_year=" + getModel_year() + ", list_price=" + getList_price() + ", quantity=" + getQuantity() + ", available=" + isAvailable() + ", id=" + getProduct_id() + ", category" + +'}';

    }

}
