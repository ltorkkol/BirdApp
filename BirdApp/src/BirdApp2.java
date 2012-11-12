

import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

@SuppressWarnings("serial")
public class BirdApp2 extends JPanel
{
	BufferedImage image;
	
	
	public BirdApp2(BufferedImage image)
	{
		this.image = image;
	}	
	
	
	public static void main(String args[]) throws IOException
	{
		JFrame frame = new JFrame("Bird App");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String penguinsPic = "pics/Penguins.jpg";
		
		BufferedImage image = ImageIO.read(new File(penguinsPic));
		BirdApp2 contentPane = new BirdApp2(image);
		contentPane.setOpaque(true);
		contentPane.setLayout(new BorderLayout());
		
		
		frame.setContentPane(contentPane);
		frame.setLocationRelativeTo(null);
		
	}
}