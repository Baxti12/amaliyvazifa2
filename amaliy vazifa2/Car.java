public class Car {
    private String color;
    private String model;
    private double price;
    private String transmissionType;


    public Car(String color, String model, double price, String transmissionType) {
        this.color = color;
        this.model = model;
        this.price = price;
        this.transmissionType = transmissionType;
    }

    // Getter va Setter metodlar
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }


    public void displayCarInfo() {
        System.out.println("Rang: " + color);
        System.out.println("Model: " + model);
        System.out.println("Narxi: " + price);
        System.out.println("Transmissiya turi: " + transmissionType);
    }
}
