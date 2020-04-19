import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Carrera extends JFrame implements ActionListener{
	JPanel[] paneles;
	JLabel[] labels;
	String[] nombres = {"conejo","tortuga","zorro"};
	JButton btnComenzar;
	JButton btnPausar;
	JButton btnReanudar;
	JButton btnTerminar;
	final int ANCHO =700;
	public Carrera(){
 		setLayout(new GridLayout(0,1));
		paneles = new JPanel[3];
		labels = new JLabel[3];
		//Agregar Paneles y etiquetas
		JPanel panelBotones;
		panelBotones= new JPanel();
		panelBotones.setLayout(new FlowLayout());

		btnComenzar=new JButton("Comenzar");
		btnPausar=new JButton("Pausar");
		btnReanudar=new JButton("Reanudar");
		btnTerminar= new JButton("Terminar");
	
	//Agregamos los botones a el panel
	
		panelBotones.add(btnComenzar);
		panelBotones.add(btnPausar);
		panelBotones.add(btnReanudar);
		panelBotones.add(btnTerminar);

		add(panelBotones);

		for(int i=0; i<3; i++){
			paneles[i] = new JPanel();
			add(paneles[i]);
			labels[i] = new JLabel(nombres[i]);
			labels[i].setIcon(new ImageIcon(getClass().getResource(nombres[i]+".gif")));
			labels[i].setLocation(0, 0);
			paneles[i].add(labels[i]);
		}
		
		//Agregamos escuchadores a los botones
		
		btnComenzar.addActionListener(this);
		btnPausar.addActionListener(this);
		btnReanudar.addActionListener(this);
		btnTerminar.addActionListener(this);
		
		setSize(ANCHO,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		/*Necesitan ser declarados como atributos los animales aunque si son inicializados en 
		el boton de comenzar.

		Necesitas crear los if else de los botones para separar los eventos


		if(arg0.getSource()==btnComenzar){}else if(arg0.getSource()==btnPausar){}
		*/
		Animalito conejo = new Animalito("conejo", ANCHO-180,labels[0]);
		Animalito tortuga = new Animalito("tortuga", ANCHO-180,labels[1]);
		Animalito zorro = new Animalito("zorro", ANCHO-180,labels[2]);
		
		conejo.start();
		tortuga.start();
		zorro.start(); 
		
	}
}
