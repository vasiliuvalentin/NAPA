/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napa;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Vali
 */
public class Methods {
    Connection con = null;
	public static Connection DBConector(){
		try{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/napa","root","");
			return con;
		}
                catch(Exception e){
			return null;
		}
        }
       public  void check(java.awt.event.KeyEvent evt){
        char vChar = evt.getKeyChar();
                    if (!(Character.isDigit(vChar)
                            || (vChar == KeyEvent.VK_BACK_SPACE)
                            || (vChar == KeyEvent.VK_DELETE))) {
                        evt.consume();
                    }
       }
}
