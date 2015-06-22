import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Main {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800, BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****
		
		g.setColor(Color.BLACK);
		int x=35;
		g.setFont(new Font("Cambria", Font.BOLD, 13));
		g.drawString("An array of numbers", 230, 42);
		g.drawString("Type: int", 254, 115);
		for (int i = 0; i < 10; i++){
			g.drawRect(x, 50, 50, 50);
			g.drawString((int)(Math.random()*10)+"", x+25, 79);
			x+=50; 
		}
	}
}