import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class XlsColumnConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter column = ");
        StringBuilder sb = new StringBuilder(scanner.nextLine().toUpperCase());
        BigInteger number = BigInteger.valueOf(0);

        long pow = 1;

        for (int i = sb.length() - 1; i >= 0; i--) {
            BigInteger temp = BigInteger.valueOf(((int) sb.charAt(i) - 'A' + 1) * pow);
            number = number.add(temp);
            pow *= 26;
            System.out.println(number);
        }





    }
}



