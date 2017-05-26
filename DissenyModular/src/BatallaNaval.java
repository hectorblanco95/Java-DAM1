public class BatallaNaval{

	public static void main (String[] args){

		char[][] barcos = new char[10][10];

		for (int i = 0; i < barcos.length; i++) {
			for (int j = 0; j < barcos[i].length; j++) {
				barcos[i][j] = '*';
				System.out.print (barcos[i][j]);
			}
			System.out.println ();
		}

		System.out.println ();
		System.out.println ();

		colocaBarco(barcos, 5, 'V');
		colocaBarco(barcos, 4, 'H');
		colocaBarco(barcos, 3, 'V');
		colocaBarco(barcos, 2, 'H');

		// Todos los barcos est�n correctamente colocados

		// Pedir usuario fila y columna a atacar

		// ...

		for (int i = 0; i < barcos.length; i++) {
			for (int j = 0; j < barcos[i].length; j++) {

				System.out.print (barcos[i][j]);
			}
			System.out.println ();
		}

		System.out.println ();
		System.out.println ();
	}

	private static void colocaBarco(char[][] barcos, int mida, char orient){

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


			if(posicionesLibres(barcos, mida, orient, ranFila, ranCol)){
				for (int i = 0; i < barcos.length; i++) {
					for (int j = 0; j < barcos[i].length; j++) {
						barcos[ranFila][ranCol+i]='X';
						System.out.print (barcos[i][j]);
					}
					System.out.println ();
				}

			} else{
				while (ranCol+mida>9){
					ranCol = (int) (Math.random() * 9);
				}
				while (ranFila+mida>9){
					ranFila = (int) (Math.random() * 9);
				}
			}


		}
		if(orient == 'V'){
			// Lo mismo para la orientaci�n vertical
			while (ranFila+mida>9){
				ranFila = (int) (Math.random() * 9);
			}

			if(posicionesLibres(barcos, mida, orient, ranFila, ranCol)){
				for (int i = 0; i < barcos.length; i++) {
					for (int j = 0; j < barcos[i].length; j++) {
						barcos[ranFila+i][ranCol]='X';
						System.out.print (barcos[i][j]);
					}
					System.out.println ();
				}

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
	private static boolean posicionesLibres(char[][] barcos, int mida, char orient, int ranFila, int ranCol){
		int cont=0;
		if(orient == 'H'){
			if(ranFila==0 && ranCol>0 && ranCol+mida<9){
				for (int i = ranFila; i < ranFila+2; i++) {
					for (int j = ranCol-1; j < ranCol+mida+1; j++) {
						if (barcos[i][j]!='X')
							cont++;
					}
				}
				if(mida==2)
					return (cont==8);
				else if (mida==3)
					return (cont==10);
				else if (mida==4)
					return (cont==12);
				else if (mida==5)
					return (cont==14);
			}
			else if(ranFila==0 && ranCol==0){
				for (int i = ranFila; i < ranFila+2; i++) {
					for (int j = ranCol; j < ranCol+mida+1; j++) {
						if (barcos[i][j]!='X')
							cont++;
					}
				}
				if(mida==2)
					return (cont==6);
				else if (mida==3)
					return (cont==8);
				else if (mida==4)
					return (cont==10);
				else if (mida==5)
					return (cont==12);
			}
			else if(ranFila==0 && ranCol+mida==9){
				for (int i = ranFila; i < ranFila+2; i++) {
					for (int j = ranCol-1; j < ranCol+mida; j++) {
						if (barcos[i][j]!='X')
							cont++;
					}
				}
				if(mida==2)
					return (cont==6);
				else if (mida==3)
					return (cont==8);
				else if (mida==4)
					return (cont==10);
				else if (mida==5)
					return (cont==12);
			}
			else if(ranFila>0 && ranFila<9 && ranCol+mida==9){
				for (int i = ranFila-1; i < ranFila+2; i++) {
					for (int j = ranCol-1; j < ranCol+mida; j++) {
						if (barcos[i][j]!='X')
							cont++;
					}
				}
				if(mida==2)
					return (cont==9);
				else if (mida==3)
					return (cont==12);
				else if (mida==4)
					return (cont==15);
				else if (mida==5)
					return (cont==18);
			}
			else if(ranFila==9 && ranCol+mida==9){
				for (int i = ranFila-1; i < ranFila+1; i++) {
					for (int j = ranCol-1; j < ranCol+mida; j++) {
						if (barcos[i][j]!='X')
							cont++;
					}
				}
				if(mida==2)
					return (cont==6);
				else if (mida==3)
					return (cont==8);
				else if (mida==4)
					return (cont==10);
				else if (mida==5)
					return (cont==12);
			}
			else if(ranFila==9 && ranCol+mida<9){
				for (int i = ranFila-1; i < ranFila+1; i++) {
					for (int j = ranCol-1; j < ranCol+mida+1; j++) {
						if (barcos[i][j]!='X')
							cont++;
					}
				}
				if(mida==2)
					return (cont==8);
				else if (mida==3)
					return (cont==10);
				else if (mida==4)
					return (cont==12);
				else if (mida==5)
					return (cont==14);
			}
			else if(ranFila==9 && ranCol==0){
				for (int i = ranFila-1; i < ranFila+1; i++) {
					for (int j = ranCol; j < ranCol+mida+1; j++) {
						if (barcos[i][j]!='X')
							cont++;
					}
				}
				if(mida==2)
					return (cont==6);
				else if (mida==3)
					return (cont==8);
				else if (mida==4)
					return (cont==10);
				else if (mida==5)
					return (cont==12);
			}
			else{
				for (int i = ranFila-1; i < ranFila+2; i++) {
					for (int j = ranCol-1; j < ranCol+mida+1; j++) {
						if (barcos[i][j]!='X')
							cont++;
					}
				}
				if(mida==2)
					return (cont==12);
				else if (mida==3)
					return (cont==15);
				else if (mida==4)
					return (cont==18);
				else if (mida==5)
					return (cont==21);
			}
		}
		if(orient == 'V'){
			for (int i = ranCol-1; i < ranCol+2; i++) {
				for (int j = ranFila-1; j < ranFila+mida+1; j++) {
					if(barcos[i][j]!='X')
						cont++;
				}
			}
			if(mida==2)
				return (cont==12);
			else if (mida==3)
				return (cont==15);
			else if (mida==4)
				return (cont==18);
			else if (mida==5)
				return (cont==21);
		}
		return false;
	}
}