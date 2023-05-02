package it.epicode.be;
import java.util.Scanner;

public class esercizio3 {
	public static void main (String[] args)
	{
Scanner input = new Scanner(System.in);
        
        // Chiedi all'utente di inserire tre stringhe
        System.out.print("Inserisci la prima stringa: ");
        String stringa1 = input.nextLine();
        System.out.print("Inserisci la seconda stringa: ");
        String stringa2 = input.nextLine();
        System.out.print("Inserisci la terza stringa: ");
        String stringa3 = input.nextLine();
        
        // Concatena le stringhe in ordine di inserimento
        String concatenazioneInOrdine = stringa1 + stringa2 + stringa3;
        System.out.println("Concatenazione in ordine di inserimento: " + concatenazioneInOrdine);
        
        // Concatena le stringhe in ordine inverso di inserimento
        String concatenazioneInOrdineInverso = stringa3 + stringa2 + stringa1;
        System.out.println("Concatenazione in ordine inverso di inserimento: " + concatenazioneInOrdineInverso);
    }
	}


