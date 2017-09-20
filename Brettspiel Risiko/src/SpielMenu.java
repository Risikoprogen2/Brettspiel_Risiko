import java.awt.*;

import javax.swing.*;


//Autor Jonas Behler

public class SpielMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void Menu() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpielMenu frame = new SpielMenu();
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
	public SpielMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 308);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//Menü Übersicht
		JLabel lblMenu = new JLabel("Risiko");
		lblMenu.setBackground(SystemColor.activeCaption);
		lblMenu.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setOpaque(true);
		lblMenu.setBounds(0, 0, 432, 80);
		contentPane.add(lblMenu);
		
		//Zurück zum Spiel
		JButton btnBackToGame = new JButton("Zur\u00FCck zum Spiel");
		btnBackToGame.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnBackToGame.setBackground(UIManager.getColor("Button.background"));
		btnBackToGame.setBounds(0, 80, 432, 60);
		contentPane.add(btnBackToGame);
		
		//Zurück zum Hauptmenü
		JButton btnHauptmenu = new JButton("Zur\u00FCck zum Hauptmen\u00FC");
		btnHauptmenu.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnHauptmenu.setBackground(SystemColor.menu);
		btnHauptmenu.setBounds(0, 140, 432, 60);
		contentPane.add(btnHauptmenu);
		
		//Spiel beenden
		JButton btnSpielBeenden = new JButton("Spiel beenden");
		btnSpielBeenden.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSpielBeenden.setBackground(SystemColor.menu);
		btnSpielBeenden.setBounds(0, 200, 432, 60);
		contentPane.add(btnSpielBeenden);
	}
}
