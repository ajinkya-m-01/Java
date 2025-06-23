class Whiteboard {
    String brand = "Gurjan";
    String dim = "15 X 4";
    double price = 10000;
    Marker marker;
    Duster duster;

    void displayBoard() {
        System.out.println("WhiteBoard: " + this.brand + " ,dimensions: " + this.dim + " ,price: " + this.price + " rs.");
    }

    void addMarker() {
        marker = new Marker();
    }

    void addDuster() {
        duster = new Duster();
    }
}

class Marker {
    String brand = "Camlin";
    String type = "White Board Marker";
    String color = "Black";
    double price = 40;

    void displayMarker() {
        System.out.println("Marker: " + this.brand + " " + this.type + " and the color is " + this.color + " ,price: " + this.price + " rs.");
    }
}

class Duster {
    String brand = "Polo";
    double price = 150;
    String material = "Plastic";

    void displayDuster() {
        System.out.println("Duster: " + this.brand + " material: " + this.material + " ,price: " + this.price + " rs.");
    }
}

class Driver {
    public static void main(String[] args) {
        Whiteboard obj = new Whiteboard();
        obj.displayBoard();

        obj.addMarker();
        obj.marker.displayMarker();

        obj.addDuster();
        obj.duster.displayDuster();
    }
}
