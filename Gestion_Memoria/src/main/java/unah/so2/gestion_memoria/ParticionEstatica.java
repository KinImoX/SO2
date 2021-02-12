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
    private int [] arTamanioParticion;
   
    
    public ParticionEstatica(){}
    
    public int asignacionParticion(int iCantidadMemo){
        int c=1;
        //Divide en modulos iguales de 8MB
        this.arTamanioParticion = new int[iCantidadMemo/8];
        for(int i : arTamanioParticion){
            arTamanioParticion[i] = c++;
            System.out.println(arTamanioParticion[i]);
        }  
        return iCantidadMemo/8;
    }
    
    public void asignacionMemoria(int iTamanioProceso){
        if (iTamanioProceso >= 8){
            System.out.println("Muy grande");
        }else{
            this.arTamanioParticion[1] = iTamanioProceso;
        }
    }

    

   
    
    
}
