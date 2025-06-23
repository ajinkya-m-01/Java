class NestedEx6 {
    public static void main(String[] args) {
        try {
            System.out.println("Innertry");
            System.out.println(10 / 0.0);
            try {
                System.out.println("Outertry");
                String str=null;
                System.out.println(str.isEmpty());
                
            } catch (NullPointerException npe) {
                System.out.println("Null pointer exception handled");
                String str=null;
                System.out.println(str.isEmpty());
            }
        }catch (NullPointerException npe) {
            System.out.println("Outer Catch E");
            System.out.println(10 / 0);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Arithmetic exception handled");
        }
        System.out.println("Byee");
    }
}
/*
Innertry
Infinity
Outertry
Null pointer exception handled
Outer Catch E
Exception in thread "main" java.lang.ArithmeticException: / by zero
 */