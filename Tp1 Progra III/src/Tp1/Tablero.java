package Tp1;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

public class Tablero {

	int tablero[][] = new int[4][4];
	int Auxiliar[][] = new int[4][4];
	int Score = 0;
	int Movimiento = 0;
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
		for (int i = 0; i < 1; i++) {
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

	public boolean MoverIzquierda() {
		CopiarTablero();
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
					Score += tablero[x][y] += tablero[x + 1][y];
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
		
		if (equalsTablero()) {
			return false;
		}
		Movimiento++;
		return true;

	}

	private void AlinearIzquierda(int y, ArrayList<Integer> Auxiliar) {
		while (Auxiliar.size() <= tablero.length) {
			Auxiliar.add(0);
		}
		for (int x = 0; x < tablero.length; x++) {
			tablero[x][y] = (int) Auxiliar.get(x);
		}
	}

	public boolean MoverDerecha() {
		CopiarTablero();
		ArrayList<Integer> Auxiliar = new ArrayList<Integer>();
		for (int y = 0; y < tablero.length; y++) {
			Auxiliar.clear();
			for (int x = tablero.length - 1; x >= 0; x--) {
				if (tablero[x][y] != 0) {
					Auxiliar.add(tablero[x][y]);
				}
			}
			AlinearDerecha(y, Auxiliar);
		}

		for (int y = 0; y < tablero.length; y++) {
			for (int x = tablero.length - 1; x >= 1; x--) {
				if (tablero[x][y] == tablero[x - 1][y]) {
					
					Score +=tablero[x][y] += tablero[x - 1][y];
					
					tablero[x - 1][y] = 0;
				}
			}
		}

		Auxiliar.clear();
		for (int y = 0; y < tablero.length; y++) {
			Auxiliar.clear();
			for (int x = tablero.length - 1; x > -1; x--) {
				if (tablero[x][y] != 0) {
					Auxiliar.add(tablero[x][y]);
				}
			}
			AlinearDerecha(y, Auxiliar);
		}
		if (equalsTablero()) {
			return false;
		}
		Movimiento++;
		return true;

	}

	private void AlinearDerecha(int y, ArrayList<Integer> Auxiliar) {
		while (Auxiliar.size() < tablero.length) {
			Auxiliar.add(0);
		}
		int Aux = 0;
		for (int x = tablero.length - 1; x >= 0; x--) {
			tablero[x][y] = (int) Auxiliar.get(Aux);
			Aux++;
		}
	}

	public boolean MoverArriba() {
		CopiarTablero();
		ArrayList<Integer> Auxiliar = new ArrayList<Integer>();
		for (int x = 0; x < tablero.length; x++) {
			Auxiliar.clear();
			for (int y = 0; y < tablero.length; y++) {
				if (tablero[x][y] != 0) {
					Auxiliar.add(tablero[x][y]);
				}
			}
			AlinearArriba(x, Auxiliar);
		}

		for (int x = 0; x < tablero.length; x++) {
			for (int y = 0; y < tablero.length - 1; y++) {
				if (tablero[x][y] == tablero[x][y + 1]) {
					Score += tablero[x][y] += tablero[x][y + 1];
					tablero[x][y + 1] = 0;
				}
			}
		}

		Auxiliar.clear();

		for (int x = 0; x < tablero.length; x++) {
			Auxiliar.clear();
			for (int y = 0; y < tablero.length; y++) {
				if (tablero[x][y] != 0) {
					Auxiliar.add(tablero[x][y]);
				}
			}
			AlinearArriba(x, Auxiliar);
		}
		if (equalsTablero()) {
			return false;
		}
		Movimiento++;
		return true;

	}

	private void AlinearArriba(int x, ArrayList<Integer> Auxiliar) {
		while (Auxiliar.size() <= tablero.length) {
			Auxiliar.add(0);
		}
		for (int y = 0; y < tablero.length; y++) {
			tablero[x][y] = (int) Auxiliar.get(y);

		}
	}

	public boolean MoverAbajo() {
		ArrayList<Integer> Auxiliar = new ArrayList<Integer>();
		CopiarTablero();
		for (int x = 0; x < tablero.length; x++) {
			Auxiliar.clear();
			for (int y = tablero.length - 1; y >= 0; y--) {
				if (tablero[x][y] != 0) {
					Auxiliar.add(tablero[x][y]);
				}
			}
			AlinearAbajo(x, Auxiliar);
		}

		for (int x = 0; x < tablero.length; x++) {
			for (int y = tablero.length - 1; y >= 1; y--) {
				if (tablero[x][y] == tablero[x][y - 1]) {
					Score +=tablero[x][y] += tablero[x][y - 1];
					tablero[x][y - 1] = 0;
				}
			}
		}

		Auxiliar.clear();
		for (int x = 0; x < tablero.length; x++) {
			Auxiliar.clear();
			for (int y = tablero.length - 1; y > -1; y--) {
				if (tablero[x][y] != 0) {
					Auxiliar.add(tablero[x][y]);
				}
			}
			AlinearAbajo(x, Auxiliar);
		}
		if (equalsTablero()) {
			return false;
		}
		Movimiento++;
		return true;

	}

	private void AlinearAbajo(int x, ArrayList<Integer> Auxiliar) {
		while (Auxiliar.size() < tablero.length) {
			Auxiliar.add(0);
		}
		int Aux = 0;
		for (int y = tablero.length - 1; y >= 0; y--) {
			tablero[x][y] = (int) Auxiliar.get(Aux);
			Aux++;
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

	public boolean Gano() {
		for (int y = 0; y < tablero.length; y++) {
			for (int x = 0; x < tablero.length; x++) {
				if (tablero[x][y] == 2048) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean HayMovimientos() {
		for (int y = 0; y < tablero.length; y++) {
			for (int x = 0; x < tablero.length - 1; x++) {
				if (tablero[x][y] == tablero[x + 1][y]) {
					return true;
				}
			}
		}
		for (int x = 0; x < tablero.length; x++) {
			for (int y = 0; y < tablero.length - 1; y++) {
				if (tablero[x][y] == tablero[x][y + 1]) {
					return true;
				}
			}
		}

		for (int x = 0; x < tablero.length; x++) {
			for (int y = 0; y < tablero.length; y++) {
				if (tablero[x][y] == 0) {
					return true;
				}
			}
		}

		return false;
	}

	public void SetTablero(int x, int y, int valor) {
		tablero[x][y] = valor;
	}

	public void CopiarTablero() {
		for (int y = 0; y < tablero.length; y++) {
			for (int x = 0; x < tablero.length; x++) {
				Auxiliar[x][y] = tablero[x][y];
			}
		}
	}

	private boolean equalsTablero() {
		boolean Prueba = true;
		for (int y = 0; y < tablero.length; y++) {
			for (int x = 0; x < tablero.length; x++) {
				if (Auxiliar[x][y] != tablero[x][y]) {
					return false;
				}
			}
		}
		return Prueba;

	}
	
	public Color SetColor (int Numero)
	{
		if (Numero == 2){
			return Color.BLUE;
		}
		if (Numero == 4){
			return Color.CYAN;
		}
		if (Numero == 8){
			return Color.DARK_GRAY;
		}
		if (Numero == 16){
			return Color.GRAY;
		}
		if (Numero == 32){
			return Color.GREEN;
		}
		if (Numero == 64){
			return Color.MAGENTA;
		}
		if (Numero == 128){
			return Color.PINK;
		}
		if (Numero == 256){
			return Color.RED;
		}
		if (Numero == 512){
			return Color.yellow;
		}
		if (Numero == 1024){
			return Color.YELLOW;
		}
		if (Numero == 2048){
			return Color.ORANGE;
		}
		return Color.BLACK;
	}
	
	
	
	
	
}
