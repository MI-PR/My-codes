import java.util.Scanner;

class Calc {

    public static void main (String st[]){
        float a,b;
        float r = 0;
        char c;

        Scanner sc = new Scanner (System.in); 
        
        do{
            System.out.println("Enter a binary equation of basic operations (+, - , * /): ");
            
            a = sc.nextFloat();
            c = sc.next().charAt(0);
            b = sc.nextFloat();

            

            switch(c){
                case '+':r = a + b;
                        break;
                case '-':r = a - b;
                        break;
                case '*':r = a * b;
                        break;
                case '/':if(b != 0)
                          r = a / b;
                        else
                          System.out.println("Error! Division by zero is not allowed.");
                        break;
                default:System.out.println("Invalid operator!");
            }
            System.out.println(a + " " + c + " " + b + " = " + r);
            System.out.println("Do you want to do another calculation ? (y/n)");

        }while(sc.next().equalsIgnoreCase("y"));
        
        sc.close();
    }
}
