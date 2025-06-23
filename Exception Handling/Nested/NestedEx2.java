class NestedEx2 {
    public static void main(String[] args) {
        try {
            System.out.println("Outertry");
            try {
                System.out.println("Innertry");
                System.out.println(10 / 0);
            } catch (NullPointerException ae) {
                System.out.println("Innercatch");
            }
        } catch (ArithmeticException ae) {
            System.out.println("Outer Catch");
        }
    }
}
/*
Outertry
Innertry   
Outer Catch
 */