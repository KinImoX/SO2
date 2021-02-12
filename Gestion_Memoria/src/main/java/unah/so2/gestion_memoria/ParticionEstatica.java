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
        int c=1;
        //Divide en modulos iguales de 8MB
        this.arTamanioParticion = new int[iCantidadMemo/8][8];
        System.out.println(arTamanioParticion.length);
        /* for(int i=0;i < iCantidadMemo/8;i++){
            for(int j=0;j < 8;j++){
                arTamanioParticion[i][j]=c++;
                System.out.print(arTamanioParticion[i][j]+" ");
            }
            System.out.println(" ");  
        }  */
        return iCantidadMemo/8;
    }
    public int[][] envioDatos(){
        int c=1;
        for(int i=0;i < arTamanioParticion.length ;i++){
            
            for(int j=0;j < 8;j++){
                arTamanioParticion[i][j]=c++;
                System.out.print(arTamanioParticion[i][j]+" ");
            }
            System.out.println(" ");  
        } 
        return arTamanioParticion;
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
