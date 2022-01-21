import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder sb = new StringBuilder(A);
        
        for(int i=0; i<sb.length()/2;i++){

            int front = i;
            int back = sb.length()-i-1;

            char charAtFront = sb.charAt(front);
            char charAtback = sb.charAt(back);

            sb.setCharAt(front, charAtback);
            sb.setCharAt(back, charAtFront);

        }
        System.out.println(sb);
       
      
    }
    
}
