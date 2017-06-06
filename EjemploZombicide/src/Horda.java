public class Horda {
	
	private int respawn;
	
	public Horda() {
		super();
	}

	public int getRespawn() {
		return respawn;
	}
	
	public void setRespawn(int respawn) {
		this.respawn = respawn;
	}

	public void resetRespawn(){
		respawn = 5;
	}
	
	public void caminar(){
		respawn--;
	}
}