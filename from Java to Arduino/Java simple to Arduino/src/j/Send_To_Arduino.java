package j;

import java.util.Scanner;

import arduino.*;

public class Send_To_Arduino {

	public static void main(String[] args) {
		try{
		//Scanner ob = new Scanner(System.in);
		Arduino arduino = new Arduino("COM5", 9600); //enter the port name here, and ensure that Arduino is connected, otherwise exception will be thrown.
		arduino.openConnection();
		
                Thread.sleep(1000);
                arduino.serialWrite("0");
                Thread.sleep(1000);
                arduino.serialWrite("1");
                Thread.sleep(1000);
                arduino.serialWrite("2");
                Thread.sleep(1000);
                arduino.serialWrite("1");
                //Thread.sleep(1);
		//ob.close();
		arduino.closeConnection();
                }
                catch( Exception ex){ex.printStackTrace(); }

	}

}
