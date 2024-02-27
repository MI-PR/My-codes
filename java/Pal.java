import java.util.Scanner;

class Pal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter a string : ");

        String str = sc.nextLine() ;  
        
        int n = str.length();  
        boolean x = true ;  
        for (int i=0;i<n/2;i++) {        
            if (str.charAt(i) != str.charAt(n-i-1)) {        
                x = false ;          
                break ;            
            }        
        }          
        if (x == true)     
            System.out.println("The given string is a palindrome");        
        else                                    
            System.out.println("The given string is not a palindrome");

            sc.close();
    }
    
}
