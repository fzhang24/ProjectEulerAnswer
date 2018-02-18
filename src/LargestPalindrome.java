import java.util.ArrayList;

public class LargestPalindrome {

    public static boolean getPalindrome(String num){
        for (int i=0; i<num.length(); i++){
            if (num.charAt(i) != num.charAt(num.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static int getMax(ArrayList<Integer> arr){
        int max=arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (max < arr.get(i)) {
                max = arr.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> palindrome  = new ArrayList<>();
        for (int i=100; i<1000; i++){
            for (int j=100; j<1000; j++){
                int product = i * j;
                String str = Integer.toString(product);
                if (getPalindrome(str)){
                    palindrome.add(product);
                }
            }
        }

        System.out.println("The largest palindrome made from the product of two 3-digit numbers is " + getMax(palindrome));
    }
}
