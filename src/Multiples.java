//Return the sum of numbers which are multiples of 3 or 5 in 1000

public class Multiples {

    public static void main(String[] args) {
        int numbers = 1000;
        int sum = 0;
        for(int i = 0; i<numbers; i++){
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
