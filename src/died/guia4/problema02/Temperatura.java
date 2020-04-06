package died.guia4.problema02;

public class Temperatura {
	private double grados;
	private Escala escala;
	
	public Temperatura () {
		this.grados = 0;
		this.escala = Escala.CELCIUS;
	}
	public Temperatura(double grados, Escala escala) {
		this.grados = grados;
		this.escala = escala;
	}
	
	public double getGrados() {
		return grados;
	}
	@Override
	public String toString() {
		if(this.escala==Escala.CELCIUS) {
			return (this.grados)+"° C";
		}
		else return (this.grados)+ "° F";
	}
	public double asCelcius() {
		if(this.escala==Escala.CELCIUS) {
			return this.grados;
		}
		else return ((this.grados -32)*5)/9;
	}
	public double asFahrenheit() {
		if (this.escala==Escala.FAHRENHEIT) {
			return this.grados;
		}
		else return (this.grados *9)/5 +32;
	}
	
	public void aumentar (Temperatura temp) {
		if(temp.grados <=0.0) {
			return;
		}
		if(this.escala == temp.escala) {
			this.grados= this.grados +temp.grados;
		}
		else
			if(this.escala ==Escala.CELCIUS) {
				this.grados = this.grados + temp.asCelcius();
				
			}
			else this.grados = this.grados + temp.asFahrenheit();
	}
	
	public void disminuir (Temperatura temp) {
		if(temp.grados <=0.0) {
			return;
		}
		if(this.escala == temp.escala) {
			this.grados= this.grados -temp.grados;
		}
		else
			if(this.escala ==Escala.CELCIUS) {
				this.grados = this.grados - temp.asCelcius();
				
			}
			else this.grados = this.grados - temp.asFahrenheit();
	}
	
	
}
