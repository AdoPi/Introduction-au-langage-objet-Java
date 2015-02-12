
public class Balle {
	protected int x,y;
	protected String name;
	protected int rayon;

	public Balle(String name, int rayon) {
		this.name = "|"+name+"|";
		this.rayon = rayon;
	}

	public void translater(int dx, int dy) {
		x += dx;
		y += dy;
	}


	public String toString() {
		return (this.name+":("+x+","+y+")");
	}

	public String getNom() {
		return this.name;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}	
	public int getRayon() {
		return this.rayon;
	}


}