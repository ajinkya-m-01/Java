class Car {
    String brand;
    String model;
    String type;
    String mileage;
    int seat;
    float price;
    Engine engine;

    Car(String brand, String model, String type, String mileage, int seat, float price, String enginetype, double bhp, int noofpistons, int gear) {
        super();
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.mileage = mileage;
        this.seat = seat;
        this.price = price;
        this.engine = new Engine(enginetype, bhp, noofpistons, gear);
    }

    void displayCar() {
        System.out.println("***Car Details***");
        System.out.println("Brand of car : " + this.brand);
        System.out.println("Model of car : " + this.model);
        System.out.println("Type of car : " + this.type);
        System.out.println("Mileage of car : " + this.mileage + " Km/l");
        System.out.println("Seat of car : " + this.seat);
        System.out.println("Price of car : " + this.price);
        this.engine.displayEngine();
    }
}

class Engine {
    String enginetype;
    double bhp;
    int noofpistons;
    int gear;

    Engine(String enginetype, double bhp, int noofpistons, int gear) {
        this.enginetype = enginetype;
        this.bhp = bhp;
        this.noofpistons = noofpistons;
        this.gear = gear;
    }

    void displayEngine() {
        System.out.println("***Engine Details***");
        System.out.println("Engine Type : " + this.enginetype);
        System.out.println("BHP : " + this.bhp);
        System.out.println("No Of Pistons : " + this.noofpistons);
        System.out.println("No Of Gears : " + this.gear);
    }
}

class CompoDriver {
    public static void main(String[] args) {
        Car obj = new Car("TATA", "NEXON", "HATCHBACK", "17", 5, 850000, "Diesel", 110.5, 4, 6);
        obj.displayCar();
    }
}
