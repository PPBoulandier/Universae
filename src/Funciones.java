
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    
    // Variables 
    private static String nombreModulo;
    private static String pathLauncherButton;
    private static String pathHomeButton;
    private static String imageGame0;
    private static String imageGame1;
    private static String imageGame2;
    private static String imageGame3;
    private static String imageGame4;
    private static String tituloGame;
    private static String descripcion;
    private static String duracion;
    private static String dificultad;
    private static String pathApp;
    
    /**
     *
     * //Crear funcion para los panel Game y Home
     */
        public static void ShowPanel (JPanel p, JPanel jPanelContent){
        
            p.setSize (1550, 870);
            p.setLocation (0 , 0);
        
            jPanelContent.removeAll();
            jPanelContent.add (p,BorderLayout.CENTER);
            jPanelContent.revalidate();
            jPanelContent.repaint(); 
        }
        
        //Efecto Hover y creacion de grados
        
        public static void SetImageLabelDIM (JLabel label, String path) {
            
           ImageIcon originalImage = new ImageIcon(path);
    
            // Obtener el ancho y el alto original de la imagen
               int originalWidth = originalImage.getIconWidth();
               int originalHeight = originalImage.getIconHeight();
               Image image = originalImage.getImage().getScaledInstance(originalWidth, originalHeight, Image.SCALE_SMOOTH);
               ImageIcon icon = new ImageIcon(image);
               label.setIcon(icon);
               label.setHorizontalAlignment(SwingConstants.CENTER);
               label.setVerticalAlignment(SwingConstants.CENTER);
               label.repaint();
            
        }    
        //Aumenta imagen para el efecto hover
        
        public static void SetImageLabelMAX (JLabel label, String path) {
            
            ImageIcon originalImage = new ImageIcon(path);
    
            // Obtener el ancho y el alto original de la imagen
               int originalWidth = originalImage.getIconWidth();
               int originalHeight = originalImage.getIconHeight();
    
            // Calcular el nuevo ancho y alto aumentando un 10%
               int newWidth = (int) (originalWidth * 1.2); 
               int newHeight = (int) (originalHeight * 1.2); 
    
            // Escalar la imagen con el nuevo tamaño
               Image scaledImage = originalImage.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
    
            // Crear un nuevo ImageIcon con la imagen escalada
               ImageIcon scaledIcon = new ImageIcon(scaledImage);
               label.setIcon(scaledIcon);
               label.setHorizontalAlignment(SwingConstants.CENTER);
               label.setVerticalAlignment(SwingConstants.CENTER);
    
        } 
         
        
        // Métodos getters para acceder a las variables desde fuera de la clase
    public static String getNombreModulo(int i) {
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
                    JSONObject buttonData = lButtonsArray.getJSONObject(i);
                            nombreModulo = buttonData.getString("nombreModulo");
                            
        } catch (IOException | JSONException e) {
                e.printStackTrace();
                }
        return nombreModulo;
    }

    public static String getPathLauncherButton(int i) {
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
                    JSONObject buttonData = lButtonsArray.getJSONObject(i);
                            pathLauncherButton = buttonData.getString("pathLauncherButton");
                            
        } catch (IOException | JSONException e) {
                e.printStackTrace();
                }
        
        return pathLauncherButton;
    }
    public static String getpathHomeButton(int i) {
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
                    JSONObject buttonData = lButtonsArray.getJSONObject(i);
                            pathHomeButton = buttonData.getString("pathHomeButton");
                            
        } catch (IOException | JSONException e) {
                e.printStackTrace();
                }
        return pathHomeButton;
    }

    public static String getimageGame0(int i) {
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
                    JSONObject buttonData = lButtonsArray.getJSONObject(i);
                            imageGame0 = buttonData.getString("imageGame0");
                            
        } catch (IOException | JSONException e) {
                e.printStackTrace();
                }
        return imageGame0;
    }
    public static String getimageGame1(int i) {
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
                    JSONObject buttonData = lButtonsArray.getJSONObject(i);
                            imageGame1 = buttonData.getString("imageGame1");
                            
        } catch (IOException | JSONException e) {
                e.printStackTrace();
                }
        return imageGame1;
    }

    public static String getimageGame2(int i) {
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
                    JSONObject buttonData = lButtonsArray.getJSONObject(i);
                            imageGame2 = buttonData.getString("imageGame2");
                            
        } catch (IOException | JSONException e) {
                e.printStackTrace();
                }
        return imageGame2;
    }
    public static String getimageGame3(int i) {
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
                    JSONObject buttonData = lButtonsArray.getJSONObject(i);
                            imageGame3 = buttonData.getString("imageGame3");
                            
        } catch (IOException | JSONException e) {
                e.printStackTrace();
                }
        return imageGame3;
    }

    public static String getimageGame4(int i) {
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
                    JSONObject buttonData = lButtonsArray.getJSONObject(i);
                            imageGame4 = buttonData.getString("imageGame4");
                            
        } catch (IOException | JSONException e) {
                e.printStackTrace();
                }
        return imageGame4;
    }
    public static String gettituloGame(int i) {
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
                    JSONObject buttonData = lButtonsArray.getJSONObject(i);
                            tituloGame = buttonData.getString("tituloGame");
                            
        } catch (IOException | JSONException e) {
                e.printStackTrace();
                }
        return tituloGame;
    }

    public static String getdescripcion(int i) {
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
                    JSONObject buttonData = lButtonsArray.getJSONObject(i);
                            descripcion = buttonData.getString("descripcion");
                            
        } catch (IOException | JSONException e) {
                e.printStackTrace();
                }
        return descripcion;
    }
    public static String getduracion(int i) {
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
                    JSONObject buttonData = lButtonsArray.getJSONObject(i);
                            duracion = buttonData.getString("duracion");
                            
        } catch (IOException | JSONException e) {
                e.printStackTrace();
                }
        return duracion;
    }

    public static String getdificultad(int i) {
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
                    JSONObject buttonData = lButtonsArray.getJSONObject(i);
                            dificultad = buttonData.getString("dificultad");
                            
        } catch (IOException | JSONException e) {
                e.printStackTrace();
                }
        return dificultad;
    }
    public static String getpathApp(int i) {
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
                    JSONObject buttonData = lButtonsArray.getJSONObject(i);
                            pathApp = buttonData.getString("pathApp");
                            
        } catch (IOException | JSONException e) {
                e.printStackTrace();
                }
        return pathApp;
    }
}


        

   

