import java.util.Scanner;

public class duplicateString{

    public static void main(String[] args) {
        
        Scanner sc= new Scanner (System.in);
        int count;
        String str = sc.next();

        //converts the give string to charArray
        char string[] = str.toCharArray();

        System.out.println("Duplicate char are : "); 

        // counts each character

        for(int i = 0; i <string.length; i++) {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0'; 
                   =
                }  
            }  
            
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && string[i] != '0')  
            System.out.println(string[i]);  
        }

    }

}