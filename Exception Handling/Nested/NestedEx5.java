class NestedEx5 {
    public static void main(String[] args) {
        try {
            System.out.println("Innertry");
            System.out.println(10 / 0);
            try {
                System.out.println("Outertry");
                String str=null;
                System.out.println(str.isEmpty());
                
            } catch (NullPointerException npe) {
                System.out.println("Null pointer exception handled");
            }
        }catch (Exception e) {
            System.out.println("Outer Catch E");
        }
    }
}
/*
Innertry
Outer Catch E
 */