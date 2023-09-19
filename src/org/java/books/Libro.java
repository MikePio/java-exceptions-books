package org.java.books;

public class Libro {

  private String titolo;
  private int numeroPagine;
  private String autore;
  private String editore;

  public Libro(String titolo, int numeroPagine, String autore, String editore) throws Exception{
    
		setTitolo(titolo);
		setNumeroPagine(numeroPagine);
		setAutore(autore);
		setEditore(editore);
  }

	public String getTitolo() {
		return titolo;
	}
	
	public void setTitolo(String titolo) throws Exception{

		if(titolo.isBlank()){
			throw new Exception("\nNon hai inserito nessun titolo");
		}

		this.titolo = titolo;
	}
	
	public int getNumeroPagine() {
		return numeroPagine;
	}
	
	public void setNumeroPagine(int numeroPagine) throws Exception {
		
		if(numeroPagine<=0){
			throw new Exception("\nIl libro deve avere almeno una pagina");
		}
		
		this.numeroPagine = numeroPagine;
	}
	
	public String getAutore() {
		return autore;
	}
	
	public void setAutore(String autore) throws Exception{

		if(autore.isBlank()){
			throw new Exception("\nNon hai inserito nessun autore");
		}

		this.autore = autore;
	}
	
	public String getEditore() {
		return editore;
	}
	
	public void setEditore(String editore) throws Exception{
		
		if(editore.isBlank()){
			throw new Exception("\nNon hai inserito nessun editore");
		}
		
		this.editore = editore;
	}

	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", numeroPagine=" + numeroPagine + ", autore=" + autore + ", editore="
				+ editore + "]";
	}
  
  
  
}
















