package it.epicode.be;

import java.util.Arrays;

public class Helloworld {

public static void main (String[] args)
		{
		// Stampa a console  la frase
		System.out.println("This is my first Epicode Java Project!");
		int num1 = 10;
		int num2 =20;
		System.out.println(num1*num2);
		String concat1 = "ciao";
		System.out.println(concat1 += num2);
		
		 String[] array1 = {"elemento1", "elemento2", "elemento3", "elemento4", "elemento5"};
	        
	        // Crea una nuova stringa da inserire nell'array
	        String nuovaStringa = "nuovaStringa";
	        
	        // Crea un nuovo array di sei elementi
	        String[] array2 = new String[6];
	        
	        // Copia i primi due elementi dell'array1 nel nuovo array2
	        System.arraycopy(array1, 0, array2, 0, 2);
	        
	        // Copia l'elemento 3 nell'array2 nella posizione 3
	        array2[2] = nuovaStringa;
	        
	        // Copia gli elementi 4 e 5 dell'array1 nelle posizioni 5 e 6 dell'array2
	        System.arraycopy(array1, 3, array2, 4, 2);
	        
	        // Stampa l'array2 per verificare il risultato
	        System.out.println(Arrays.toString(array2));
		}
}



