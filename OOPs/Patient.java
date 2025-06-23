public class Patient {
    private int id=22;
    private String name="Ajinkya";
    private int age=18;
    String adress="Pune";
    private long contactnum=9665248981l;
    private String blood_group="o+";
    private String gender="male";

    Patient(int id,String name,int age,String adress,Long contactnum,String blood_group,String gender )
    {
        this.id=  id;
        this.name=name;
        this.age=age;
        this.adress=adress;
        this.contactnum=contactnum;
        this.blood_group=blood_group;
        this.gender=gender;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getAdress()
    {
        return adress;
    }
    public Long getContactnum()
    {
        return contactnum;
    }
    public String getBlood_group()
    {
        return blood_group;
    }
    public String getGender()
    {
        return gender;
    }
}
