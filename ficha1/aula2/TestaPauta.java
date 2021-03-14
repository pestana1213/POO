package aula2;

import java.util.*;

public class TestaPauta
{
    public static void main( String[] args){
        Pauta t = new Pauta(); 
        int [] [] paux = new int [5][5]; 
        Scanner is = new Scanner(System.in);
        System.out.println("Pauta:"); 
        for (int i = 0; i<paux.length;i++){
         for (int j=0; j<paux[i].length;j++){
             System.out.println("Aluno " + i + "UC " + j); 
             paux[i][j] = is.nextInt();
            }
        }
        t.setNotasTurma(paux); 
        
        System.out.println(Arrays.deepToString(paux)); 
        
        System.out.println(Arrays.deepToString(t.getNotasTurma()));
    }
}
