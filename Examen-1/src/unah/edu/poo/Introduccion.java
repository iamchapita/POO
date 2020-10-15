package unah.edu.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Introduccion extends ParteInforme	{

	private String titulo = "Introduccion";
	private int tamanio = 2;
	private LocalDate fecha = LocalDate.of(2020,10,06);
	private List<Autor> autores = new ArrayList<Autor>();
		
	public String getTituloDocumento() {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	public int getTamanio() {
		// TODO Esbozo de método generado automáticamente
		return 0;
	}

	public String getFecha() {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	public ArrayList<Autor> getAutores() {

		return (ArrayList<Autor>) this.autores; 
	}
	
	public void inicializarIntroduccion() {
		this.autores.add(new Autor(03,"Pedro", "editor"));
		this.autores.add(new Autor(04, "María", "supervisor"));
	}


}
