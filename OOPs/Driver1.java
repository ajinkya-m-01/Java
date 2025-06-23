class student{
    private String name="Ramesh";
    student(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String newName)
    {
        this.name=newName;
    }
}
class Driver1
{
    public static void main(String []args)
    {
        student obj=new student("Ramesh");
        System.out.println(obj.getName());
        obj.setName("Ramesh Kumar");
        System.out.println(obj.getName());
    }
}