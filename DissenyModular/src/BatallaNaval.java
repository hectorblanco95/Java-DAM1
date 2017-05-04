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
	}

	static void colocaBarco(char[][] barcos, int mida, char orient){

		// int ranFila = random(0..9);
		// int ranCol = random(0..9);

		if(orient == 'H'){

			// Comprobar que el barco cabe en horizontal, sumando mida a la posici�n random del barco
			// Si no cabe, generar nuevas filas y columnas aleatorias
			// Comprobar que el barco tiene todas las posiciones libres
			// Si hay alguna 'B' en alguna posici�n, generar nuevas filas y columnas aleatorias
		}
		if(orient == 'V'){

			// Lo mismo para la orientaci�n vertical

		}

	}
}