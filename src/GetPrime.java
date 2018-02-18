public class GetPrime {
    public static void main(String[] args) {
        int order = 0;
        int num = 0;

        do {
            num++;
            int count = 0;

            for (int i=1; i<=num; i++){
                if (num % i == 0){ count++; }
                if(count > 2) break;
            }
            if (count <= 2) order++;
        }while (order <= 10001);

        System.out.println("The 10 001st prime number is " + num);
    }
}
