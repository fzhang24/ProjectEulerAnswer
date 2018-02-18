public class SmallestMultiple {
    public static void main(String[] args) {
        int n = 1;
        int smallest = 0;

        while (smallest == 0){
            int d = 2;
            while ( n % d == 0){
                if (d > 19){ smallest = n; }
                d++;
            }
            n++;
        }

        System.out.println("The smallest number that is evenly divisible by all the numbers from 1 to 20 is " + smallest);
    }
}
