/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Date;

/**
 *
 * @author asus
 */
public class NewApplet extends Applet {
    Date d;
    Font f=new Font("Arial",Font.BOLD,50);

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        setBackground(new Color(200,36,89));
        setSize(1000,200);
        // TODO start asynchronous download of heavy resources
    }

    public void paint(Graphics g){
        g.setFont(f);
        g.setColor(new Color(100,50,8));
        d = new Date();
        g.drawString(d.toString(),100,100);}
    // TODO overwrite start(), stop() and destroy() methods
}
