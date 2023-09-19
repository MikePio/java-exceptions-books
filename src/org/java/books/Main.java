package org.java.books;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	private static final String FILE_PATH = "C:/Users/miche/Documents/libri_inseriti.txt";
	
	public static void main(String[] args) throws IOException {
		// System.out.println("Hello World");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci la quantità dei libri da inserire: ");
		int nLibri = Integer.valueOf(sc.nextLine());
		
		Libro[] libro = new Libro[nLibri];

		for(int i=0;i<nLibri; i++){
			try{

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
				
			}catch(Exception e){

				i--;
				System.err.println("\nDato inserito non valido: " + e.getMessage());
			}
		}

		//obbligatorio
		sc.close();

		System.out.println("Ecco i libri inseriti: \n");

//*!  INIZIO --->  CREAZIONE E SCRITTURA DI TESTO IN UN FILE*/
		// * soluzione differente (passaggio 1)--> FileWriter myWriter = new FileWriter("libri_inseriti.txt");

		FileWriter myWriter = null;

		try{
			myWriter = new FileWriter(FILE_PATH, true);
			//* */ è la stessa cosa di
			// myWriter = new FileWriter("C:/Users/miche/Documents/libri_inseriti.txt", true);
			//	* soluzione differente (passaggio 2)--> myWriter = new FileWriter(myWriter, true);

			for (int i = 0; i < nLibri; i++) {
				
				myWriter.write(libro[i].getTitolo()+ "\n");
				
				System.out.println(libro[i] + "\n");
			}

		}catch(IOException e) {

			System.err.println("Errore gestione file: " + e.getMessage()); 
		
		}finally{
			
//			if(myWriter != null){
			
				try {
					myWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
//			}

		}
//*! FINE ---> CREAZIONE E SCRITTURA DI TESTO IN UN FILE*/

		System.out.println("\n-------------------------------------\n");

//!  INIZIO --->   LETTURA DEL TESTO DI UN FILE
		File file = new File(FILE_PATH);
		// è la stessa cosa di
		// File file = new File("C:/Users/miche/Documents/libri_inseriti.txt");
		Scanner reader = null;
		try {
			reader = new Scanner(file);

			while (reader.hasNextLine()) {
				
				String line = reader.nextLine();
				System.out.println(line);
			}

		} catch(Exception e) {

			System.out.println("Errore lettura del file: " + e.getMessage());

		}finally{

			if(reader != null){
				
				reader.close();
			}
		}
//!  FINE --->   LETTURA DEL TESTO DI UN FILE

	}
}
	
