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
public class sepia {
    
    public static BufferedImage sepia(BufferedImage buffer){
         int width = buffer.getWidth();
         int height = buffer.getHeight();
         int red, green, blue;
         double novoRed=0, novoGreen=0, novoBlue=0;
        
        Raster raster = buffer.getRaster();
        //valores RGB
        for(int y=0; y<height; y++)
        for(int x=0; x<width; x++){
            red = raster.getSample(x, y, 0);
          green = raster.getSample(x, y, 1);
           blue = raster.getSample(x, y, 2);
       //fim do v. RGB  
       
       
       novoRed = 0.393*red + 0.769*green + 0.189*blue;
       novoGreen = 0.349*red + 0.686*green + 0.168*blue;
       novoBlue = 0.272*red + 0.534*green + 0.13*blue;
       
       if (novoRed > 255 ){
           red = (int)255;
       }else{
           red = (int) novoRed;
       }
       if (novoGreen > 255 ){
           green = 255;
       }else{
           green = (int) novoGreen;
       }
       if (novoBlue > 255 ){
           blue = 255;
       }else{
           blue = (int) novoBlue;
       }
       red = (int) novoRed;
       green = (int) novoGreen;
       blue = (int) novoBlue;
       
            
            Color color = new Color(red/2,green/2,blue/2); //escala de cinzar valor RGM com o valor da média
            buffer.setRGB(x,y, color.getRGB());
            
            
        }
        return buffer;
    }
    
}
