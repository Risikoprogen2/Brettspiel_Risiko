import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class SpielKarte extends JFrame {

	/**
	 * Methode zum starten des Spielbrett's
	 */
	public static void Start_SpielKarte() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpielKarte frame = new SpielKarte();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SpielKarte() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 817, 518);
		getContentPane().setLayout(null);
		
		//Schleife zum Felder generieren
		/*
		int kordx = 130;
		int kordy = 40;
		int zaehler = 0;
		for(int i= 1; 1<=20; i++)
		{
			Button button_[i] = new Button("Feld " + [i];
			button_[i].setBounds(130, 40, 80, 80);
			getContentPane().add(button_[i]);
			zaehler++;
			
			if(kordx <= 610)
			{
				kordx = 130;
				kordy = kordy + 100;
			}
		}*/
		
		//Felder erstellen
		Button button_1 = new Button("Feld 1");
		button_1.setBounds(130, 40, 80, 80);
		getContentPane().add(button_1);
		
		Button button_2 = new Button("Feld 2");
		button_2.setBounds(250, 40, 80, 80);
		getContentPane().add(button_2);
		
		Button button_3 = new Button("Feld 3");
		button_3.setBounds(370, 40, 80, 80);
		getContentPane().add(button_3);
		
		Button button_4 = new Button("Feld 4");
		button_4.setBounds(490, 40, 80, 80);
		getContentPane().add(button_4);
		
		Button button_5 = new Button("Feld 5");
		button_5.setBounds(610, 40, 80, 80);
		getContentPane().add(button_5);
		
		Button button_6 = new Button("Feld 6");
		button_6.setBounds(130, 140, 80, 80);
		getContentPane().add(button_6);
		
		Button button_7 = new Button("Feld 7");
		button_7.setBounds(250, 140, 80, 80);
		getContentPane().add(button_7);
		
		Button button_8 = new Button("Feld 8");
		button_8.setBounds(370, 140, 80, 80);
		getContentPane().add(button_8);
		
		Button button_9 = new Button("Feld 9");
		button_9.setBounds(490, 140, 80, 80);
		getContentPane().add(button_9);
		
		Button button_10 = new Button("Feld 10");
		button_10.setBounds(610, 140, 80, 80);
		getContentPane().add(button_10);
		
		Button button_11 = new Button("Feld 11");
		button_11.setBounds(130, 240, 80, 80);
		getContentPane().add(button_11);
		
		Button button_12 = new Button("Feld 12");
		button_12.setBounds(250, 240, 80, 80);
		getContentPane().add(button_12);
		
		Button button_13 = new Button("Feld 13");
		button_13.setBounds(370, 240, 80, 80);
		getContentPane().add(button_13);
		
		Button button_14 = new Button("Feld 14");
		button_14.setBounds(490, 240, 80, 80);
		getContentPane().add(button_14);
		
		Button button_15 = new Button("Feld 15");
		button_15.setBounds(610, 240, 80, 80);
		getContentPane().add(button_15);
		
		Button button_16 = new Button("Feld 16");
		button_16.setBounds(130, 340, 80, 80);
		getContentPane().add(button_16);
		
		Button button_17 = new Button("Feld 17");
		button_17.setBounds(250, 340, 80, 80);
		getContentPane().add(button_17);
		
		Button button_18 = new Button("Feld 18");
		button_18.setBounds(370, 340, 80, 80);
		getContentPane().add(button_18);
		
		Button button_19 = new Button("Feld 19");
		button_19.setBounds(490, 340, 80, 80);
		getContentPane().add(button_19);
		
		Button button_20 = new Button("Feld 20");
		button_20.setBounds(610, 340, 80, 80);
		getContentPane().add(button_20);
		 
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Risiko.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, 0, 800, 470);
		getContentPane().add(lblNewLabel);
	}
}
