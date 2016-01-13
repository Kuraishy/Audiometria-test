package Audiometria;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalibrarPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalibrarPage frame = new CalibrarPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalibrarPage() {
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 244, 161);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(76, 36, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDecibelesAlMinimo = new JLabel("Decibeles al minimo volumen");
		lblDecibelesAlMinimo.setBounds(46, 11, 231, 14);
		contentPane.add(lblDecibelesAlMinimo);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			/*	textField.getText();*/
				Tonos tonos = new Tonos();

		//		Double.parseDouble(String)
				Interface inter = new Interface();
				
				inter.tec(Double.parseDouble(textField.getText()));
			}
		});
		btnEnviar.setBounds(76, 85, 89, 23);
		contentPane.add(btnEnviar);
		
		JLabel label = new JLabel("");
		label.setBounds(96, 67, 46, 14);
		contentPane.add(label);
	}
}
