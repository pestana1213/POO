package aula2;

public class Pauta
{
    private int[][] notasturma; 
    
    public Pauta(){
     this.notasturma = new int [5][5];   
    }
    
    public void setNotasTurma(int [][] notas){
     for (int i=0; i<notasturma.length;i++){
         for(int j=0; j<notasturma.length; j++){
             notasturma[i][j]=notas[i][j];
            }
    }
 
    }
    
    public int[][] getNotasTurma(){
    return this.notasturma;    
    }
    
    public float media (int nroaluno){
        float notas=0; 
        
        for (int i = 0; i<notasturma.length; i++){
             notas += notasturma[nroaluno][i];  
            }
        return notas/(float)notasturma.length; 
    }

}
