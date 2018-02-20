import java.math.BigInteger;


public class FactorialDigitSum {

    public static BigInteger getFactorial(int number){
        BigInteger product = new BigInteger("1");
        for(int i=1; i<=number; i++){
            product = product.multiply(new BigInteger(String.valueOf(i)));
        }
        return product;
    }

    public static void main(String[] args) {
        int sum = 0;
        BigInteger num = getFactorial(100);
        String numString = String.valueOf(num);
        for (int i=0; i<numString.length(); i++){
            sum += Character.getNumericValue(numString.charAt(i));
        }

        System.out.println("The sum of all the digits in the number of 100! is " + sum);
    }
}
