public class Zombie {
	
	private int daño = 1;
	private int movimiento = 5;
	private TipoZombie tipo = TipoZombie.Caminante;
	Horda horda = new Horda();
	
	public Zombie() {
		horda.caminar();
	}
	
	
	public Zombie(int daño, int movimiento, TipoZombie tipo) {
		super();
		this.daño = daño;
		this.movimiento = movimiento;
		this.tipo = tipo;
		horda.caminar();
	}

	public int getDaño() {
		return daño;
	}
	
	public int getMovimiento() {
		return movimiento;
	}
	
	public TipoZombie getTipo() {
		return tipo;
	}
	
	public Horda getHorda() {
		return horda;
	}

	public void setDaño(int daño) {
		this.daño = daño;
	}
	
	public void setMovimiento(int movimiento) {
		this.movimiento = movimiento;
	}
	
	public void setTipo(TipoZombie tipo) {
		this.tipo = tipo;
	}

	public void setHorda(Horda horda) {
		this.horda = horda;
	}
	
	
	

}
