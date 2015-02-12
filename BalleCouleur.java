import javax.swing.*;
import java.awt.*;

public interface BalleCouleur {
	//recupere la couleur de la balle
	public Color getCouleur();	
	//translate la balle
	public void translater(int dx, int dy);	
	//recupere le nom de la balle
	public String getNom();
	//recupere l'abscisse de la balle
	public int getX();
	//recupere l'ordonnee de la balle
	public int getY();
	//recupere le rayon de la balle
	public int getRayon(); 
}