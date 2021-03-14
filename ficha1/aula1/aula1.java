package aula1;

import java.util.*;

public class aula1{
    
    public double celsiusParaFarenheit(double graus){
    return graus*1.8+32; 
    }
    
    public int maximoNumeros(int a, int b){
    if(a>b) return a;
    else return b; 
    }
    
    public String criaDescricaoConta(String nome, double saldo){
    return ("Nome:" + nome + "Saldo: " + saldo); 
    }
    
    public double eurosParaLibras(double valor, double taxaConversao){
    return valor*taxaConversao; 
    }
    
    public void ordemedia (int a, int b){
    int maximo = maximoNumeros(a,b); 
    int media = (a+b) / 2; 
    if (maximo==a){
    System.out.println(a + "," + b + "media: " + media);
    }
    else {
        System.out.println(b + "," + a + "media: " + media);
    }
    }
    
    public long factorial(int num){
    int fat = 1; 
    for (fat=1; fat>1;num = num-1){
    fat=fat*num ; 
    }
    return fat;
    }

}