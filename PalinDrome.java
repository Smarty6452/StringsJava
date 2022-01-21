import java.util.Scanner;

public class PalinDrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        StringBuilder sb = new StringBuilder(name);

        for (int i = 0; i < name.length(); i++) {

            int front = i;
            int back = name.length() - i - 1;  //if n = 5 then 5 - 0 - 1 = 4 => at last index

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            if (frontChar == backChar) {
                System.out.println("Given String is palindrome");
                break;
            }
             else {
                System.out.println("Given String is not palindrome");
                break;
            }
        }
        System.out.println();

    }

}
