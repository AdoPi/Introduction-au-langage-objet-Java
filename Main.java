import javax.swing.*;
import java.awt.*;

public class Main {
	public static void main(String[] args) {
		new Fenetre(new PanneauBalle(new BalleColoree("kebab",10,Color.RED)));
	}
}