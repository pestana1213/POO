package aula2;

import java.util.*; 
import java.util.Arrays; 


public class ficha2
{
    public int minimoarray (int [] teste){
        int i = teste [0]; 
        for (int elemento : teste) {
         if (i>=elemento) { i = elemento; }
        }
        return i; 
    }
    
    public int[] entre (int [] a, int b, int c){
        

        for(int elemento : a){
            
         if (b<c){
             int[] res = new int[b-c+1]; 
             if (elemento >= b && elemento <= c){
                System.arraycopy(a,0,res,0,(b-c+1)); 
                return res; 
                }  
        }
        if (b>c){
             int[] res = new int[c-b+1]; 
             if (elemento <= b && elemento >= c){
                System.arraycopy(a,0,res,0,(b-c+1)); 
                return res; 
                }  
        }
    }
    return new int[0]; 
    }
    
    private boolean existe(int [] r, int tam, int i){
        boolean enc = false; 
        for (int j=0;j<tam && !enc; j++){
            enc = r[j] == i;
        }
        return enc;
    }
    
    public int[] comuns (int [] a, int [] b){
        int[] res = new int [a.length];
        int cont = 0; 
        
        for (int elemento : a){
            boolean enc = this.existe(res, cont, elemento); 
            for (int j = 0; j<= b.length && !enc; j++){
                if (elemento == b[j]){
                 res[cont ++] = elemento;
                 enc = true; 
                }
            }
        }
        int [] resultado = new int [cont];
        System.arraycopy(res, 0, resultado, 0, cont); 
        return resultado; 
    }
    
    
}