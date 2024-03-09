public class Main {
    public static void main(String[] args) {
        int num = 100;

        do {
            if (num % 11 == 0) {
                System.out.println(num);
            }
            num++;
        } while (num <= 300);
    }
}
/*Run time:-Success
Compile time:-Success
Output:-
110
121
132
143
154
165
176
187
198
209
220
231
242
253
264
275
286
297
*/