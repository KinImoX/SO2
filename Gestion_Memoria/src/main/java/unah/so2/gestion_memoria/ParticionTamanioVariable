/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paginacion;

/**
 *
 * @author Bryan Martinez, Demsey Euceda, Freddy, Karen Bautista
 */
public class ParticionTamanioVariable {

	private int[] arTamanioMemoria;
	private int[] arTamanioParticion;
	private int[] segmentos;

	public ParticionTamanioVariable() {
	}

	public void asignacionMemoria(int iCantidadMemo) {

		arTamanioMemoria = new int[iCantidadMemo];
	}

	public int recursion(int iCantidadMemoria) {
		int i = 0;
		int iRecursion = iCantidadMemoria / 2;
		if (iRecursion != 1) {
			i++;
			return recursion(iRecursion);

		}
		return i;
	}

	public int[] segmento(int cantidadMemoia) {
		segmentos[0] = recursion(cantidadMemoia); 
		int a = 1;
		while (segmentos[a] <= 2) {
			segmentos[a] = segmentos[a - 1] - segmentos[a - 1] / 4;
			a++;

		}
		for(int j= 0; j<segmentos.length;j++)
			System.out.println(segmentos[j]);
		return segmentos;
	}

	public void orden(Proceso proceso, int iCantidadMemoria) {
		int tamanio = proceso.getTamanio();
		int i;
		segmento(iCantidadMemoria);

		do {
			for (i = 0; i < segmentos.length; i++)
				;

		} while (!(tamanio < segmentos[i]));
		int j = i - 1;
		if (proceso.getAsignacionEnMemoria() == 0) {

			proceso.setAsignacionEnMemoria(segmentos[j]);
		} else {
			while (proceso.getAsignacionEnMemoria() != 0) {
				j--;
			}
			proceso.setAsignacionEnMemoria(segmentos[j]);
		}
	}

}
