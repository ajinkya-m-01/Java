class NestedEx4 {
    public static void main(String[] args) {
        try {
            System.out.println("Outertry");
            try {
                System.out.println("Innertry");
                System.out.println(10 / 0);
            } catch (ArithmeticException ae) {
                System.out.println("Innercatch");
                String str = new String();
                str.charAt(0);
            }
        } catch (NullPointerException npe) {
            System.out.println("Outer Catch npe");
        } catch (Exception ae) {
            System.out.println("Outer Catch AE");
        }
    }
}
/*
Outertry
Innertry  
Innercatch
Outer Catch AE
 */