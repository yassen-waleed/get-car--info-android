package model;

public class Car {
    private String name;
    private String type;
    private String number;
    private String color;
    private Double price;


    public Car() {
    }

    public Car(String name, String type, String number, String color, Double price) {
        this.name = name;
        this.type = type;
        this.number = number;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
