public class HighlyDivTrianNumber {
    public static void main(String[] args) {
        int i = 1;
        do {
            int natural = getNaturalNumber(i);
            int divisorCount = getDivisorsCount(natural);
            if (divisorCount > 500){
                System.out.println("The first triangular number has over 500 divisors is " + natural);
                break;
            }
            i++;
        }while (true);
    }

    public static int getDivisorsCount(int number){
        int count =0;

        for (int i=1; i<=number; i++){
            if (number % i == 0){
                count++;
            }
        }
        return count;
    }

    public static int getNaturalNumber(int order){
        int sum = 0;
        for (int i=1; i<=order; i++){
            sum += i;
        }
        return sum;
    }
}
