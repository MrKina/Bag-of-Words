package Tp1;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import javax.swing.JTextField;
import javax.swing.JEditorPane;

public class Pantalla {

	private JFrame frmThe;
	private JTextField textField;
	private JTextField textField_1;
	private JEditorPane txtScore;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla window = new Pantalla();
					window.frmThe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pantalla() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		Tablero Game = new Tablero();

		Game.inicializarTablero();
		Game.MostrarMatriz();

		frmThe = new JFrame();
		frmThe.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e)
			{
				int keyCode = e.getKeyCode();
				switch (keyCode) {
				case KeyEvent.VK_UP:
					////////

					System.out.println("Arriba!");
					Verificaciones(Game);
					break;
				case KeyEvent.VK_DOWN:
					//////
					
					System.out.println("Abajo!");
					Verificaciones(Game);
					break;
				case KeyEvent.VK_LEFT:
					System.out.println("Izquierda!");
					Game.MoverIzquierda();
					Game.MostrarMatriz();
					Verificaciones(Game);
					break;
				case KeyEvent.VK_RIGHT:
					//////
					
					System.out.println("Derecha!");
					Verificaciones(Game);
					break;

				}
			}
		});
		frmThe.getContentPane().setBackground(Color.ORANGE);
		frmThe.getContentPane().setForeground(Color.WHITE);
		frmThe.setTitle("2048 - The Game");
		frmThe.setBounds(100, 100, 341, 408);
		frmThe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MostrarTablero(Game);
		

	}



	////////////////////FIN JUEGO////////////////////////////////

	private void Verificaciones(Tablero Game) {
		Game.HayMovimientos();
		Game.Gano();
		Game.RandomNumero();
	}
	
	
	
	private void MostrarTablero(Tablero Game) {
		if (Game.get(0, 0) != 0) {
			JLabel lblNewLabel = new JLabel(Game.toString(0, 0));
			lblNewLabel.setBounds(10, 40, 68, 72);
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setFont(new Font("Arial", Font.BOLD, 22));
			lblNewLabel.setBackground(Color.WHITE);
			frmThe.getContentPane().add(lblNewLabel);
		}
		frmThe.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setFocusable(false);
		panel.setBounds(10, 40, 68, 72);
		panel.setBackground(Color.BLACK);
		frmThe.getContentPane().add(panel);

		if (Game.get(1, 0) != 0) {
			JLabel label = new JLabel(Game.toString(1, 0));
			label.setBounds(88, 40, 68, 72);
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setForeground(Color.WHITE);
			label.setFont(new Font("Arial", Font.BOLD, 22));
			label.setBackground(Color.WHITE);
			frmThe.getContentPane().add(label);
		}

		JPanel panel_1 = new JPanel();
		panel_1.setFocusable(false);
		panel_1.setBounds(88, 40, 68, 72);
		panel_1.setBackground(Color.BLACK);
		frmThe.getContentPane().add(panel_1);

		if (Game.get(2, 0) != 0) {
			JLabel label_1 = new JLabel(Game.toString(2, 0));
			label_1.setBounds(166, 40, 68, 72);
			label_1.setHorizontalAlignment(SwingConstants.CENTER);
			label_1.setForeground(Color.WHITE);
			label_1.setFont(new Font("Arial", Font.BOLD, 22));
			label_1.setBackground(Color.WHITE);
			frmThe.getContentPane().add(label_1);
		}

		JPanel panel_2 = new JPanel();
		panel_2.setFocusable(false);
		panel_2.setBounds(166, 40, 68, 72);
		panel_2.setBackground(Color.BLACK);
		frmThe.getContentPane().add(panel_2);

		if (Game.get(3, 0) != 0) {
			JLabel label_2 = new JLabel(Game.toString(3, 0));
			label_2.setBounds(244, 40, 68, 72);
			label_2.setHorizontalAlignment(SwingConstants.CENTER);
			label_2.setForeground(Color.WHITE);
			label_2.setFont(new Font("Arial", Font.BOLD, 22));
			label_2.setBackground(Color.WHITE);
			frmThe.getContentPane().add(label_2);
		}

		JPanel panel_3 = new JPanel();
		panel_3.setFocusable(false);
		panel_3.setBounds(244, 40, 68, 72);
		panel_3.setBackground(Color.BLACK);
		frmThe.getContentPane().add(panel_3);

		if (Game.get(0, 1) != 0) {
			JLabel label_3 = new JLabel(Game.toString(0, 1));
			label_3.setBounds(10, 123, 68, 72);
			label_3.setHorizontalAlignment(SwingConstants.CENTER);
			label_3.setForeground(Color.WHITE);
			label_3.setFont(new Font("Arial", Font.BOLD, 22));
			label_3.setBackground(Color.WHITE);
			frmThe.getContentPane().add(label_3);
		}

		JPanel panel_4 = new JPanel();
		panel_4.setFocusable(false);
		panel_4.setBounds(10, 123, 68, 72);
		panel_4.setBackground(Color.BLACK);
		frmThe.getContentPane().add(panel_4);

		if (Game.get(1, 1) != 0) {
			JLabel label_4 = new JLabel(Game.toString(1, 1));
			label_4.setBounds(88, 123, 68, 72);
			label_4.setHorizontalAlignment(SwingConstants.CENTER);
			label_4.setForeground(Color.WHITE);
			label_4.setFont(new Font("Arial", Font.BOLD, 22));
			label_4.setBackground(Color.WHITE);
			frmThe.getContentPane().add(label_4);
		}

		JPanel panel_5 = new JPanel();
		panel_5.setFocusable(false);
		panel_5.setBounds(88, 123, 68, 72);
		panel_5.setBackground(Color.BLACK);
		frmThe.getContentPane().add(panel_5);

		if (Game.get(2, 1) != 0) {
			JLabel label_5 = new JLabel(Game.toString(2, 1));
			label_5.setBounds(166, 123, 68, 72);
			label_5.setHorizontalAlignment(SwingConstants.CENTER);
			label_5.setForeground(Color.WHITE);
			label_5.setFont(new Font("Arial", Font.BOLD, 22));
			label_5.setBackground(Color.WHITE);
			frmThe.getContentPane().add(label_5);
		}

		JPanel panel_6 = new JPanel();
		panel_6.setFocusable(false);
		panel_6.setBounds(166, 123, 68, 72);
		panel_6.setBackground(Color.BLACK);
		frmThe.getContentPane().add(panel_6);

		if (Game.get(3, 1) != 0) {
			JLabel label_6 = new JLabel(Game.toString(3, 1));
			label_6.setBounds(244, 123, 68, 72);
			label_6.setHorizontalAlignment(SwingConstants.CENTER);
			label_6.setForeground(Color.WHITE);
			label_6.setFont(new Font("Arial", Font.BOLD, 22));
			label_6.setBackground(Color.WHITE);
			frmThe.getContentPane().add(label_6);
		}

		JPanel panel_7 = new JPanel();
		panel_7.setFocusable(false);
		panel_7.setBounds(244, 123, 68, 72);
		panel_7.setBackground(Color.BLACK);
		frmThe.getContentPane().add(panel_7);

		if (Game.get(0, 2) != 0) {
			JLabel label_7 = new JLabel(Game.toString(0, 2));
			label_7.setBounds(10, 206, 68, 72);
			label_7.setHorizontalAlignment(SwingConstants.CENTER);
			label_7.setForeground(Color.WHITE);
			label_7.setFont(new Font("Arial", Font.BOLD, 22));
			label_7.setBackground(Color.WHITE);
			frmThe.getContentPane().add(label_7);
		}

		JPanel panel_8 = new JPanel();
		panel_8.setFocusable(false);
		panel_8.setBounds(10, 206, 68, 72);
		panel_8.setBackground(Color.BLACK);
		frmThe.getContentPane().add(panel_8);

		if (Game.get(1, 2) != 0) {
			JLabel label_8 = new JLabel(Game.toString(1, 2));
			label_8.setBounds(88, 206, 68, 72);
			label_8.setHorizontalAlignment(SwingConstants.CENTER);
			label_8.setForeground(Color.WHITE);
			label_8.setFont(new Font("Arial", Font.BOLD, 22));
			label_8.setBackground(Color.WHITE);
			frmThe.getContentPane().add(label_8);
		}

		JPanel panel_9 = new JPanel();
		panel_9.setFocusable(false);
		panel_9.setBounds(88, 206, 68, 72);
		panel_9.setBackground(Color.BLACK);
		frmThe.getContentPane().add(panel_9);

		if (Game.get(2, 2) != 0) {
			JLabel label_9 = new JLabel(Game.toString(2, 2));
			label_9.setBounds(166, 206, 68, 72);
			label_9.setHorizontalAlignment(SwingConstants.CENTER);
			label_9.setForeground(Color.WHITE);
			label_9.setFont(new Font("Arial", Font.BOLD, 22));
			label_9.setBackground(Color.WHITE);
			frmThe.getContentPane().add(label_9);
		}

		JPanel panel_10 = new JPanel();
		panel_10.setFocusable(false);
		panel_10.setBounds(166, 206, 68, 72);
		panel_10.setBackground(Color.BLACK);
		frmThe.getContentPane().add(panel_10);

		if (Game.get(3, 2) != 0) {
			JLabel label_10 = new JLabel(Game.toString(3, 2));
			label_10.setBounds(244, 206, 68, 72);
			label_10.setHorizontalAlignment(SwingConstants.CENTER);
			label_10.setForeground(Color.WHITE);
			label_10.setFont(new Font("Arial", Font.BOLD, 22));
			label_10.setBackground(Color.WHITE);
			frmThe.getContentPane().add(label_10);
		}

		JPanel panel_11 = new JPanel();
		panel_11.setFocusable(false);
		panel_11.setBounds(244, 206, 68, 72);
		panel_11.setBackground(Color.BLACK);
		frmThe.getContentPane().add(panel_11);

		if (Game.get(0, 3) != 0) {
			JLabel label_11 = new JLabel(Game.toString(0, 3));
			label_11.setBounds(10, 289, 68, 72);
			label_11.setHorizontalAlignment(SwingConstants.CENTER);
			label_11.setForeground(Color.WHITE);
			label_11.setFont(new Font("Arial", Font.BOLD, 22));
			label_11.setBackground(Color.WHITE);
			frmThe.getContentPane().add(label_11);
		}

		JPanel panel_12 = new JPanel();
		panel_12.setFocusable(false);
		panel_12.setBounds(10, 289, 68, 72);
		panel_12.setBackground(Color.BLACK);
		frmThe.getContentPane().add(panel_12);

		if (Game.get(1, 3) != 0) {
			JLabel label_12 = new JLabel(Game.toString(1, 3));
			label_12.setBounds(88, 289, 68, 72);
			label_12.setHorizontalAlignment(SwingConstants.CENTER);
			label_12.setForeground(Color.WHITE);
			label_12.setFont(new Font("Arial", Font.BOLD, 22));
			label_12.setBackground(Color.WHITE);
			frmThe.getContentPane().add(label_12);
		}

		JPanel panel_13 = new JPanel();
		panel_13.setFocusable(false);
		panel_13.setBounds(88, 289, 68, 72);
		panel_13.setBackground(Color.BLACK);
		frmThe.getContentPane().add(panel_13);

		if (Game.get(2, 3) != 0) {
			JLabel label_13 = new JLabel(Game.toString(2, 3));
			label_13.setBounds(166, 289, 68, 72);
			label_13.setHorizontalAlignment(SwingConstants.CENTER);
			label_13.setForeground(Color.WHITE);
			label_13.setFont(new Font("Arial", Font.BOLD, 22));
			label_13.setBackground(Color.WHITE);
			frmThe.getContentPane().add(label_13);
		}

		JPanel panel_14 = new JPanel();
		panel_14.setFocusable(false);
		panel_14.setBounds(166, 289, 68, 72);
		panel_14.setBackground(Color.BLACK);
		frmThe.getContentPane().add(panel_14);

		if (Game.get(2, 3) != 0) {
			JLabel label_14 = new JLabel(Game.toString(3, 3));

			label_14.setBounds(244, 289, 68, 72);
			label_14.setHorizontalAlignment(SwingConstants.CENTER);
			label_14.setForeground(Color.WHITE);
			label_14.setFont(new Font("Arial", Font.BOLD, 22));
			label_14.setBackground(Color.WHITE);
			frmThe.getContentPane().add(label_14);
		}
		JPanel panel_15 = new JPanel();
		panel_15.setFocusable(false);
		panel_15.setBounds(244, 289, 68, 72);
		panel_15.setBackground(Color.BLACK);
		frmThe.getContentPane().add(panel_15);

		textField = new JTextField();
		textField.setFocusable(false);
		textField.setBounds(10, 11, 68, 26);
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField.setText(Game.toString(Game.Score));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		frmThe.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFocusable(false);
		textField_1.setBounds(166, 11, 68, 26);
		textField_1.setText(Game.toString(Game.Movimiento));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		frmThe.getContentPane().add(textField_1);
		
		txtScore = new JEditorPane();
		txtScore.setFocusable(false);
		txtScore.setBackground(Color.ORANGE);
		txtScore.setText("Score");
		txtScore.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtScore.setEditable(false);
		txtScore.setBounds(80, 12, 68, 26);
		frmThe.getContentPane().add(txtScore);
		
		JEditorPane dtrpnMove = new JEditorPane();
		dtrpnMove.setFocusable(false);
		dtrpnMove.setText("Move");
		dtrpnMove.setFont(new Font("Tahoma", Font.BOLD, 13));
		dtrpnMove.setEditable(false);
		dtrpnMove.setBackground(Color.ORANGE);
		dtrpnMove.setBounds(235, 13, 68, 26);
		frmThe.getContentPane().add(dtrpnMove);
		
	}
	/*
	private void Repaint(Tablero Game){
		 {
			
			JLabel label_14 = new JLabel(Game.toString(3, 3));
			label_14.setBounds(244, 289, 68, 72);
			label_14.setHorizontalAlignment(SwingConstants.CENTER);
			label_14.setForeground(Color.WHITE);
			label_14.setFont(new Font("Arial", Font.BOLD, 22));
			label_14.setBackground(Color.WHITE);
			frmThe.getContentPane().add(label_14);
			label_14.setText("QUE TAL");
		if (Game.get(3, 3) != 0){
			label_14.setVisible(true);
		}
		else{
			label_14.setVisible(false);
		}
			
				JLabel label_13 = new JLabel(Game.toString(2, 3));
			label_13.setBounds(166, 289, 68, 72);
			label_13.setHorizontalAlignment(SwingConstants.CENTER);
			label_13.setForeground(Color.WHITE);
			label_13.setFont(new Font("Arial", Font.BOLD, 22));
			label_13.setBackground(Color.WHITE);
			frmThe.getContentPane().add(label_13);
					
			if (Game.get(3, 3) != 0){
				label_13.setVisible(true);
			}
			else{
				label_13.setVisible(false);
			}

		if (Game.get(1, 3) != 0) {
			JLabel label_12 = new JLabel(Game.toString(1, 3));
			label_12.setBounds(88, 289, 68, 72);
			label_12.setHorizontalAlignment(SwingConstants.CENTER);
			label_12.setForeground(Color.WHITE);
			label_12.setFont(new Font("Arial", Font.BOLD, 22));
			label_12.setBackground(Color.WHITE);
			frmThe.getContentPane().add(label_12);
		}


		if (Game.get(0, 3) != 0) {
			JLabel label_11 = new JLabel(Game.toString(0, 3));
			label_11.setBounds(10, 289, 68, 72);
			label_11.setHorizontalAlignment(SwingConstants.CENTER);
			label_11.setForeground(Color.WHITE);
			label_11.setFont(new Font("Arial", Font.BOLD, 22));
			label_11.setBackground(Color.WHITE);
			frmThe.getContentPane().add(label_11);
		}

		if (Game.get(3, 2) != 0) {
			JLabel label_10 = new JLabel(Game.toString(3, 2));
			label_10.setBounds(244, 206, 68, 72);
			label_10.setHorizontalAlignment(SwingConstants.CENTER);
			label_10.setForeground(Color.WHITE);
			label_10.setFont(new Font("Arial", Font.BOLD, 22));
			label_10.setBackground(Color.WHITE);
			frmThe.getContentPane().add(label_10);
		}


		if (Game.get(2, 2) != 0) {
			JLabel label_9 = new JLabel(Game.toString(2, 2));
			label_9.setBounds(166, 206, 68, 72);
			label_9.setHorizontalAlignment(SwingConstants.CENTER);
			label_9.setForeground(Color.WHITE);
			label_9.setFont(new Font("Arial", Font.BOLD, 22));
			label_9.setBackground(Color.WHITE);
			frmThe.getContentPane().add(label_9);
		}

		if (Game.get(1, 2) != 0) {
			JLabel label_8 = new JLabel(Game.toString(1, 2));
			label_8.setBounds(88, 206, 68, 72);
			label_8.setHorizontalAlignment(SwingConstants.CENTER);
			label_8.setForeground(Color.WHITE);
			label_8.setFont(new Font("Arial", Font.BOLD, 22));
			label_8.setBackground(Color.WHITE);
			frmThe.getContentPane().add(label_8);
		}


		if (Game.get(0, 2) != 0) {
			JLabel label_7 = new JLabel(Game.toString(0, 2));
			label_7.setBounds(10, 206, 68, 72);
			label_7.setHorizontalAlignment(SwingConstants.CENTER);
			label_7.setForeground(Color.WHITE);
			label_7.setFont(new Font("Arial", Font.BOLD, 22));
			label_7.setBackground(Color.WHITE);
			frmThe.getContentPane().add(label_7);
		}

		if (Game.get(3, 1) != 0) {
			JLabel label_6 = new JLabel(Game.toString(3, 1));
			label_6.setBounds(244, 123, 68, 72);
			label_6.setHorizontalAlignment(SwingConstants.CENTER);
			label_6.setForeground(Color.WHITE);
			label_6.setFont(new Font("Arial", Font.BOLD, 22));
			label_6.setBackground(Color.WHITE);
			frmThe.getContentPane().add(label_6);
		}

		if (Game.get(2, 1) != 0) {
			JLabel label_5 = new JLabel(Game.toString(2, 1));
			label_5.setBounds(166, 123, 68, 72);
			label_5.setHorizontalAlignment(SwingConstants.CENTER);
			label_5.setForeground(Color.WHITE);
			label_5.setFont(new Font("Arial", Font.BOLD, 22));
			label_5.setBackground(Color.WHITE);
			frmThe.getContentPane().add(label_5);
		}

		if (Game.get(1, 1) != 0) {
			JLabel label_4 = new JLabel(Game.toString(1, 1));
			label_4.setBounds(88, 123, 68, 72);
			label_4.setHorizontalAlignment(SwingConstants.CENTER);
			label_4.setForeground(Color.WHITE);
			label_4.setFont(new Font("Arial", Font.BOLD, 22));
			label_4.setBackground(Color.WHITE);
			frmThe.getContentPane().add(label_4);
		}

		if (Game.get(0, 1) != 0) {
			JLabel label_3 = new JLabel(Game.toString(0, 1));
			label_3.setBounds(10, 123, 68, 72);
			label_3.setHorizontalAlignment(SwingConstants.CENTER);
			label_3.setForeground(Color.WHITE);
			label_3.setFont(new Font("Arial", Font.BOLD, 22));
			label_3.setBackground(Color.WHITE);
			frmThe.getContentPane().add(label_3);
		}

		if (Game.get(3, 0) != 0) {
			JLabel label_2 = new JLabel(Game.toString(3, 0));
			label_2.setBounds(244, 40, 68, 72);
			label_2.setHorizontalAlignment(SwingConstants.CENTER);
			label_2.setForeground(Color.WHITE);
			label_2.setFont(new Font("Arial", Font.BOLD, 22));
			label_2.setBackground(Color.WHITE);
			frmThe.getContentPane().add(label_2);
		}


		if (Game.get(2, 0) != 0) {
			JLabel label_1 = new JLabel(Game.toString(2, 0));
			label_1.setBounds(166, 40, 68, 72);
			label_1.setHorizontalAlignment(SwingConstants.CENTER);
			label_1.setForeground(Color.WHITE);
			label_1.setFont(new Font("Arial", Font.BOLD, 22));
			label_1.setBackground(Color.WHITE);
			frmThe.getContentPane().add(label_1);
		}

		if (Game.get(1, 0) != 0) {
			JLabel label = new JLabel(Game.toString(1, 0));
			label.setBounds(88, 40, 68, 72);
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setForeground(Color.WHITE);
			label.setFont(new Font("Arial", Font.BOLD, 22));
			label.setBackground(Color.WHITE);
			frmThe.getContentPane().add(label);
		}


		if (Game.get(0, 0) != 0) {
			JLabel lblNewLabel = new JLabel(Game.toString(0, 0));
			lblNewLabel.setBounds(10, 40, 68, 72);
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setFont(new Font("Arial", Font.BOLD, 22));
			lblNewLabel.setBackground(Color.WHITE);
			frmThe.getContentPane().add(lblNewLabel);
		}
	}
	*/
}
