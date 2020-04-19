import javax.swing.JLabel;

public class Animalito extends Thread {
	String nombre;
	int limite;
	JLabel lblAnimal;
	
	public Animalito(String nombre, int limite, JLabel lblAnimal){
		this.nombre = nombre;
		this.limite = limite;
		this.lblAnimal = lblAnimal;
	}
	
	public void run(){
		for(int i=1; i<=limite; i++){
			System.out.println(nombre + " avanza");
			lblAnimal.setLocation(i, 0);
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(nombre + " Llegó a la meta");
	}

}
