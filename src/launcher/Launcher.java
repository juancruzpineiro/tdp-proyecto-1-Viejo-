package launcher;
import entities.*;
import gui.*;
import javax.swing.JFrame;
import java.awt.*;
public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	JFrame ventana = new SimplePresentationScreen(new Student(121302, "Piñeiro", "Juan Cruz", "juancruzpineiro@gmail.com", "https://github.com/juancruzpineiro", "/images/tdp.png"));
            	ventana.setVisible(true);
            	
            }
        });
    }
}