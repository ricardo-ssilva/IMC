package com.calculadora_imc.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.calculadora_imc.control.ImcController;

import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;

public class MainViewer {

	private JFrame calculadoraFrame;
	private JTextField pesoTextField;
	private JTextField alturaTextField;
	private JTextPane resultPane;
	private JLabel lblKg;
	private JLabel lblM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainViewer window = new MainViewer();
					window.calculadoraFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainViewer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		calculadoraFrame = new JFrame();
		calculadoraFrame.setTitle("Calculadora IMC");
		calculadoraFrame.setBounds(100, 100, 300, 400);
		calculadoraFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculadoraFrame.getContentPane().setLayout(null);

		JLabel lblCalculadora = new JLabel("Calculadora IMC");
		lblCalculadora.setForeground(Color.BLUE);
		lblCalculadora.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblCalculadora.setBounds(27, 11, 222, 49);
		calculadoraFrame.getContentPane().add(lblCalculadora);

		JLabel pesoLabel = new JLabel("Peso:");
		pesoLabel.setFont(new Font("Tahoma", Font.PLAIN, 29));
		pesoLabel.setBounds(27, 78, 80, 30);
		calculadoraFrame.getContentPane().add(pesoLabel);

		pesoTextField = new JTextField();
		pesoTextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pesoTextField.setText("0.0");
		pesoTextField.setHorizontalAlignment(SwingConstants.CENTER);
		pesoTextField.setBounds(115, 78, 95, 30);
		calculadoraFrame.getContentPane().add(pesoTextField);
		pesoTextField.setColumns(10);

		JLabel alturaLabel = new JLabel("Altura:");
		alturaLabel.setFont(new Font("Tahoma", Font.PLAIN, 29));
		alturaLabel.setBounds(22, 112, 85, 30);
		calculadoraFrame.getContentPane().add(alturaLabel);

		alturaTextField = new JTextField();
		alturaTextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		alturaTextField.setText("0.0");
		alturaTextField.setHorizontalAlignment(SwingConstants.CENTER);
		alturaTextField.setColumns(10);
		alturaTextField.setBounds(115, 112, 95, 30);
		calculadoraFrame.getContentPane().add(alturaTextField);

		JButton calcularButton = new JButton("Calcular");
		calcularButton.setForeground(Color.BLUE);
		calcularButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		calcularButton.setBounds(68, 171, 138, 38);
		calcularButton.addActionListener(new ImcController(this));
		calculadoraFrame.getContentPane().add(calcularButton);

		resultPane = new JTextPane();
		resultPane.setForeground(Color.RED);
		resultPane.setFont(new Font("Tahoma", Font.PLAIN, 23));
		resultPane.setBounds(10, 220, 264, 117);
		calculadoraFrame.getContentPane().add(resultPane);

		lblKg = new JLabel("Kg Ex. 80");
		lblKg.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblKg.setBounds(220, 71, 54, 38);
		calculadoraFrame.getContentPane().add(lblKg);

		lblM = new JLabel("M Ex. 1.80");
		lblM.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblM.setBounds(220, 109, 54, 38);
		calculadoraFrame.getContentPane().add(lblM);
	}

	public JFrame getCalculadoraFrame() {
		return calculadoraFrame;
	}

	public void setCalculadoraFrame(JFrame calculadoraFrame) {
		this.calculadoraFrame = calculadoraFrame;
	}

	public JTextField getPesoTextField() {
		return pesoTextField;
	}

	public void setPesoTextField(JTextField pesoTextField) {
		this.pesoTextField = pesoTextField;
	}

	public JTextField getAlturaTextField() {
		return alturaTextField;
	}

	public void setAlturaTextField(JTextField alturaTextField) {
		this.alturaTextField = alturaTextField;
	}

	public JTextPane getResultPane() {
		return resultPane;
	}

	public void setResultPane(JTextPane resultPane) {
		this.resultPane = resultPane;
	}

}
