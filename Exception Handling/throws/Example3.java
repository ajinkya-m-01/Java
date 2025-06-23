class Example3
{
    public static void main(String[] args) {
        try{
            m1();
        }
        catch(InterruptedException ie)
        {
            System.out.println("InterruptedException Handled");
        }
    }
    public static void m1()throws InterruptedException
    {
        for(int i=1;i<=5;i++)
        {
            System.out.print(i+"  ");
            Thread.sleep(2000);
        }
    }
}
//! 1  2  3  4  5  -time span between each other in 2 sec