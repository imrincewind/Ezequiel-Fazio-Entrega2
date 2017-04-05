package entrega2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	/*
	 * Para poder observar una diferencia entre ambos metodos de ordenamiento
	 * fue necesario utilizar arreglos de gran tamaño. Con estos arreglos y al
	 * observar los resultados de tiempo, se hace notoria la diferencia entre
	 * ambos metodos, siendo mucho más eficiente el MERGESORT
	 *
	 */

	public static void main(String[] args) {
		final int SIZE = 300000;
		int[] arregloB = new int[SIZE];
		int[] arregloM = new int[SIZE];
		BubbleSort bubb = new BubbleSort();

		for (int i = 0; i < SIZE; i++) {
			int temp = (int) (Math.random() * SIZE);
			arregloB[i] = temp;
			arregloM[i] = temp;
		}

		System.out.println();
		System.out.println("ARREGLO ORDENADO BURBUJA");
		Date inicioArray = new Date();
		bubb.burbuja(arregloB);
		Date finalArray = new Date();

		// ------------------------ EJERCICIO 4 ----------------------
		MergeSort merge = new MergeSort();
		Date inicioMerge = new Date();
		merge.sort(arregloM);
		Date finalMerge = new Date();

		System.out.println();
		System.out.println(inicioArray);
		System.out.println(finalArray);

		long resultadoArray = finalArray.getTime() - inicioArray.getTime();
		System.out.println(resultadoArray / 1000 + " segundos BURBUJA");

		System.out.println();
		System.out.println(inicioMerge);
		System.out.println(finalMerge);

		long resultadoMerge = finalMerge.getTime() - inicioMerge.getTime();
		System.out.println(resultadoMerge / 1000 + " segundos MERGESORTE");

		// SE IMPRIME PARA OBSERBAR QUE HAYA FUNCIONADO EL
		// ORDENAMIENTO EN AMBOS CASOS
		// USAR i= SIZE GENERABA ERROR
		for (int i = 300000 - 1; i > SIZE; i--) {
			System.out.print(arregloB[i] + " - ");
		}
		System.out.println("");
		for (int i = 300000 - 1; i > SIZE; i--) {
			System.out.print(arregloM[i] + " - ");
		}

	}
}
