class Hero {
    int x = 10;
    void display() {
        System.out.println(x);
    }
}

class Vehicle extends Hero {
    int y = 5;
    void car() {
        super.display();
        System.out.println(y);
    }
}

class Bike extends Vehicle {
    int z = 15;
    void green() {
        super.car();
        System.out.println(z);
    }
}

public class demo {
    public static void main(String args[]) {
        Bike myobj = new Bike();
        myobj.green();
    }
}
