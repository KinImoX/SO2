/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unah.so2.gestion_memoria;

/**
 *
 * @author Bryan Martinez, Demsey Euceda, Freddy, Karen Bautista
 */
public class ParticionEstatica {
    
    private int [] arTamanioMemoriaAsg;
    private int [][] arTamanioParticion;
   
    
    public ParticionEstatica(){}
    
    public int asignacionParticion(int iCantidadMemo){
        //Divide en modulos iguales de 8MB
        this.arTamanioParticion = new int[8][iCantidadMemo/8];
        return iCantidadMemo/8;
    }
    public int[][] envioDatos(int iParticiones, int iTamanioProceso){
        int c=1;
        
        if(iTamanioProceso <= 8){
            
            for(int i=0;i < iTamanioProceso ;i++){
                //for(int j=0;j < iParticiones ;j++){
                    arTamanioParticion[i][0]=c++;
                    System.out.print(arTamanioParticion[i][0]+" ");
                //}
                System.out.println(" ");  
            } 
            for(int i=0;i < 8 ;i++){
                System.out.print(arTamanioParticion[i][0]+" ");
            }
          
        }   return arTamanioParticion;
    }
    
    public String[] datos(){
        int[] array;
        String[] array2;
        array2 = new String[8];
        array = new int[8];
        for(int i=0;i<8;i++){
            array[i] = 1;
            Integer.toString(array[i]);
            
            
        }
        return array2;
    }
    
    public void asignacionMemoria(int iTamanioProceso){
        
        if (iTamanioProceso >= 8){
            System.out.println("Muy grande");
        }else{
            this.arTamanioParticion[1][8] = iTamanioProceso;
        }
    }

    

   
    
    
}
