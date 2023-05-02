package it.epicode.be;

public class esercizo4 {
	 public static void main(String[] args) {
	        int numero = 6;
	        int risultato = pariDispari(numero);
	        System.out.println("Il risultato è: " + risultato);
	    }
	    
	    public static int pariDispari(int numero) {
	        if(numero % 2 == 0) {
	            return 0; // Il numero è pari
	        } else {
	            return 1; // Il numero è dispari
	        }
	    }
}
