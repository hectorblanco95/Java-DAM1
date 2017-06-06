//import javax.xml.crypto.dsig.CanonicalizationMethod;

public class ZombicideApp {

	public static void main (String[] args){
		
		
		Armas sarten = new Armas(2, 1, TipoArma.Sarten);
		Armas pistola = new Armas(15, 20, TipoArma.Pistola);
		Armas escopeta = new Armas(25, 5, TipoArma.Escopeta);
		Armas katana = new Armas(30, 3, TipoArma.Katana);
		
		Superviviente Kaua = new Superviviente(6, 1, Skill.Fortachon);
		Kaua.setArma(sarten);
		Superviviente Dani = new Superviviente();
		Dani.setArma(sarten);
		
		Zombie Caminante = new Zombie(2, 1, TipoZombie.Caminante);
		Zombie Gordo = new Zombie(2, 1, TipoZombie.Gordo);
		
		System.out.println("KAUA");
		System.out.println("Nivel: " + Kaua.getNivel());
		System.out.println("Vida: " + Kaua.getVida());
		System.out.println("Arma: " + Kaua.getTipoArma());
		System.out.println("Daño: " + Kaua.getArma().getDaño());
		System.out.println();
		System.out.println("DANI");
		System.out.println("Nivel: " + Dani.getNivel());
		System.out.println("Vida: " + Dani.getVida());
		System.out.println("Arma: " + Dani.getTipoArma());
		System.out.println();
		System.out.println("Caminante");
		System.out.println("Daño: " + Caminante.getDaño());
		System.out.println("Movimiento: " + Caminante.getMovimiento());
		System.out.println("Tipo: " + Caminante.getTipo());
		System.out.println("Horda: " + Caminante.getHorda().getRespawn());
		System.out.println();
	}


}