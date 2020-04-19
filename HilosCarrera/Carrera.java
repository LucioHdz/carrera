import java.awt.GridLayout;
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
		setLayout(new GridLayout(0,1));
		paneles = new JPanel[3];
		labels = new JLabel[3];
		//Agregar Paneles y etiquetas
		JPanel panelBotones;
		panelBotones= new JPanel():
		panelBotones.setLayout(new floatLayout());

		JButton btn Comenzar;
		btnPausar=new JButton("Comenzar");

		JButton btnPausar;
		btnPausar=new JButton("Pausar");
		
		JButton btn Reanudar;
		btnPausar=new JButton("Reanudar");

		JButton btn Terminar;
		btnPausar= new JButton("Terminar");

		panelBotones.add(Pausar);
		panelBotones.add(Reanudar);
		panelBotones.add(Terminar)

		add(panelBotones);

		for(int i=0; i<3; i++){
			paneles[i] = new JPanel();
			add(paneles[i]);
			labels[i] = new JLabel(nombres[i]);
			labels[i].setIcon(new ImageIcon(getClass().getResource(nombres[i]+".gif")));
			labels[i].setLocation(0, 0);
			paneles[i].add(labels[i]);
		}
		btnComenzar = new JButton(".: Comenzar Carrera :.");
		add(btnComenzar);
		btnComenzar.addActionListener(this);
		
		setSize(ANCHO,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Animalito conejo = new Animalito("conejo", ANCHO-180,labels[0]);
		Animalito tortuga = new Animalito("tortuga", ANCHO-180,labels[1]);
		Animalito zorro = new Animalito("zorro", ANCHO-180,labels[2]);
		
		conejo.start();
		tortuga.start();
		zorro.start(); 
		
	}
}
