
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 
 */
public class Funciones extends Main  {         
    /**
     *
     * @param p crear funcion para los panel Game y Home
     */
        public static void ShowPanel (JPanel p, JPanel jPanelContent){
        
            p.setSize (1550, 870);
            p.setLocation (370 , 210);
        
            jPanelContent.removeAll();
            jPanelContent.add (p,BorderLayout.CENTER);
            jPanelContent.revalidate();
            jPanelContent.repaint(); 
        }
        
        //Efecto Hover y creacion de grados
        
        public static void SetImageLabelDIM (JLabel label, String path,int width, int height) {
            
           
           
            ImageIcon image = new ImageIcon (path);
            Icon icon;
            icon = new ImageIcon (
                image.getImage().getScaledInstance(width,height,Image.SCALE_SMOOTH));
            label.setIcon(icon);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setVerticalAlignment(SwingConstants.CENTER);
            label.repaint();
            
        }    
        //Aumenta imagen para el efecto hover
        
        public static void SetImageLabelMAX (JLabel label, String path) {
            
            ImageIcon image = new ImageIcon (path);
            Icon icon;
            icon = new ImageIcon (
                image.getImage().getScaledInstance(label.getWidth()+50,label.getHeight()+50,Image.SCALE_SMOOTH));
            label.setIcon(icon);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            //label.setOpaque(true);
            label.repaint();
        } 
        
        //Configuracion de los botones de los grados leyendo un fichero JSON
        
        public static void ConfigButtons (JPanel panel){
                
                
            // Leer el JSON
                try {
                
                    BufferedReader br = new BufferedReader(new FileReader("src/Config.json"));
                    StringBuilder jsonContent = new StringBuilder();
                    String line;
                    while ((line = br.readLine()) != null) {
                        jsonContent.append(line);
                    }
                    br.close();
                            
            // Parsear el JSON
                    JSONObject jsonObject = new JSONObject(jsonContent.toString());
                    JSONArray lButtonsArray = jsonObject.getJSONArray("modulos");
                    
            // Recorremos Array para sacar los index
                        for (int i = 0; i < lButtonsArray.length(); i++) {
                            JSONObject buttonData = lButtonsArray.getJSONObject(i);
                            String nombre_modulo = buttonData.getString("nombre_modulo");
                            String path_launcherButton = buttonData.getString("path_launcherButton");
                            String path_home_button = buttonData.getString("path_home_button");
                            String imageGame0 = buttonData.getString("imageGame0");
                            String imageGame1 = buttonData.getString("imageGame1");
                            String imageGame2 = buttonData.getString("imageGame2");
                            String imageGame3 = buttonData.getString("imageGame3");
                            String imageGame4 = buttonData.getString("imageGame4");
                            String titulo_game = buttonData.getString("titulo_game");
                            String descripcion = buttonData.getString("descripcion");
                            String duracion = buttonData.getString("duracion");
                            String dificultad = buttonData.getString("dificultad");
                            String path_app = buttonData.getString("path_app");
                            
                            
                            
                            
                            
                // Crear botón
                            
                            JLabel label = new JLabel(nombre_modulo);
                            Funciones.SetImageLabelDIM (label, path_launcherButton,103,111);
                            
                            
                            //Agregar botón al panel
                            panel.add(label);
                            
                            
                            
                        }
                                    
                } catch (IOException | JSONException e) {
                e.printStackTrace();
                }
                
        }
}
        

   

