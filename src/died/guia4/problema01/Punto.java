package died.guia4.problema01;

public class Punto {
	private float x;
	private float y;
	
	public Punto (float x, float y) {
		this.x=x;
		this.y=y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Punto && this.x == ((Punto) obj).getX() && this.y == ((Punto) obj).getY())
		return true;
		else return false;
	}
	

}
