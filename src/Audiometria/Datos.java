
package Audiometria;

import java.util.ArrayList;
import java.io.*;
import java.io.File;
import java.io.IOException;



/*frecuencia.size(); // returns length of 1
int answer = theArray.get(0); // index 0 = 5*/

public class Datos {
	

		
public	ArrayList<Integer> frecuencia = new ArrayList<Integer>();
public 	ArrayList<Integer> decibel = new ArrayList<Integer>();
//int[] frecuencia;
//int[] decibel;


int contador=1;
	public void GuardarDatos(int frec,int db){
	contador++;	
	frecuencia.add(frec); // places at index 0
	decibel.add(db);

	
		return;
	}
	
	   File myFile = new File("Resultados Audiometro.txt");
	   FileWriter fw=null;

/* muestra los datos tanto en la consola como */
	public void MostrarDatos(){
		 
   
		/* for(int i=0; i<frecuencia.size();i++){

			 System.out.println(frecuencia.get(i) + " Hz a "+ decibel.get(i)+ " db"); 
		 }
	*/
		  try {
	           
			   fw = new FileWriter(myFile);
			  // Interface inter = new Interface();
			   
			   
				 for(int i=0; i<frecuencia.size();i++){
	            fw.write(frecuencia.get(i) + " Hz a "+ decibel.get(i)+ " db");//crea un texto con los resultados
	          //  fw.newLine();

	            fw.write(System.getProperty( "line.separator" ));//crea un salto de linea
	            fw.flush();
				 }
	            fw.close();//cierra
		  		} catch (IOException e) {
		  				e.printStackTrace();
		  			}
		  ResultadosPage resu = new ResultadosPage(); //muestra la ventana de los resultados
		  resu.setVisible(true);
		return;
	}
	
public  int enviardb (){
/*	
	 for(int i=0; i<frecuencia.size();i++){
         fw.write(frecuencia.get(i) + " Hz a "+ decibel.get(i)+ " db");//crea un texto con los resultados
       //  fw.newLine();
	 }*/
	return decibel.get(contador);
}
	
	public void AbrirDatos(){
		//abre los datos del resultado
		Runtime runtime = Runtime.getRuntime();
		  try {
	           

				runtime.exec("C:\\Windows\\notepad.exe Resultados Audiometro.txt");

		  		} catch (IOException e) {
		  				e.printStackTrace();
		  			}

		
		
	}
}
	

