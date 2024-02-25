import java.io.*;
import javax.swing.JOptionPane;

class Name{
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name : ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age : "));
        JOptionPane.showMessageDialog(null,"Your name is " + name + "\nAge is "+age);
    }
}