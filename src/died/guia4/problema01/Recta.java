package died.guia4.problema01;

public class Recta {
	private Punto p1;
	private Punto p2;
	
	public Recta(Punto p1, Punto p2) {
		this.p1=p1;
		this.p2=p2;
	}
	
	public Recta () {
		this.p1= new Punto (1,1);
		this.p2= new Punto (2,2);	
	}
	
	public float pendiente() {
		return (this.p2.getY()-this.p1.getY())/(this.p2.getX()-this.p1.getX());
	}
	
	public boolean paralelas(Recta r) {
		if (this.pendiente()==r.pendiente()) {
			return true;
		}
		return false;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Recta){
			Recta r3 =new Recta(this.p1, ((Recta)obj).p2);
			if(this.pendiente()==r3.pendiente() &&((Recta)obj).pendiente()==r3.pendiente()){
				return true;
			}
		}
		return false;
	}
	

}
