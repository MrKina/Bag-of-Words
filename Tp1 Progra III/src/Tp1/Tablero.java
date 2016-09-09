package Tp1;

import java.util.ArrayList;
import java.util.Random;

public class Tablero {

	int tablero[][] = new int[4][4];
	int Score = 0;
	int Movimiento = 0;
	boolean EstaTerminado = false;
	boolean Gano = false;

	void tablero() {

		for (int x = 0; x < tablero.length; x++) {
			for (int y = 0; y < tablero[x].length; y++) {
				System.out.print(tablero[x][y]);
			}
			System.out.print("\n");
		}
	}

	void inicializarTablero() {
		Random r = new Random();
		for (int i = 0; i < 2; i++) {
			int x = r.nextInt(4);
			int y = r.nextInt(4);
			int randomNum = 2 + (int) (Math.random() * 3);
			if (tablero[x][y] == 0 && randomNum % 2 == 0) {
				tablero[x][y] = randomNum;
			} else {
				i--;
			}
		}
	}

	public int get(int x, int y) {
		return tablero[x][y];
	}

	void RandomNumero() {
		Random r = new Random();

		for (int i = 0; i == 1; i++) {
			int x = r.nextInt(4);
			int y = r.nextInt(4);
			int randomNum = 2 + (int) (Math.random() * 3);
			if (tablero[x][y] == 0 && randomNum % 2 == 0) {
				tablero[x][y] = randomNum;
			} else {
				i--;
			}
		}
	}

	public void MoverIzquierda() {
		ArrayList<Integer> Auxiliar = new ArrayList<Integer>();
		for (int y = 0; y < tablero.length; y++) {
			Auxiliar.clear();
			for (int x = 0; x < tablero.length; x++) {
				if (tablero[x][y] != 0) {
					Auxiliar.add(tablero[x][y]);
				}
			}
			AlinearIzquierda(y, Auxiliar);
		}

		for (int y = 0; y < tablero.length; y++) {
			for (int x = 0; x < tablero.length - 1; x++) {
				if (tablero[x][y] == tablero[x + 1][y]) {
					Score = tablero[x][y] += tablero[x + 1][y];
					tablero[x + 1][y] = 0;
				}
			}
		}

		Auxiliar.clear();

		for (int y = 0; y < tablero.length; y++) {
			Auxiliar.clear();
			for (int x = 0; x < tablero.length; x++) {
				if (tablero[x][y] != 0) {
					Auxiliar.add(tablero[x][y]);
				}
			}
			AlinearIzquierda(y, Auxiliar);
		}

	}
	private void AlinearIzquierda(int y, ArrayList<Integer> Auxiliar) {
		while (Auxiliar.size() <= tablero.length) {
			Auxiliar.add(0);
		}
		for (int x = 0; x < tablero.length; x++) {
			tablero[x][y] = (int) Auxiliar.get(x);

		}
	}

	public void MoverDerecha() {
		ArrayList<Integer> Auxiliar = new ArrayList<Integer>();
		for (int y = 0; y < tablero.length; y++) {
			Auxiliar.clear();
			for (int x = 0; x < tablero.length; x++) {
				if (tablero[x][y] != 0) {
					Auxiliar.add(tablero[x][y]);
				}
			}
			AlinearDerecha(y, Auxiliar);
		}

		for (int y = 0; y < tablero.length; y++) {
			for (int x = 0; x < tablero.length - 1; x++) {
				if (tablero[x][y] == tablero[x + 1][y]) {
					tablero[x][y] += tablero[x + 1][y];
					tablero[x + 1][y] = 0;
				}
			}
		}

		Auxiliar.clear();

		for (int y = 0; y < tablero.length; y++) {
			Auxiliar.clear();
			for (int x = 0; x < tablero.length; x++) {
				if (tablero[x][y] != 0) {
					Auxiliar.add(tablero[x][y]);
				}
			}
			AlinearDerecha(y, Auxiliar);
		}

	}

	private void AlinearDerecha(int y, ArrayList<Integer> Auxiliar) {
		while (Auxiliar.size() <= tablero.length) {
			Auxiliar.add(0);
		}
		for (int x = 0; x < tablero.length; x++) {
			tablero[x][y] = (int) Auxiliar.get(x);

		}
	}

	public void MostrarMatriz() {
		for (int y = 0; y < tablero.length; y++) {
			for (int x = 0; x < tablero.length; x++) {
				System.out.print(tablero[x][y] + " | ");
			}
			System.out.print("\n");
		}
	}

	public String toString(int x, int y) {
		String Cadena = String.valueOf(tablero[x][y]);
		return Cadena;
	}
	
	public String toString(int Score) {
		String Cadena = String.valueOf(Score);
		return Cadena;
	}
	

	public void Gano() {
		for (int y = 0; y < tablero.length; y++) {
			for (int x = 0; x < tablero.length; x++) {
				if (tablero[x][y] == 2048) {
					Gano = true;
					EstaTerminado = true;
				}
			}
		}
	}

	public void HayMovimientos() {
		for (int y = 0; y < tablero.length; y++) {
			for (int x = 0; x < tablero.length; x++) {
				if (tablero[x][y] == tablero[x + 1][y]) {
					EstaTerminado = false;
					return;
				}
			}
		}
		for (int x = 0; x < tablero.length; x++) {
			for (int y = 0; y < tablero.length; y++) {
				if (tablero[x][y] == tablero[x][y + 1]) {
					EstaTerminado = false;
					return;
				}
			}
		}

		EstaTerminado = true;
		return;
	}

	public void SetTablero(int x, int y, int valor) {
		tablero[x][y] = valor;
	}

}
