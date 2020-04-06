package died.guia4.problema03;
import died.guia4.problema02.*;

public class Registro {
	public static final int MAX_ARREGLO =10;
	private String ciudad;
	private Temperatura[] historico;
	private int actual=0;
	
	public Registro () {
		this.ciudad = "-";
		this.historico = new Temperatura[MAX_ARREGLO];
	}
	
	public Registro (String ciudad) {
		this.ciudad=ciudad;
		this.historico = new Temperatura[MAX_ARREGLO];
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public void imprimir() {
		System.out.println("temperaturas registradas en "+this.ciudad);
		for (int i=0; i<actual; i++) {
			System.out.println(i+1+"   "+this.historico[i].toString());
		}
	}
	
	public double mediaAsCelcius() {
		double suma = 0.0;
		for (Temperatura temperatura : historico) {
			suma+=temperatura.asCelcius();
		}
		return (suma/this.historico.length);
	}
	
	public double mediaAsFahrenheit() {
		double suma = 0.0;
		for (Temperatura temperatura : historico) {
			suma+=temperatura.asFahrenheit();
		}
		return (suma/this.historico.length);
	}
	
	public Temperatura maximo() {
		
		return maximo(this.historico[0], 0);
	}
	
	private Temperatura maximo(Temperatura max, int contador) {
		if(contador> this.historico.length-1) {
			return max;
		}
		if(this.historico[contador].getGrados()> max.getGrados()) {
			max=this.historico[contador];
		}
		return maximo(max, contador+1);
		
	}
	
	public void agregar(Temperatura t) {
		this.historico[actual] = t;
		actual++;
	}

}
