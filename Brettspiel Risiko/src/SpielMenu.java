import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

//Autor: Jonas Behler

public class SpielMenu {

	public void menu(Graphics g){
		Font fnt0 = new Font("arail", Font.BOLD, 40);
		g.setFont(fnt0);
		g.setColor(Color.black);
		g.drawString("Risiko", 20 , 50);
	}
}
