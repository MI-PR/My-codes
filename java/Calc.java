import java.util.Scanner;

class Calc {

    public static void main (String st[]){
        float a,b;
        char c;
        //String d;
        
        Scanner sc = new Scanner (System.in);

        // boolean Continue{
        //     System.out.println("Continue ? yes/no");
        //     d = sc.nextLine();
        //     if(d.equalsIgnoreCase("yes")) return true;
        //     else
        //     return false;
        // };
        
        
        
        boolean x = true;
        
        while(x == true){
            System.out.println("Enter a binary equation of basic operations (1 e 1 for exit)");
            
            a = sc.nextFloat();
            c = sc.next().charAt(0);
            b = sc.nextFloat();

            

            switch(c){
                case '+':System.out.println((a+b));
                        // x = Continue();
                    break;
                case '-':System.out.println((a-b));
                        // x = Continue();
                    break;
                case '*':System.out.println((a*b));
                        // x = Continue();
                    break;
                case '/':if(b != 0)
                          System.out.println(a/b);
                        else
                          System.out.println("Error! Division by zero is not allowed.");
                          break;
                
                case 'e' : x = false;break;
                default:System.out.println("Invalid operator!");
            }
        }

        
        // if(c=='+'){
            // System.out.println(a+b);
            // }
            // else if(c=='-'){
                //     System.out.println(a-b);
                // }
                // else if(c=='*'){
                    //     System.out.println(a*b);
                    // }
                    // else if(c=='/'){
                        //     System.out.println(a/b);
                        // }
                        // else{
                            //     System.out.println("Invalid");
                            //}
                            sc.close();
    }
}
