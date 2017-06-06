public class Armas {
	
	private int daño = 1;
	private int distancia = 0;
	private TipoArma tipo = TipoArma.Sarten;
	
	public Armas() {
		super();
	}
	
	public Armas(int daño, int distancia) {
		super();
		this.daño = daño;
		this.distancia = distancia;
	}
	
	public Armas(int daño, int distancia, TipoArma tipo) {
		this.daño = daño;
		this.distancia = distancia;
		this.tipo = tipo;
	}

	public int getDaño() {
		return daño;
	}
	public int getDistancia() {
		return distancia;
	}
	public TipoArma getTipo() {
		return tipo;
	}
	
	public void setDaño(int daño) {
		this.daño = daño;
	}
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	public void setTipo(TipoArma tipo) {
		this.tipo = tipo;
	}
	
	public void armarse(){
		System.out.println("AL FIN UN APOCALIPSIS ZOMBIE!!!!!! !u!");
	}
	
	
}