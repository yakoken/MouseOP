//package it.org.rundog;
//import java.awt.*;
import java.awt.Robot;
import java.awt.AWTException;
public class MouseMove{
	public static void main(String args[]){
		Robot r;
		try { r = new Robot();}
		catch(AWTException e){
			e.printStackTrace();
			return;
		}
		for(int i=30;i<1200;i+=10){
			try{Thread.sleep(100);}
			catch(InterruptedException e){return;}
			//r.mouseMove(i,i);
			if(i<600)
				r.mouseMove(i,i);
			else
				r.mouseMove(i,1200-i);
		}
	}
}
