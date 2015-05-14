//package it.org.rundog;
//import java.awt.*;
import java.awt.Robot;
import java.awt.AWTException;
import javax.swing.JFrame;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;

public class MouseMove{
	public static void main(String args[]){
		// ウィンドウを作成
		JFrame frame = new JFrame("MouseMove.java");
		frame.setBounds(300,200,400,350);
		frame.setVisible(true);


		// クリック位置を取得する
		PointerInfo pI = MouseInfo.getPointerInfo();
		Point point = pI.getLocation();
		System.out.println(point.getX()+" "+point.getY());


		// マウスポインタの操作
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
