package org.java.books;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// System.out.println("Hello World");

		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci la quantità dei libri da inserire: ");
		int nLibri = Integer.valueOf(sc.nextLine());

		Libro[] libro = new Libro[nLibri];

		for(int i=0;i<nLibri; i++){

			System.out.print("Inserisci il titolo del libro " + (i+1) + ": ");
			String titolo = sc.nextLine();

			System.out.print("Inserisci il numero di pagine del libro " + (i+1) + ": ");
			// per evitare un bug dello scanner quando si passa da int a String
			int numeroPagine = Integer.valueOf(sc.nextLine());

			System.out.print("Inserisci l'autore del libro " + (i+1) + ": ");
			String autore = sc.nextLine();

			System.out.print("Inserisci l'editore del libro " + (i+1) + ": ");
			String editore = sc.nextLine();

			libro[i] = new Libro(titolo, numeroPagine, autore, editore);
			
			System.out.println(libro[i]);
			System.out.println("\n-------------------------------------\n");
			
		}
		
		System.out.println("Ecco i libri inseriti: \n");

		for (int i = 0; i < nLibri; i++) {
			System.out.println(libro[i]);
			System.out.println("\n-------------------------------------\n");
	}


	}

}
