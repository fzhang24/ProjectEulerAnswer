public class LargestPrimeFactor {

    public static void main(String[] args) {
        long number = 600851475143L;
        int d = 3;
        int order = 0;
        int[] prime = new int[100];
        int max;

        while (number > 1){
            while (number % d == 0){
                number = number/d;
                prime[order] = d;
                System.out.println(prime[order]);
                order++;
            }
            d++;
        }

        max = prime[0];
        for (int each: prime){
            max = Math.max(max, each);
        }

        System.out.println("The biggest prime factor is " + max);
    }
}
