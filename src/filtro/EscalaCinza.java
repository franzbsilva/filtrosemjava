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
public class EscalaCinza {
    
    public static BufferedImage escalaDeCinza(BufferedImage buffer){
         int width = buffer.getWidth();
        int height = buffer.getHeight();
        int red, green, blue, media;
   
        
        Raster raster = buffer.getRaster();
        //valores RGB
        for(int y=0; y<height; y++)
        for(int x=0; x<width; x++){
            red = raster.getSample(x, y, 0);
          green = raster.getSample(x, y, 1);
           blue = raster.getSample(x, y, 2);
       
       
        media = (red + green + blue) /3; //media dos valores RGB
       
            Color color = new Color(media,media,media); //escala de cinzar valor RGM com o valor da média
            buffer.setRGB(x,y, color.getRGB());
            
            
        }
        return buffer;
    }
    
}