package Tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class PantallaTest {

	@Test
	public void test() {
		Tablero Juego = new Tablero();
		Juego.SetTablero(0, 0, 2);
		Juego.SetTablero(1, 0, 9);
		Juego.SetTablero(2, 0, 6);
		Juego.SetTablero(3, 0, 99);
		Juego.SetTablero(0, 1, 8);
		Juego.SetTablero(1, 1, 3);
		Juego.SetTablero(2, 1, 5);
		Juego.SetTablero(3, 1, 3);
		Juego.SetTablero(0, 2, 9);
		Juego.SetTablero(1, 2, 29);
		Juego.SetTablero(2, 2, 9);
		Juego.SetTablero(3, 2, 0);
		Juego.SetTablero(0, 3, 59);
		Juego.SetTablero(1, 3, 0);
		Juego.SetTablero(2, 3, 10);
		Juego.SetTablero(3, 3, 2048);
		
		Juego.MostrarMatriz();
		
		System.out.println("Hay Movimiento: " + Juego.HayMovimientos());
		System.out.println("Gano?: " + Juego.Gano());
		
		
		
		

	}

}
