import java.math.BigInteger;

public class PoweDigitSum {
    public static void main(String[] args) {
        BigInteger two = new BigInteger("2");
        BigInteger num = two.pow(1000);
        String numString = num.toString();
        int sum = 0;
        for (int i=0; i<numString.length(); i++){
            sum += Integer.parseInt(String.valueOf(numString.charAt(i)));
        }

        System.out.println(sum);

    }
}
