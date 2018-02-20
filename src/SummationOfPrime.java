public class SummationOfPrime {
    public static void main(String[] args) {
        long sum = 0;

        for (int i=2; i<2000000; i++){
            boolean isPrime = true;

            for (int j=2; j<=i/2; j++){
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) sum += i;
        }

        System.out.println("The summation of all the primers below 2,000,000 is " + sum);

    }
}
