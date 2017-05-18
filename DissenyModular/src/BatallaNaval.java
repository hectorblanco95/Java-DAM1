public class BatallaNaval{

	public static void main (String[] args){

		char[][] barcos = new char[10][10];

		for (int i = 0; i < barcos.length; i++) {
			for (int j = 0; j < barcos[i].length; j++) {
				barcos[i][j] = '*';
				System.out.print (barcos[i][j]);
			}
			System.out.println ("");
		}

		System.out.println ("");
		System.out.println ("");

		colocaBarco(barcos, 4, 'H');
		colocaBarco(barcos, 3, 'V');
		colocaBarco(barcos, 2, 'H');
		colocaBarco(barcos, 1, 'V');

		// Todos los barcos est�n correctamente colocados

		// Pedir usuario fila y columna a atacar

		// ...
		
		for (int i = 0; i < barcos.length; i++) {
			for (int j = 0; j < barcos[i].length; j++) {
	
				System.out.print (barcos[i][j]);
			}
			System.out.println ("");
		}

		System.out.println ("");
		System.out.println ("");
	}

	static void colocaBarco(char[][] barcos, int mida, char orient){

		int ranFila = (int) (Math.random() * 9);
		int ranCol = (int) (Math.random() * 9);

		if(orient == 'H'){
			// Comprobar que el barco cabe en horizontal, sumando mida a la posici�n random del barco
			// Si no cabe, generar nuevas filas y columnas aleatorias
			while (ranCol+mida>9){
				ranCol = (int) (Math.random() * 9);
			}
			// Comprobar que el barco tiene todas las posiciones libres
			// Si hay alguna 'X' en alguna posici�n, generar nuevas filas y columnas aleatorias
			for(int i=0;i<mida;i++){
				if(barcos[ranFila][ranCol+i]!='X'){
					barcos[ranFila][ranCol+i]='X';
				} else{
					while (ranCol+mida>9){
						ranCol = (int) (Math.random() * 9);
					}
					while (ranFila+mida>9){
						ranFila = (int) (Math.random() * 9);
					}
				}
			}
		}
		if(orient == 'V'){
			// Lo mismo para la orientaci�n vertical
			while (ranFila+mida>9){
				ranFila = (int) (Math.random() * 9);
			}
			for(int i=0;i<mida;i++){
				if(barcos[ranFila+i][ranCol]!='X'){
					barcos[ranFila+i][ranCol]='X';
				} else{
					while (ranCol+mida>9){
						ranCol = (int) (Math.random() * 9);
					}
					while (ranFila+mida>9){
						ranFila = (int) (Math.random() * 9);
					}
				}
			}
		}
	}
}