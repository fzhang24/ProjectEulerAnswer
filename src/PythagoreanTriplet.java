public class PythagoreanTriplet {
    public static void main(String[] args) {
        int n = 1000;

        for (int i=1; i<n; i++){
            for (int j=1; j<n-i; j++){
                int k = n - i -j;
                if (i*i + j*j == k*k){
                    System.out.println("The pythagorean triple below 1000 (a, b, c) is ");
                    System.out.println(i + " " + j + " "+ k);
                    System.out.println("The sum of these three numbers is " + i * j *k);
                    System.out.println(" ");
                }
            }
        }
    }
}
