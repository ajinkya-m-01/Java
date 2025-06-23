class Laptop {
    String brand;
    String model;
    double price;
    int ram;
    int rom;
    String processor;

    Laptop(String brand, String model, double price, int ram, int rom, String processor) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.ram = ram;
        this.rom = rom;
        this.processor = processor;
    }

    void displayLaptop() {
        System.out.println("Laptop[Brand: " + this.brand + ", Model: " + this.model + 
                           ", Price: " + this.price + ", RAM: " + this.ram + "GB, ROM: " + 
                           this.rom + "GB, Processor: " + this.processor + "]");
    }
}

class GamingLaptop extends Laptop {
    String graphicsCard;
    boolean coolingSystem;
    String keyboard;

    GamingLaptop(String brand, String model, double price, int ram, int rom, String processor, 
                 String graphicsCard, boolean coolingSystem, String keyboard) {
        super(brand, model, price, ram, rom, processor);
        this.graphicsCard = graphicsCard;
        this.coolingSystem = coolingSystem;
        this.keyboard = keyboard;
    }

    void displayGamingLaptop() {
        super.displayLaptop();
        System.out.println("Gaming Laptop [Graphics Card: " + this.graphicsCard + 
                           ", Cooling System: " + (this.coolingSystem ? "Yes" : "No") + 
                           ", Keyboard: " + this.keyboard + "]");
    }
}

class LaptopDriver {
    public static void main(String[] args) {
        // Laptop obj = new Laptop("Dell", "Inspiron", 750.0, 8, 512, "Intel i5");
        GamingLaptop obj2 = new GamingLaptop("Asus", "ROG", 1500.0, 16, 1024, "Intel i7", 
                                                     "NVIDIA RTX 3080", true, "Mechanical");

        // obj2.displayLaptop();
        System.out.println();
        obj2.displayGamingLaptop();
    }
}
