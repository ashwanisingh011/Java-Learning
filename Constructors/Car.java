// Car.java
public class Car {
    String model;
    
    public Car(String model) {
        this.model = model;
    }
    
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        System.out.println(myCar.model);
    }
}