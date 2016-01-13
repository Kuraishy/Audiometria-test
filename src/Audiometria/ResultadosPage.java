package Audiometria;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.util.ArrayList;
//import java.awt.Label;
import javax.swing.JLabel;
//import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class ResultadosPage extends JFrame {

	private JPanel contentPane;
String temp;
public 	ArrayList<Integer> test = new ArrayList<Integer>();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResultadosPage frame = new ResultadosPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	String p = new String();
	public void pi (int a,int b){
		test.add(a);
		p=String.valueOf(a);
		return ;
	}

	public ResultadosPage() {
		setType(Type.POPUP);
		setTitle("Resultados");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 263, 194);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblArchivoresultadosAudiometro = new JLabel("<html>    Archivo \"Resultados Audiometro\" \r\n<br1>       a sido creado</html>");
		lblArchivoresultadosAudiometro.setFont(new Font("Arial", Font.PLAIN, 16));
		lblArchivoresultadosAudiometro.setBounds(27, 0, 195, 107);
		contentPane.add(lblArchivoresultadosAudiometro);
		
		JButton btnIr = new JButton("Abrir");
		btnIr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Datos dat = new Datos();
				dat.AbrirDatos();
				
			}
		});
		btnIr.setBounds(26, 118, 89, 23);
		contentPane.add(btnIr);
		
		JButton btnOk = new JButton("Cerrar");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnOk.setBounds(133, 118, 89, 23);
		contentPane.add(btnOk);
		
		
	}
}
