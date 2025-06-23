class Laptop
{
    String brand; 
    String color;
    String model;
    double price;

    Laptop(String brand,String color,String model,double price)
    {
        this.brand=brand;
        this.color=color;
        this.model=model;
        this.price=price;
    }
    Laptop(Laptop obj1)
    {
        this.brand=obj1.brand;
        this.color=obj1.color;
        this.model=obj1.model;
        this.price=obj1.price;
    }
    void displaylaptop()
    {
        System.out.println("*******Laptop Details********");
        System.out.println("Brand is : "+brand);
        System.out.println("Color : "+color);  
        System.out.println("Model : "+model);
        System.out.println("Price : "+price);
    }
}
class LaptopDriver
{
    public static void main(String[]args)
    {
        Laptop obj1=new Laptop("Dell","Black","I-5",90000);
        obj1.displaylaptop();

        Laptop obj2=new Laptop(obj1);
        obj2.displaylaptop();
    }
}