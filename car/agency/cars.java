package car.agency;

public class cars extends Products {

    private String color;
    private int numberOfSeats;

    public cars() {
    }

    public cars(String color, int numberOfSeats, String product_name, int model_year, double list_price, int quantity, boolean available) {
        super(product_name, model_year, list_price, quantity, available);
        this.color = color;
        this.numberOfSeats = numberOfSeats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
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
        return "cars{" + "car_brand=" + getProduct_name() + ", model_year=" + getModel_year() + ", list_price=" + getList_price() + ", quantity=" + getQuantity() + ", available=" + isAvailable() + ", id=" + getProduct_id() + ", color=" + color + ", numberOfSeats=" + numberOfSeats + '}';

    }

}
