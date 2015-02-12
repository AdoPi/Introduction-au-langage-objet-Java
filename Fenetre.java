import javax.swing.*;
import java.awt.*;
public class Fenetre extends JFrame {
	private PanneauBalle panneau;
	//faire fenetre avec titre
	public Fenetre(PanneauBalle panneau) {
		this.panneau = panneau;
		setLayout(new BorderLayout());
		add(BorderLayout.CENTER,panneau);
		add(BorderLayout.SOUTH,new JLabel(panneau.getNomBalle()));
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	    pack();
		setVisible(true);

		lancerBalle();
	}


	//boucle principale du programme
	protected void lancerBalle() {
		int dx = 1;
		int dy = 1;
		while(true) {
			int x = panneau.getXBalle();
			int y = panneau.getYBalle();
			int rayon = panneau.getRayonBalle();

			if (x<1)
				dx = 1;
			if (x > panneau.getWidth()-rayon)
				dx = -1;

			if (y<1)
				dy = 1;
			if (y > panneau.getHeight()-rayon)
				dy = -1;

			panneau.translaterBalle(dx,dy);
			attente();			
		}
	}


	private void attente() {
		try {
			Thread.sleep(5);
		} catch(Exception e) {}
	}
}