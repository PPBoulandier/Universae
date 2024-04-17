
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Veronica Gamboa
 */
public class Funciones {         
    /**
     *
     * @param p crear funcion para los panel Game y Home
     */
        public static void ShowPanel (JPanel p){
        
            p.setSize (740, 330);
            p.setLocation (0 , 0);
        
            bgContent.removeAll();
            bgContent.add (p,BorderLayout.CENTER);
            bgContent.revalidate();
            bgContent.repaint();
            
        
        }
    
}
