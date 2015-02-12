import javax.swing.*;
import java.awt.*;
public class PanneauBalle extends PanneauBalleCouleur {


	BalleColoree balle;
	public PanneauBalle(BalleColoree balle) {
		this.balle = balle;
		this.setBackground(Color.BLACK);
	}

	public void paintComponent(Graphics g) {
		g.setColor(balle.getCouleur());
		g.fillOval(balle.getX(),balle.getY(),balle.getRayon(),balle.getRayon());
	}

	public String getNomBalle() {
		return balle.getNom();
	}

	public void translaterBalle(int dx, int dy) {
		this.balle.translater(dx,dy);
		//a chaque fois qu'on translate, on appelle repaint
		//ici, l'exemple est simple mais pour les situations plus complexes
		//voir le pattern Observer/Observable
		repaint();
	}
	public int getXBalle() {
		return balle.getX();
	}
	public int getYBalle() {
		return balle.getY();
	}
	public int getRayonBalle() {
		return balle.getRayon();
	}
}