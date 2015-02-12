import java.awt.Color;
 
public class BalleColoree extends Balle implements BalleCouleur {
	protected Color couleur;
	public BalleColoree(String name, int rayon, Color couleur) {
		super(name,rayon);	
		this.couleur = couleur;
	}
	
	public Color getCouleur() {
		return this.couleur;
	}

	public String toString() {
		return (super.toString() + ":"+this.couleur);
	}

}