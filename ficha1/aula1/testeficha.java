package aula1;

import java.util.Scanner; 

public class testeficha{
 public static aula1 f = new aula1();  
 public static Scanner is = new Scanner(System.in); 
    
 private static void exercicio1(){

        System.out.println("Temperatura em C:");        
        double celsius = is.nextDouble(); 
        double far = f.celsiusParaFarenheit(celsius); 
        System.out.println("Em f:" + far); 
        is.close(); 
        
 }
 
 public static void exercicio2(){
 System.out.println("Numeros a comprar:"); 
 System.out.println("Primeiro numero: "); 
 int a = is.nextInt(); 
 System.out.println("Primeiro numero: "); 
 int b = is.nextInt(); 
 int maior = f.maximoNumeros(a,b);
 System.out.println("O maior: " + maior);
 is.close();    
 }
    
 public static void main (String[] args){
        testeficha.exercicio1(); 
        testeficha.exercicio2(); 
     
     }
}