package unah.edu.poo;

public class Main {

	public static void main(String[] args) {
		
		Juguete J1 = new BuzzLightYear(2014);
		JugueteVolador J2 = new BuzzLightYear(2015);
		BuzzLightYear J3 = new BuzzLightYear(2016);
		
		J1.hablar();
		J2.volar();
		System.out.println(J3.getNombre());
		System.out.println("---------------------------------");
		

	}

}
