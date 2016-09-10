package Tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class PantallaTest {

	@Test
	public void test() {
		Tablero Juego = new Tablero();
		
		Juego.SetTablero(0, 0, 16);
		Juego.SetTablero(1, 0, 8);
		Juego.SetTablero(2, 0, 2);
		Juego.SetTablero(3, 0, 4);
		Juego.SetTablero(0, 1, 16);
		Juego.SetTablero(1, 1, 2);
		Juego.SetTablero(2, 1, 4);
		Juego.SetTablero(3, 1, 2);
		Juego.SetTablero(0, 2, 16);
		Juego.SetTablero(1, 2, 8);
		Juego.SetTablero(2, 2, 4);
		Juego.SetTablero(3, 2, 2);
		Juego.SetTablero(0, 3, 4);
		Juego.SetTablero(1, 3, 2);
		Juego.SetTablero(2, 3, 4);
		Juego.SetTablero(3, 3, 2);
		
		Juego.MostrarMatriz();
		Juego.CopiarTablero();
		Juego.MostrarMatrizCopiada();
		
		System.out.println("Hay Movimiento: " + Juego.HayMovimientos());
		System.out.println("Gano?: " + Juego.Gano());
		
			
	}

}
