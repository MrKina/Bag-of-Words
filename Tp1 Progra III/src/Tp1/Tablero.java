package Tp1;

import java.util.Random;

public class Tablero {

	int tablero[][] = new int[4][4];
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
			int randomNum = 2 + (int)(Math.random() * 3);
			if (tablero[x][y] == 0 && randomNum %2==0) {
				tablero[x][y] = randomNum;
				System.out.println ("Aparece en X: " + x + " e Y: " + y);
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
			int randomNum = 2 + (int)(Math.random() * 3);
			if (tablero[x][y] == 0 && randomNum %2==0 ) {
				tablero[x][y] = randomNum;
			} else {
				i--;
			}
		}
	}
	/*
	public void MoverIzquierda() {
		for (int y = 0; y < tablero.length; y++) {
			for (int x = tablero.length; x >= 0; x--) {
				if (tablero[x][y] == tablero[x - 1][y] || tablero[x-1][y]==0) {
					tablero[x - 1][y] = +tablero[x][y];
					tablero[x][y] = 0;
				}
				
				}

			}
		}
	*/
	
	public void MostrarMatriz()
	{
		for(int y=0; y < tablero.length;y++){
			for (int x=0 ; x < tablero.length;x++)
			{
				System.out.print(tablero[x][y] + " | ");
			}
			System.out.print ("\n");
		}
	}
	
	public String toString(int x, int y)
	{
		String Cadena = String.valueOf(tablero[x][y]);
		return Cadena;		
	}
	
	public void Gano() {
		for(int y=0;y<tablero.length;y++){
			for(int x=0;x<tablero.length;x++){
				if(tablero[x][y]==2048){
					Gano = true;
					EstaTerminado = true;
				}
			}
		}
	}
	
	public void HayMovimientos(){
		for(int y=0;y<tablero.length;y++){
			for(int x=0;x<tablero.length;x++){
				if(tablero[x][y]==tablero[x+1][y]){
					EstaTerminado = false;
					return;
				}
			}
		}
		for(int x=0;x<tablero.length;x++){
			for(int y=0;y<tablero.length;y++){
				if(tablero[x][y]==tablero[x][y+1]){
					EstaTerminado = false;
					return;
				}
			}
		}
		
		EstaTerminado = true;
		return;
	}
	
}


