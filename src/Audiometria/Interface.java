package Audiometria;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Font;

/**
 * @author Ricardo
 *ventana de la interface en una aplicacion de windows
 */
public class Interface {
	Datos datos=new Datos();//ventana de dato
	private JFrame frmAudiometroVersion;
    double a;
    int b;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frmAudiometroVersion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAudiometroVersion = new JFrame();
		frmAudiometroVersion.setTitle("Audiometro Version 3 ");
		frmAudiometroVersion.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Ricardo\\Pictures\\medieval_lasaga.jpg"));
		frmAudiometroVersion.setBounds(100, 100, 325, 510);
		frmAudiometroVersion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAudiometroVersion.getContentPane().setLayout(null);
		

		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setBounds(10, 27, 89, 23);
		frmAudiometroVersion.getContentPane().add(btnImprimir);
		
		JButton btnGenerarTono = new JButton("Generar Tono");
		btnGenerarTono.setBounds(116, 427, 171, 23);
		frmAudiometroVersion.getContentPane().add(btnGenerarTono);
		
	    
	    JSlider Volumen = new JSlider();

	    Volumen.setSnapToTicks(true);
	    Volumen.setOrientation(SwingConstants.VERTICAL);
	    Volumen.setBounds(17, 117, 59, 344);
	    Volumen.setPaintLabels(true);
	    Volumen.setPaintTicks(true);
	    Volumen.setMajorTickSpacing(5);
	    Volumen.setMinorTickSpacing(1);
	    Volumen.setToolTipText("Volumen 0 - min, 100 - max");
	    Volumen.setBorder(new TitledBorder("Volumen"));
	    frmAudiometroVersion.getContentPane().add(Volumen);
	    
	    JSlider Milisegundos = new JSlider();
	    Milisegundos.setSnapToTicks(true);
	    Milisegundos.setValue(1000);
	    Milisegundos.setMaximum(2000);
	    Milisegundos.setPaintLabels(true);
	    Milisegundos.setPaintTicks(true);
	    Milisegundos.setMinorTickSpacing(100);
	    Milisegundos.setMajorTickSpacing(200);
	    Milisegundos.setToolTipText("Volumen 0 - min, 100 - max");
	    Milisegundos.setOrientation(SwingConstants.VERTICAL);

	    Milisegundos.setBorder(new TitledBorder("Milisegundos"));
	    Milisegundos.setBounds(209, 171, 78, 245);
	    frmAudiometroVersion.getContentPane().add(Milisegundos);
	    
	    JSlider Frecuencia = new JSlider();
	    Frecuencia.setSnapToTicks(true);
	    Frecuencia.setValue(500);
	    Frecuencia.setPaintLabels(true);
	    Frecuencia.setPaintTicks(true);
	    Frecuencia.setMinimum(200);
	    Frecuencia.setMaximum(2000);
	    Frecuencia.setToolTipText("Volumen 0 - min, 100 - max");
	    Frecuencia.setOrientation(SwingConstants.VERTICAL);
	    Frecuencia.setMinorTickSpacing(100);
	    Frecuencia.setMajorTickSpacing(200);
	    Frecuencia.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Hz", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
	    Frecuencia.setBounds(111, 171, 78, 245);
	    frmAudiometroVersion.getContentPane().add(Frecuencia);
	    
	    JMenuBar menuBar = new JMenuBar();
	    menuBar.setBounds(0, 0, 287, 21);
	    frmAudiometroVersion.getContentPane().add(menuBar);
	    
	    JMenu Opciones = new JMenu("Opciones\r\n");
	    menuBar.add(Opciones);
	    
	    JMenuItem Terminar = new JMenuItem("Terminar");
	    Opciones.add(Terminar);
	    
	    
	    
	    JCheckBoxMenuItem OidoIzquierdo = new JCheckBoxMenuItem("Oido Izquierdo");
	    Opciones.add(OidoIzquierdo);
	    
	    JCheckBoxMenuItem OidoDerecho = new JCheckBoxMenuItem("Oido Derecho");
	    Opciones.add(OidoDerecho);
	    
	    JMenu Channel = new JMenu("Speakers");
	    Opciones.add(Channel);
	    
	    JMenuItem mntmInfo = new JMenuItem("Info");
	    mntmInfo.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		//al presionar el boton de info se genera una ventana conla infor
	    		InfoPage info= new InfoPage();
	    		info.setVisible(true);
	    		//info.setVisible(true);
	    	}
	    });
	    Opciones.add(mntmInfo);
	    
	    JLabel lblNewLabel = new JLabel("Decibeles");
	    lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
	    lblNewLabel.setBounds(20, 61, 109, 45);
	    frmAudiometroVersion.getContentPane().add(lblNewLabel);
	    
	    JButton btnCalibrar = new JButton("Calibrar");
	    btnCalibrar.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		CalibrarPage cali = new CalibrarPage();
	    		cali.setVisible(true);
	    	}
	    });
	    btnCalibrar.setBounds(153, 27, 89, 23);
	    frmAudiometroVersion.getContentPane().add(btnCalibrar);
	    
	    Volumen.addChangeListener(new ChangeListener() {
	    	public void stateChanged(ChangeEvent arg0) {
				Double temp= new Double(20*Math.log10((Volumen.getValue()*1.27)/0.254));//cambia de volumen a decibeles
			  //     Double decibeles3 = new Double(20*Math.log10(volume/0.254));

				int temp2 = temp.intValue();//crea enteros a partir de esos decibeles
				
				String  temp3 = String.valueOf(temp2);//crea enteros a partir de esos decibeles
				if (temp2!=0) lblNewLabel.setText(temp3+" db");
				else  lblNewLabel.setText("0 db");
	    	}
	    });
	    

	    
	    //GENERA EL TONO Y ENVIE LOS VALORES DE DATOS A LA FUNCION DE CGENERAR TONOS
	    btnGenerarTono.addActionListener( new ActionListener() {
	        public void actionPerformed(ActionEvent ae) {
	          try{
	        	  
	        	  //maximo volumen es 127 entonces la amplitud = 1 = 127
	        	  // multiplicar el volumen por 1.27 y dividirlo por 127 para dar con la amplitud
	        	  Tonos.generateTone(Frecuencia.getValue(), Milisegundos.getValue(),(int)(Volumen.getValue()*1.27), false);
	        	
	          }catch(LineUnavailableException lue){
	            System.out.println(lue);
	          }
	        }
	      } );
	    


		btnImprimir.addActionListener(new ActionListener() {
			//el boton de imprimir manda datos a la clase de datos
			public void actionPerformed(ActionEvent arg0) {
				Double temp= new Double(20*Math.log10(Volumen.getValue()*1.27));//cambia de volumen a decibeles
				
				int temp2 = temp.intValue();//crea enteros a partir de esos decibeles
				
				datos.GuardarDatos(Frecuencia.getValue(),temp2 );//envia los datos a una base de datos hechas por arrays
			}
		});
	    
	    Terminar.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		datos.MostrarDatos();

	    		//al terminar muestsa los datos.
	    		//falta agregar la ventana donde muestra los datos del sonido

	    	}
	    });

	}
	
    public void tec (double i){
    	a=i;
    	//  Tonos.calibra ((int)(Volumen.getValue()*1.27));
    	return;
    }
    
	}
