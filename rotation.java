import java.util.Scanner;

public class rotation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
     

        String str3 = str1 + str2;
        if(str3.contains(str2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("no");
            System.out.println(str3);
        }

    }
}
