
public class Superviviente {
	private int vidas=3;
    private int nivel=0;
    private SkillsPersonaje skill= SkillsPersonaje.RAPIDO;
    
    public Superviviente() { }
    
	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public SkillsPersonaje getSkill() {
		return skill;
	}

	public void setSkill(SkillsPersonaje skill) {
		this.skill = skill;
	}
}