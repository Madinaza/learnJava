package com.mycompany.factorial;
import java.io.PrintStream;
import java.util.Scanner;

public class Factorial {
    
    private int num;
    private Scanner scanner;
    private PrintStream printStream;
    
       public Factorial() {
           
        this.scanner = new Scanner(System.in); 
        this.printStream = System.out; 
    }
    
    
       public int isInputNumberValid (){
           
        if (scanner.hasNextInt()) {
            num = scanner.nextInt(); 

           
            if (num >= 1 && num <= 10) {
                return num;  
            } else {
                
                this.printStream.print("Invalid entry. Please enter an integer between 1 and 10");
            }
        } else {
            
            this.printStream.print("Invalid entry. Please enter an integer between 1 and 10");
            scanner.next(); 
        }

        return -1;
            
        };
       
       
       private void calculateFactorial(int num){
           int fact=1;
          
           for(int i =1;i<=num;i++){
           
           fact*=i;
           
           }
            this.printStream.print("The factorial of " + num + " is: " + fact );
       }

    public static void main(String[] args) {
        
        Factorial factorial=new Factorial();
        int i=factorial.isInputNumberValid();
        
        if(i>0){
            factorial.calculateFactorial ( i );
        }
        
     
    }
}
