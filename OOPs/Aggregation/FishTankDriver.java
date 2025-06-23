class FishTank {
    String dimensions;
    String material;
    String shape;
    String capacity;
    Fish fish;
    Water water;
    OxygenPump pump;
    Stone stone;
    Light light;

    public FishTank(String dimensions, String material, String shape, String capacity) {
        this.dimensions = dimensions;
        this.material = material;
        this.shape = shape;
        this.capacity = capacity;
    }

    public void displayFishTank() {
        System.out.println("Dimensions: " + dimensions);
        System.out.println("Material: " + material);
        System.out.println("Shape: " + shape);
        System.out.println("Capacity: " + capacity);
        System.out.println();
    }

    public void addFish() {
        if (water == null) {
            System.out.println("Please add water first or else fish will die.");
        } else {
            fish = new Fish("shark", "grey", 50);
        }
    }

    public void addWater() {
        water = new Water("salt water", 7, 8);
    }

    public void addOxygenPump() {
        pump = new OxygenPump("Philips", 500, 5, 230);
    }

    public void addStone() {
        stone = new Stone("multicolor", 3, "oval", 300, 170);
    }

    public void addLight() {
        light = new Light("Bajaj", "yellow", 100, 5);
    }
}

class Fish {
    String species;
    String color;
    double price;
    FishFood food;

    public Fish(String species, String color, double price) {
        this.species = species;
        this.color = color;
        this.price = price;
    }

    void displayFish() {
        System.out.println("Species: " + species);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }

    public void addFood() {
        food = new FishFood("Haldiram", 250, 100);
    }
}

class Water {
    String type;
    double pHValue;
    double quantity;

    public Water(String type, double pHValue, double quantity) {
        this.type = type;
        this.pHValue = pHValue;
        this.quantity = quantity;
    }

    void displayWater() {
        System.out.println("Type: " + type);
        System.out.println("pH Value: " + pHValue);
        System.out.println("Quantity: " + quantity);
    }
}

class FishFood {
    String brand;
    double price;
    double quality;

    public FishFood(String brand, double price, double quality) {
        this.brand = brand;
        this.price = price;
        this.quality = quality;
    }

    void displayFishFood() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Quality: " + quality);
    }
}

class OxygenPump {
    String brand;
    double price;
    double capacity;
    double voltage;

    public OxygenPump(String brand, double price, double capacity, double voltage) {
        this.brand = brand;
        this.price = price;
        this.capacity = capacity;
        this.voltage = voltage;
    }

    void displayOxygenPump() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Capacity: " + capacity);
        System.out.println("Voltage: " + voltage);
    }
}

class Light {
    String brand;
    String color;
    double price;
    double voltage;

    public Light(String brand, String color, double price, double voltage) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.voltage = voltage;
    }

    void displayLight() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Voltage: " + voltage);
    }
}

class Stone {
    String color;
    double weight;
    String shape;
    double quantity;
    double price;

    public Stone(String color, double weight, String shape, double quantity, double price) {
        this.color = color;
        this.weight = weight;
        this.shape = shape;
        this.quantity = quantity;
        this.price = price;
    }

    void displayStone() {
        // System.out.println(color+weight+shape+quantity+price);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Shape: " + shape);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
    }
}

public class FishTankDriver {
    public static void main(String[] args) {
        FishTank obj = new FishTank("40 X 20 X 15 cm", "glass", "Rectangle", "10 liters");
        obj.displayFishTank();
        obj.addWater();
        obj.water.displayWater();
        obj.addFish();
        obj.fish.displayFish();
        obj.fish.addFood();
        obj.fish.food.displayFishFood();
        obj.addOxygenPump();
        obj.pump.displayOxygenPump();
        obj.addStone();
        obj.stone.displayStone();
        obj.addLight();
        obj.light.displayLight();
    }
}
