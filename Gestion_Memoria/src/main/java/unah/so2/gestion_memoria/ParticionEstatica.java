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
    
    private int [] arTamanioMemoria;
    private int [] arTamanioParticion;
    
    public ParticionEstatica(){}
    
    public void asignacionMemoria(int iCantidadMemo){
        
        arTamanioMemoria = new int[iCantidadMemo];
    }
    
    public int recursion(int iCantidadMemoria){
        int iRecursion = iCantidadMemoria/2;
        if(iRecursion != 1){
            return recursion(iRecursion);
        }
        return iRecursion;
    }

   
    
    
}
