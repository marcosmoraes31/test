/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellow;

import java.util.Scanner;



public class Divisao{

    
      public static void main(String[] args) { 
        float num1;
        float num2;
        float divisao;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Digite o primeiro numero: ");
        num1 = input.nextInt();
        
        System.out.println("Digite o segundo numero:  ");
        num2 = input.nextInt();
        
        divisao = num1/num2;
        
        System.out.println();
        System.out.println("divisao e = " + divisao);
  }    
}

