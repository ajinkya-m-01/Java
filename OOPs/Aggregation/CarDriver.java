class Car {
    String brand;
    String model;
    String type;
    int seatingCap;
    double price;

    Engine engine;

    Car(String brand, String model, String type, int seatingCap, double price, String etype, int gear, int bhp) 
    {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.seatingCap = seatingCap;
        this.price = price;
        this.engine = new Engine(etype,gear,bhp);
    }

    void carDeatil() {
        System.out.println("--Car Deatail----");
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Type: " + this.type);
        System.out.println("Seating Cap: " + this.seatingCap);
        System.out.println("Price: " + this.price);
    }
}

class Engine {
    String etype;
    int gear;
    int bhp;

    Engine(String etype, int gear, int bhp) {
        this.etype = etype;
        this.gear = gear;
        this.bhp = bhp;
    }

    void engineDeatail() {
        System.out.println("--Engine Deatail--");
        System.out.println("Type: " + this.etype);
        System.out.println("Gear: " + this.gear);
        System.out.println("BHP: " + this.bhp);
    }

}

class CarDriver

{
    public static void main(String[] args) {
        Car cr = new Car("TATA", "Thar", "Sport", 5, 800000,"CL",4, 3000);
        cr.carDeatil();
        cr.engine.engineDeatail();
    }
}
