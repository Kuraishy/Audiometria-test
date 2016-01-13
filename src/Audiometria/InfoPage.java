package Audiometria;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
//import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.Font;


/**
 *  Ricardo
 * 
 * ventana que muestra toda la informacion, ya sea instrucciones y autor
 */


public class InfoPage extends JFrame {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//es un jframe que es diferente al windows aplication, jframe es para otras ventanas

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InfoPage frame = new InfoPage();
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
	public InfoPage() {
		setTitle("Info");
		setType(Type.POPUP);
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE );//al presionar salir solo esta ventana se cierra
	///	setDefaultCloseOperation(this.setVisible(false));
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html>Para registrar un movimiento presione Imprimir.\r\n<BR>Para ver los resultados vaya hasta opciones->terminar.\r\n<BR>una pesta\u00F1a debe aparecer con los resultados.\r\n<h2>Margen de error de +- 10 db.</html>");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel.setBounds(109, 11, 253, 212);
		contentPane.add(lblNewLabel);
	}
}
