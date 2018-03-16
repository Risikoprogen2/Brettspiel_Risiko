//Autor Jonas Behler

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;




public class SpielMenu extends JFrame {

	private JFrame menuframe;
	
	//Erstellen und öffnen des Fensters
	public static void Menu() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpielMenu window = new SpielMenu();
					window.menuframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	//Men� Fenster
	public SpielMenu() {
		menuframe = new JFrame();
		menuframe.setBackground(SystemColor.menu);
		menuframe.getContentPane().setLayout(null);
		menuframe.setSize(450, 309);
		
		//Men� �bersicht
		JLabel lblMenu = new JLabel("Risiko");
		lblMenu.setBackground(SystemColor.controlShadow);
		lblMenu.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setOpaque(true);
		lblMenu.setBounds(0, 0, 432, 80);
		menuframe.getContentPane().add(lblMenu);
		
		//Zur�ck zum Spiel
		JButton btnBackToGame = new JButton("Zur\u00FCck zum Spiel");
		btnBackToGame.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnBackToGame.setBackground(SystemColor.menu);
		btnBackToGame.setBounds(0, 80, 432, 60);
		menuframe.getContentPane().add(btnBackToGame);
		btnBackToGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				menuframe.dispose();
				}
		});
		

		//Zur�ck zum Hauptmen�
		JButton btnHauptmenu = new JButton("Zur\u00FCck zum Hauptmen\u00FC");
		btnHauptmenu.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnHauptmenu.setBackground(SystemColor.menu);
		btnHauptmenu.setBounds(0, 140, 432, 60);
		menuframe.getContentPane().add(btnHauptmenu);
		btnHauptmenu.addActionListener(new ActionListener() {
			private Welcome welcome;
			private SpielKarte1 karte1;
			public void actionPerformed(ActionEvent e){
				menuframe.dispose();
				welcome = new Welcome();
				welcome.Start_Welcome();
				karte1 = new SpielKarte1();
				karte1.SpielkarteSchliessen();
				}
		});
		
		
		
		//Spiel beenden
		JButton btnSpielBeenden = new JButton("Spiel beenden");
		btnSpielBeenden.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSpielBeenden.setBackground(SystemColor.menu);
		btnSpielBeenden.setBounds(0, 200, 432, 60);
		menuframe.getContentPane().add(btnSpielBeenden);
		btnSpielBeenden.addActionListener(new ActionListener(){
			private SpielKarte1 karte1;
			public void actionPerformed(ActionEvent e){
				menuframe.dispose();
				karte1 = new SpielKarte1();
				karte1.SpielkarteSchliessen();
			}
		
		});
	}
}
