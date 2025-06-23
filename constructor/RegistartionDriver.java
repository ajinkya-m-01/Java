class registration
{
    String username;// * 
    String emailid;// *
    String gender;// *
    long monumber;// *
    long altmonumber;
    String dob;

    registration(String username,String emailid,String gender,long monumber)
    {
        this.username=username;
        this.emailid=emailid;
        this.gender=gender;
        this.monumber=monumber;

    }
    registration(String username,String emailid,String gender,long monumber,long altmonumber)
    {
        this.username=username;
        this.emailid=emailid;
        this.gender=gender;
        this.monumber=monumber;
        this.altmonumber=altmonumber;
    }

    registration(String username,String emailid,String gender,long monumber,String dob)
    {
        this.username=username;
        this.emailid=emailid;
        this.gender=gender;
        this.monumber=monumber;
        this.dob=dob;
    }
    registration(String username,String emailid,String gender,long monumber,long altmonumber,String dob)
    {
        this.username=username;
        this.emailid=emailid;
        this.gender=gender;
        this.monumber=monumber;
        this.altmonumber=altmonumber;
        this.dob=dob;
    }


    void displayregistration()
    {
        System.out.println("***************");
        System.out.println("Username : "+username);
        System.out.println("Email-Id : "+emailid);  
        System.out.println("Gender : "+gender);
        System.out.println("Mobile Number : "+monumber);
        System.out.println("Alt Mobile Number : "+altmonumber);
        System.out.println("Date Of Birth : "+dob);
    }
}
class RegistrationDriver
{
    public static void main(String[]args)
    {
        registration obj1=new registration("Ajinkya","ajinkyamhetre01@gmail.com","Male",9665248981l);
        obj1.displayregistration();

        registration obj2=new registration("kamlesh","kamlesh01@gmail.com","Male",8956478956l,8956478956l);
        obj2.displayregistration();

        registration obj3=new registration("Ganesh","Ganesh01@gmail.com","Male",7896589978l,"19/07/2003");
        obj3.displayregistration();

        registration obj4=new registration("Suresh","Suresh01@gmail.com","Male",8977894578l,8977589987l,"19/07/2003");
        obj4.displayregistration();
    }
}