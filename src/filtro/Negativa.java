/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filtro;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;

/**
 *
 * @author Creativs
 */
public class Negativa {
    
    public static BufferedImage negativa(BufferedImage buffer){
         int width = buffer.getWidth();
         int height = buffer.getHeight();
         int red, green, blue, media, cinza;
   
        
        Raster raster = buffer.getRaster();
        //valores RGB
        for(int y=0; y<height; y++)
        for(int x=0; x<width; x++){
            red = raster.getSample(x, y, 0);
          green = raster.getSample(x, y, 1);
           blue = raster.getSample(x, y, 2);
       //fim do v. RGB   
       
       // media = ((red) + green + blue)/3; //media dos valores RGB
       
       
            Color color = new Color(255-red,255-green,255-blue); //escala de cinzar valor RGM com o valor da média
            buffer.setRGB(x,y, color.getRGB());
            
            
        }
        return buffer;
    }
}
