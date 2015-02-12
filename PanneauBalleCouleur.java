import javax.swing.*;
import java.awt.*;

public abstract class PanneauBalleCouleur extends JPanel {

	protected BalleCouleur balle;

	//methode deja definie
	public void paintComponent(Graphics g) {
		g.setColor(balle.getCouleur());
		g.fillOval(balle.getX(),balle.getY(),balle.getRayon(),balle.getRayon());
	}

	//methodes abstraites a definir 

	//translater une balle
	public abstract void translaterBalle(int dx, int dy);	

	public abstract String getNomBalle();
	//recupere l'abscisse de la balle dans le jpanel
	public abstract int getXBalle();
	//recupere l'ordonnee de la balle dans le jpanel
	public abstract int getYBalle();
	//recupere le rayon de la balle
	public abstract int getRayonBalle();

}