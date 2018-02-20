import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LargeSum {
    public static void main(String[] args) {
        BigInteger sum  = new BigInteger("0");
        Path file_path = Paths.get("/Users/admin/IdeaProjects/ProjectEulerAnswer/src/digit.txt");

        try{
            for (String line: Files.readAllLines(file_path)){
                BigInteger number = new BigInteger(line);
                sum = sum.add(number);
            }

        }catch (IOException e){
            System.out.println(e);
        }
        System.out.println("The first ten digits of sum is ");
        System.out.println(sum.toString().substring(0,10));
    }
}
