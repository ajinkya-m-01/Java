class NestedEx3 {
    public static void main(String[] args) {
        try {
            System.out.println("Outertry");
            try {
                System.out.println("Innertry");
                System.out.println(10 / 0);
            } catch (NullPointerException npe) {
                System.out.println("Innercatch");
                String str = null;
                str.charAt(0);
            }
        } catch (NullPointerException npe) {
            System.out.println("Outer Catch");
        } catch (ArithmeticException ae) {
            System.out.println("Outer Catch AE");
        }
    }
}
/*
Outertry
Innertry      
Outer Catch AE
 */