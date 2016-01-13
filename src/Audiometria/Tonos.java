package Audiometria;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.JFrame;
import javax.sound.sampled.*;

//import audiometria.SinusGenerator;

@SuppressWarnings("serial")
public class Tonos extends JFrame {


static AudioFormat af;
  static SourceDataLine sdl;

  ///INITIALIZER
  public Tonos() {
	   

  }
  
  double vol;
  


  //RECIBE LOS DATOS PARA CREAR EL SONIDO

  public static void generateTone(int hz,int msecs, int volume, boolean addHarmonic)
    throws LineUnavailableException {
	  
	 
    float frequency = 44100;
    byte[] buf;
 //   AudioFormat af;
//SONIDO CREADO
      buf = new byte[1];
      af = new AudioFormat(frequency,8,1,true,false);
     /* buf = new byte[1];
      af = new AudioFormat(frequency,8,1,true,false);*/
      
      /////////////////////
      
      

    SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
    sdl = AudioSystem.getSourceDataLine(af);


  /*  if(volume != 0){

       /*The reason is because on an AV receiver 0dB is meant to be reference volume level, 
    	meaning that no increase or decrease of volume level is being applied. 
    	So when you are listening at -20dB that means you are listening to 20 dB less than the reference level.
       Double decibeles3 = new Double(20*Math.log10(volume/test));
       //Double test = new Double(Math.pow(10, decibeles3));
       
       int dec3= decibeles3.intValue();
      // int dec4= test.intValue();
       System.out.println(dec3);
       

    }
    else
    {

    }*/
   
    sdl.open(af);

    //FloatControl gainControl =  (FloatControl) sdl.getControl(FloatControl.Type.BALANCE);
    
  //  gainControl.setValue(6f); // Reduce volume by 10 decibels.
  
   // gainControl.setValue(-1);
    sdl.start();
    //NO TOCAR
    

    
    for(int i=0; i<msecs*frequency/1000; i++){
      double angle = i/(frequency/hz)*2.0*Math.PI;
      buf[0]=(byte)(Math.sin(angle)*volume);
        sdl.write(buf,0,1);
      /*  buf[0]=(byte)(Math.sin(angle)*volume);
        sdl.write(buf,0,1);*/
    //}
    
    /////////////////

    }
  //  sdl.write(buf,0,2);
    System.out.println(sdl.getLevel());
    System.out.println( );
   
    sdl.drain();
    sdl.stop();
    sdl.close();
  }
  



  public static void calibra (int a, double test){
	//	calibracion = a;test
		
	    if(a != 0){

	        /*The reason is because on an AV receiver 0dB is meant to be reference volume level, 
	     	meaning that no increase or decrease of volume level is being applied. 
	     	So when you are listening at -20dB that means you are listening to 20 dB less than the reference level.*/
	    	//if(test!=null){
	        Double decibeles3 = new Double(20*Math.log10(a/test));
	        //Double test = new Double(Math.pow(10, decibeles3));
	        
	        int dec3= decibeles3.intValue();
	       // int dec4= test.intValue();
	        System.out.println(dec3);//}
	        

	     }
	     else
	     {

	     }
		//test(a);
		return;
  }
}