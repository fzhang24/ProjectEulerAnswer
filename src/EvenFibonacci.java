import java.util.ArrayList;


public class EvenFibonacci {

    public static void main(String[] args) {

        // print the sum of all the even-valued Fibonacci numbers below the limit
        int limit = 4000000;
        ArrayList<Integer> fNumber = new ArrayList<>();
        fNumber.add(1);
        fNumber.add(2);
        int sum = 2;
        int n = fNumber.size();
        while (fNumber.get(n - 1) <= limit){
            fNumber.add(fNumber.get(n - 2) + fNumber.get(n - 1));
            if (fNumber.get(n) % 2 == 0){
                sum += fNumber.get(n);
            }
            //System.out.println(fNumber.get(n));
            n++;
        }

        System.out.println(sum);

    }
}
