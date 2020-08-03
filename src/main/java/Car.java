
public class Car {

    private String make;
    private String model;
    private String price;

    public Car(String make, String model, String price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getPrice() {
        return price;
    }

    public void  downloading(){
        System.out.println(this.getMake() + " " + this.getModel() + " " + this.getPrice() + " is downloading ...");
    }
    @Override
    public String toString(){
        return "Make: " + getMake() +" Model: " + getModel() + " Price: " + getPrice();
    }
}
