public class Superviviente {

	Armas arma;
	private int vida = 3;
	private int nivel = 0;
	private Skill skill = Skill.Rapido;
	private TipoArma tipo = TipoArma.Sarten;
	
	public Superviviente() {
	}
	
	public Superviviente(int vida, int nivel) {
		this.vida = vida;
		this.nivel = nivel;
	}
	
	public Superviviente(int vida, int nivel, Skill skill) {
		this.vida = vida;
		this.nivel = nivel;
		this.skill = skill;
	}
	
	public Superviviente(int vida, int nivel, Skill skill, TipoArma tipo) {
		this.vida = vida;
		this.nivel = nivel;
		this.skill = skill;
		this.tipo = tipo;
	}

	public int getVida() {
		return vida;
	}
	public int getNivel() {
		return nivel;
	}
	public Skill getSkill() {
		return skill;
	}
	public Armas getArma() {
		return arma;
	}
	public TipoArma getTipoArma() {
		return tipo;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public void setArma(Armas arma) {
		this.arma = arma;
	}
	public void setTipoArma(TipoArma tipo) {
		this.tipo = tipo;
	}
	
	public boolean TieneArma(){
		if(this.arma == null){
			return false;
		}else{
			return true;
		}
	}
	
	public void DeleteArma(){
		this.arma = null;
	}

}
