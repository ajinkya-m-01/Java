import java.util.Arrays;
public class Example9
{


public static void main(String[] args) {

    int num = 9;
    int before = 0;
    int after = 0;
    for (int i = 2; true; i++) {
        if (isPrime(i)) {
            if (i < num) {
                before = i;
            } else {
                after = i;
                break;
            }
        }
    }

    if (num - before == after - num){
        System.out.println(before + " " + after);
    }
    else if (num - before < after - num)
    {
        System.out.println(before);
    }
    else{
        System.out.println(after);
}
if (num - before == after - num)
{
    System.out.println(before + " " + after);
}
else if (num - before < after - num)
{
    System.out.println(before);
}
else
{
    System.out.println(after);
}
}
private static boolean isPrime(int i) {
    for (int j = 2; j < i; j++) {
        if (i % j == 0) {
            return false;
        }
    }
    return true;
}
}