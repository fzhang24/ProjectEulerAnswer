public class SumSquareDff {

    public static void main(String[] args) {
        double sum1 = 0;
        double sum2 = 0;
        int num = 100;

        for (int i=1; i<=num; i++){
            sum1 = sum1 + Math.pow(i, 2);
            sum2 = sum2 + i;
        }

        sum2 = Math.pow(sum2, 2);

        System.out.println("The Sum square difference is " + (int) (Math.abs(sum1 - sum2)));

    }
}
