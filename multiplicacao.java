package hellow;
import java.util.Scanner;



public class multiplicacao{

    
      public static void main(String[] args) { 
        int num1;
        int num2;
        int multiplicacao;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Digite o primeiro numero: ");
        num1 = input.nextInt();
        
        System.out.println("Digite o segundo numero:  ");
        num2 = input.nextInt();
        
        multiplicacao = num1 * num2;
        
        System.out.println();
        System.out.println("Multiplicacao e = " + multiplicacao);
  }    
}

