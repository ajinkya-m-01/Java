class Board {
    String brand = "Prox";
    String dim = "15 X 4";
    double price = 12000;

    Marker mr;
    Duster ds;

    void detailBoard() {
        System.out.println("--Board Detail--");
        System.out.println("Brand: " + this.brand);
        System.out.println("Dim: " + this.dim);
        System.out.println("Price: " + this.price);
    }

    void addMarker() {
        mr = new Marker();
    }

    void addDuster() {
        ds = new Duster();
    }
}

class Marker {
    String brand = "Camlin";
    int price = 150;
    String color = "Black";

    void markerDetail() {
        System.out.println("--Marker Detail--");
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price);
        System.out.println("Color: " + this.color);
    }
}

class Duster {
    String brand = "ReadTup";
    double price = 340;
    String material = "Wood";

    void detailDuster() {
        System.out.println("--Duster Detail--");
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price);
        System.out.println("Material: " + this.material);
    }
}

public class BoardDriver {
    public static void main(String[] args) {
        Board br = new Board();
        br.detailBoard();
        br.addMarker();
        br.mr.markerDetail();
        br.addDuster();
        br.ds.detailDuster();
    }
}
