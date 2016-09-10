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
import java.awt.Cursor;
import javax.swing.JTextPane;
import javax.swing.JSlider;

public class Pantalla {

	private JFrame frmThe;
	private JTextField textField;
	private JTextField textField_1;
	private JEditorPane txtScore;
	private JLabel lblNewLabel;
	private JLabel label_6;
	private JLabel label_12;
	private JLabel label_4;
	private JLabel label_11;
	private JLabel label_5;
	private JLabel label_9;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_2;
	private JLabel label_7;
	private JLabel label_1;
	private JLabel label_13;
	private JLabel label_8;
	private JLabel label_3;
	private JLabel label;
	private JLabel label_10;
	private JTextPane txtpnPerdiste;
	private JPanel panel;
	

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
		
		frmThe = new JFrame();
		frmThe.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				switch (keyCode) {
				case KeyEvent.VK_UP:
					////////
					if(Game.MoverArriba()){
						Game.RandomNumero();
					}
					Game.MostrarMatriz();
					Repaint(Game);
					break;
				case KeyEvent.VK_DOWN:
					//////
					if(Game.MoverAbajo()){
						Game.RandomNumero();
					}
					Game.MostrarMatriz();
					Repaint(Game);
					break;
				case KeyEvent.VK_LEFT:
					if(Game.MoverIzquierda()){
						Game.RandomNumero();
					}
					Game.MostrarMatriz();
					Repaint(Game);
					break;
				case KeyEvent.VK_RIGHT:
					//////
					if(Game.MoverDerecha()){
						Game.RandomNumero();
					}
					Game.MostrarMatriz();
					Repaint(Game);
					break;

				}
			}
		});
		frmThe.getContentPane().setBackground(Color.ORANGE);
		frmThe.getContentPane().setForeground(Color.WHITE);
		frmThe.setTitle("2048 - The Game");
		frmThe.setBounds(100, 100, 330, 438);
		frmThe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MostrarTablero(Game);

	}

	//////////////////// FIN JUEGO////////////////////////////////

	

	private void MostrarTablero(Tablero Game) {

		lblNewLabel = new JLabel(Game.toString(0, 0));
		lblNewLabel.setBounds(10, 40, 68, 72);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 22));
		lblNewLabel.setBackground(Color.WHITE);
		if (Game.get(0, 0) == 0) {
			lblNewLabel.setVisible(false);
		}
		frmThe.getContentPane().add(lblNewLabel);

		label = new JLabel(Game.toString(1, 0));
		label.setBounds(88, 40, 68, 72);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Arial", Font.BOLD, 22));
		label.setBackground(Color.WHITE);
		if (Game.get(1, 0) == 0) {
			label.setVisible(false);
		}
		frmThe.getContentPane().add(label);

		label_1 = new JLabel(Game.toString(2, 0));
		label_1.setBounds(166, 40, 68, 72);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Arial", Font.BOLD, 22));
		label_1.setBackground(Color.WHITE);
		if (Game.get(2, 0) == 0) {
			label_1.setVisible(false);
		}
		frmThe.getContentPane().add(label_1);

		label_2 = new JLabel(Game.toString(3, 0));
		label_2.setBounds(244, 40, 68, 72);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Arial", Font.BOLD, 22));
		label_2.setBackground(Color.WHITE);
		if (Game.get(3, 0) == 0) {
			label_2.setVisible(false);
		}
		frmThe.getContentPane().add(label_2);

		label_3 = new JLabel(Game.toString(0, 1));
		label_3.setBounds(10, 123, 68, 72);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Arial", Font.BOLD, 22));
		label_3.setBackground(Color.WHITE);
		if (Game.get(0, 1) == 0) {
			label_3.setVisible(false);
		}
		frmThe.getContentPane().add(label_3);

		label_4 = new JLabel(Game.toString(1, 1));
		label_4.setBounds(88, 123, 68, 72);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Arial", Font.BOLD, 22));
		label_4.setBackground(Color.WHITE);
		if (Game.get(1, 1) == 0) {
			label_4.setVisible(false);
		}
		frmThe.getContentPane().add(label_4);

		label_5 = new JLabel(Game.toString(2, 1));
		label_5.setBounds(166, 123, 68, 72);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Arial", Font.BOLD, 22));
		label_5.setBackground(Color.WHITE);
		if (Game.get(2, 1) == 0) {
			label_5.setVisible(false);
		}
		frmThe.getContentPane().add(label_5);

		label_6 = new JLabel(Game.toString(3, 1));
		label_6.setBounds(244, 123, 68, 72);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Arial", Font.BOLD, 22));
		label_6.setBackground(Color.WHITE);
		if (Game.get(3, 1) == 0) {
			label_6.setVisible(false);
		}
		frmThe.getContentPane().add(label_6);

		label_7 = new JLabel(Game.toString(0, 2));
		label_7.setBounds(10, 206, 68, 72);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Arial", Font.BOLD, 22));
		label_7.setBackground(Color.WHITE);
		if (Game.get(0, 2) == 0) {
			label_7.setVisible(false);
		}
		frmThe.getContentPane().add(label_7);

		label_8 = new JLabel(Game.toString(1, 2));
		label_8.setBounds(88, 206, 68, 72);
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Arial", Font.BOLD, 22));
		label_8.setBackground(Color.WHITE);
		if (Game.get(1, 2) == 0) {
			label_8.setVisible(false);
		}
		frmThe.getContentPane().add(label_8);

		label_9 = new JLabel(Game.toString(2, 2));
		label_9.setBounds(166, 206, 68, 72);
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("Arial", Font.BOLD, 22));
		label_9.setBackground(Color.WHITE);
		if (Game.get(2, 2) == 0) {
			label_9.setVisible(false);
		}
		frmThe.getContentPane().add(label_9);

		label_10 = new JLabel(Game.toString(3, 2));
		label_10.setBounds(244, 206, 68, 72);
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setForeground(Color.WHITE);
		label_10.setFont(new Font("Arial", Font.BOLD, 22));
		label_10.setBackground(Color.WHITE);
		if (Game.get(3, 2) == 0) {
			label_10.setVisible(false);
		}
		frmThe.getContentPane().add(label_10);

		label_11 = new JLabel(Game.toString(0, 3));
		label_11.setBounds(10, 289, 68, 72);
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setForeground(Color.WHITE);
		label_11.setFont(new Font("Arial", Font.BOLD, 22));
		label_11.setBackground(Color.WHITE);
		if (Game.get(0, 3) == 0) {
			label_11.setVisible(false);
		}
		frmThe.getContentPane().add(label_11);

		label_12 = new JLabel(Game.toString(1, 3));
		label_12.setBounds(88, 289, 68, 72);
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setForeground(Color.WHITE);
		label_12.setFont(new Font("Arial", Font.BOLD, 22));
		label_12.setBackground(Color.WHITE);
		if (Game.get(1, 3) == 0) {
			label_12.setVisible(false);
		}
		frmThe.getContentPane().add(label_12);

		label_13 = new JLabel(Game.toString(2, 3));
		label_13.setBounds(166, 289, 68, 72);
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setForeground(Color.WHITE);
		label_13.setFont(new Font("Arial", Font.BOLD, 22));
		label_13.setBackground(Color.WHITE);
		if (Game.get(2, 3) == 0) {
			label_13.setVisible(false);
		}
		frmThe.getContentPane().add(label_13);

		label_14 = new JLabel(Game.toString(3, 3));
		label_14.setBounds(244, 289, 68, 72);
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setForeground(Color.WHITE);
		label_14.setFont(new Font("Arial", Font.BOLD, 22));
		label_14.setBackground(Color.WHITE);
		if (Game.get(3, 3) == 0) {
			label_14.setVisible(false);
		}
		frmThe.getContentPane().add(label_14);

		frmThe.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setFocusable(false);
		panel.setBounds(10, 40, 68, 72);
		panel.setBackground(Color.BLACK);
		frmThe.getContentPane().add(panel);

		JPanel panel_1 = new JPanel();
		panel_1.setFocusable(false);
		panel_1.setBounds(88, 40, 68, 72);
		panel_1.setBackground(Color.BLACK);
		frmThe.getContentPane().add(panel_1);

		JPanel panel_2 = new JPanel();
		panel_2.setFocusable(false);
		panel_2.setBounds(166, 40, 68, 72);
		panel_2.setBackground(Color.BLACK);
		frmThe.getContentPane().add(panel_2);

		JPanel panel_3 = new JPanel();
		panel_3.setFocusable(false);
		panel_3.setBounds(244, 40, 68, 72);
		panel_3.setBackground(Color.BLACK);
		frmThe.getContentPane().add(panel_3);

		JPanel panel_4 = new JPanel();
		panel_4.setFocusable(false);
		panel_4.setBounds(10, 123, 68, 72);
		panel_4.setBackground(Color.BLACK);
		frmThe.getContentPane().add(panel_4);

		JPanel panel_5 = new JPanel();
		panel_5.setFocusable(false);
		panel_5.setBounds(88, 123, 68, 72);
		panel_5.setBackground(Color.BLACK);
		frmThe.getContentPane().add(panel_5);

		JPanel panel_6 = new JPanel();
		panel_6.setFocusable(false);
		panel_6.setBounds(166, 123, 68, 72);
		panel_6.setBackground(Color.BLACK);
		frmThe.getContentPane().add(panel_6);

		JPanel panel_7 = new JPanel();
		panel_7.setFocusable(false);
		panel_7.setBounds(244, 123, 68, 72);
		panel_7.setBackground(Color.BLACK);
		frmThe.getContentPane().add(panel_7);

		JPanel panel_8 = new JPanel();
		panel_8.setFocusable(false);
		panel_8.setBounds(10, 206, 68, 72);
		panel_8.setBackground(Color.BLACK);
		frmThe.getContentPane().add(panel_8);

		JPanel panel_9 = new JPanel();
		panel_9.setFocusable(false);
		panel_9.setBounds(88, 206, 68, 72);
		panel_9.setBackground(Color.BLACK);
		frmThe.getContentPane().add(panel_9);

		JPanel panel_10 = new JPanel();
		panel_10.setFocusable(false);
		panel_10.setBounds(166, 206, 68, 72);
		panel_10.setBackground(Color.BLACK);
		frmThe.getContentPane().add(panel_10);

		JPanel panel_11 = new JPanel();
		panel_11.setFocusable(false);
		panel_11.setBounds(244, 206, 68, 72);
		panel_11.setBackground(Color.BLACK);
		frmThe.getContentPane().add(panel_11);

		JPanel panel_12 = new JPanel();
		panel_12.setFocusable(false);
		panel_12.setBounds(10, 289, 68, 72);
		panel_12.setBackground(Color.BLACK);
		frmThe.getContentPane().add(panel_12);

		JPanel panel_13 = new JPanel();
		panel_13.setFocusable(false);
		panel_13.setBounds(88, 289, 68, 72);
		panel_13.setBackground(Color.BLACK);
		frmThe.getContentPane().add(panel_13);

		JPanel panel_14 = new JPanel();
		panel_14.setFocusable(false);
		panel_14.setBounds(166, 289, 68, 72);
		panel_14.setBackground(Color.BLACK);
		frmThe.getContentPane().add(panel_14);

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
		txtScore.setText("Puntos");
		txtScore.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtScore.setEditable(false);
		txtScore.setBounds(80, 12, 68, 26);
		frmThe.getContentPane().add(txtScore);

		JEditorPane dtrpnMove = new JEditorPane();
		dtrpnMove.setFocusable(false);
		dtrpnMove.setText("Movimientos");
		dtrpnMove.setFont(new Font("Tahoma", Font.BOLD, 13));
		dtrpnMove.setEditable(false);
		dtrpnMove.setBackground(Color.ORANGE);
		dtrpnMove.setBounds(235, 13, 87, 26);
		frmThe.getContentPane().add(dtrpnMove);
		
		txtpnPerdiste = new JTextPane();
		txtpnPerdiste.setDisabledTextColor(Color.RED);
		txtpnPerdiste.setVisible(false);
		txtpnPerdiste.setSelectedTextColor(Color.RED);
		txtpnPerdiste.setSelectionColor(Color.RED);
		
		txtpnPerdiste.setForeground(Color.RED);
		txtpnPerdiste.setFont(new Font("Tahoma", Font.PLAIN, 34));
		txtpnPerdiste.setEnabled(false);
		txtpnPerdiste.setEditable(false);
		txtpnPerdiste.setBackground(Color.ORANGE);
		txtpnPerdiste.setText("PERDISTE !!!");
		txtpnPerdiste.setBounds(59, 365, 263, 46);
		frmThe.getContentPane().add(txtpnPerdiste);
	}

	private void Repaint(Tablero Game) {
		lblNewLabel.setText(Game.toString(0, 0));
		label.setText(Game.toString(1, 0));
		label_1.setText(Game.toString(2, 0));
		label_2.setText(Game.toString(3, 0));
		label_3.setText(Game.toString(0, 1));
		label_4.setText(Game.toString(1, 1));
		label_5.setText(Game.toString(2, 1));
		label_6.setText(Game.toString(3, 1));
		label_7.setText(Game.toString(0, 2));
		label_8.setText(Game.toString(1, 2));
		label_9.setText(Game.toString(2, 2));
		label_10.setText(Game.toString(3, 2));
		label_11.setText(Game.toString(0, 3));
		label_12.setText(Game.toString(1, 3));
		label_13.setText(Game.toString(2, 3));
		label_14.setText(Game.toString(3, 3));
		textField.setText(Game.toString(Game.Score));
		textField_1.setText(Game.toString(Game.Movimiento));
		perdiste(!Game.HayMovimientos());
		Ganaste(Game.Gano());
		
	
		
		
		
		
		
		
		
		
		if (Game.get(0, 0) == 0) {
			lblNewLabel.setVisible(false);
		} else {
			lblNewLabel.setVisible(true);
		}
		if (Game.get(1, 0) == 0) {
			label.setVisible(false);
		} else {
			label.setVisible(true);
		}
		if (Game.get(2, 0) == 0) {
			label_1.setVisible(false);
		} else {
			label_1.setVisible(true);
		}
		if (Game.get(3, 0) == 0) {
			label_2.setVisible(false);
		} else {
			label_2.setVisible(true);
		}
		if (Game.get(0, 1) == 0) {
			label_3.setVisible(false);
		} else {
			label_3.setVisible(true);
		}
		if (Game.get(1, 1) == 0) {
			label_4.setVisible(false);
		} else {
			label_4.setVisible(true);
		}
		if (Game.get(2, 1) == 0) {
			label_5.setVisible(false);
		} else {
			label_5.setVisible(true);
		}
		if (Game.get(3, 1) == 0) {
			label_6.setVisible(false);
		} else {
			label_6.setVisible(true);
		}

		if (Game.get(0, 2) == 0) {
			label_7.setVisible(false);
		} else {
			label_7.setVisible(true);
		}
		if (Game.get(1, 2) == 0) {
			label_8.setVisible(false);
		} else {
			label_8.setVisible(true);
		}
		if (Game.get(2, 2) == 0) {
			label_9.setVisible(false);
		} else {
			label_9.setVisible(true);
		}
		if (Game.get(3, 2) == 0) {
			label_10.setVisible(false);
		} else {
			label_10.setVisible(true);
		}

		if (Game.get(0, 3) == 0) {
			label_11.setVisible(false);
		} else {
			label_11.setVisible(true);
		}
		if (Game.get(1, 3) == 0) {
			label_12.setVisible(false);
		} else {
			label_12.setVisible(true);
		}
		if (Game.get(2, 3) == 0) {
			label_13.setVisible(false);
		} else {
			label_13.setVisible(true);
		}
		if (Game.get(3, 3) == 0) {
			label_14.setVisible(false);
		} else {
			label_14.setVisible(true);
		}

	}

	public String getLblNewLabelText() {
		return lblNewLabel.getText();
	}

	public void setLblNewLabelText(String text) {
		lblNewLabel.setText(text);
	}

	public String getLabel() {
		return label.getText();
	}

	public void setlabel(String text) {
		label.setText(text);
	}

	public String getLabel_1() {
		return label_1.getText();
	}

	public void setlabel_1(String text) {
		label_1.setText(text);
	}

	public String getLabel_2() {
		return label_2.getText();
	}

	public void setlabel_2(String text) {
		label_2.setText(text);
	}

	public String getLabel_3() {
		return label_3.getText();
	}

	public void setlabel_3(String text) {
		label_3.setText(text);
	}

	public String getLabel_4() {
		return label_4.getText();
	}

	public void setlabel_4(String text) {
		label_4.setText(text);
	}

	public String getLabel_5() {
		return label_5.getText();
	}

	public void setlabel_5(String text) {
		label_5.setText(text);
	}

	public String getLabel_6() {
		return label_6.getText();
	}

	public void setlabel_6(String text) {
		label_6.setText(text);
	}

	public String getLabel_7() {
		return label_7.getText();
	}

	public void setlabel_7(String text) {
		label_7.setText(text);
	}

	public String getLabel_8() {
		return label_8.getText();
	}

	public void setlabel_8(String text) {
		label_8.setText(text);
	}

	public String getLabel_9() {
		return label_9.getText();
	}

	public void setlabel_9(String text) {
		label_9.setText(text);
	}

	public String getLabel_10() {
		return label_10.getText();
	}

	public void setlabel_10(String text) {
		label_10.setText(text);
	}

	public String getLabel_11() {
		return label_11.getText();
	}

	public void setlabel_11(String text) {
		label_11.setText(text);
	}

	public String getLabel_12() {
		return label_12.getText();
	}

	public void setlabel_12(String text) {
		label_12.setText(text);
	}

	public String getLabel_13() {
		return label_13.getText();
	}

	public void setlabel_13(String text) {
		label_13.setText(text);
	}

	public String getLabel_14() {
		return label_14.getText();
	}

	public void setlabel_14(String text) {
		label_14.setText(text);
	}

	public String getLabel_15() {
		return label_15.getText();
	}

	public void setlabel_15(String text) {
		label_15.setText(text);
	}
	public void perdiste(Boolean termino){
		txtpnPerdiste.setVisible(termino);	
	}
	public void Ganaste(Boolean gane){
		if (gane == true){
		txtpnPerdiste.setText("GANASTE !!!");
		txtpnPerdiste.setVisible(true);}
		
	}

	public JTextField getTextField() {
		return textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}
}
