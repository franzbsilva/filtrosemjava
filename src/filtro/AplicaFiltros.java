package filtro;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

/**
 *
 * @author Creativs Werlan
 */
public class AplicaFiltros {
        
    JFileChooser arquivo = new JFileChooser();
    public void vermelho(){
        
    JFileChooser arquivo = new JFileChooser();
       
    int opcao = arquivo.showOpenDialog(arquivo); // verificar se selecionou arquivo
    if (opcao == JFileChooser.APPROVE_OPTION){ //verifica se carregou a imagem
                File file = new File("caminho");
                file = arquivo.getSelectedFile();// recebe onde a imagem está
                String filename = file.getAbsolutePath();
    
        AplicaFiltros pdi = new AplicaFiltros();
        BufferedImage buffeIN, bufferOUT;

        //Seleção Color
        buffeIN = pdi.carrega_img(filename);
        bufferOUT = vermelho.corimagen(buffeIN);
    
        try {
            
            pdi.exibe_img(buffeIN);
            
            pdi.save("C:\\Users\\Public\\Pictures/FotoColorida.png", bufferOUT);
        } catch (IOException ex) {
            Logger.getLogger(AplicaFiltros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    
    public void verde(){
        
    JFileChooser arquivo = new JFileChooser();
       
    int opcao = arquivo.showOpenDialog(arquivo); // verificar se selecionou arquivo
    if (opcao == JFileChooser.APPROVE_OPTION){ //verifica se carregou a imagem
                File file = new File("caminho");
                file = arquivo.getSelectedFile();// recebe onde a imagem está
                String filename = file.getAbsolutePath();
    
        AplicaFiltros pdi = new AplicaFiltros();
        BufferedImage buffeIN, bufferOUT;

        //Seleção Color
        buffeIN = pdi.carrega_img(filename);
        bufferOUT = verde.corimagen(buffeIN);
    
        try {
            
            pdi.exibe_img(buffeIN);
            
            pdi.save("C:\\Users\\Public\\Pictures/verde.png", bufferOUT);
        } catch (IOException ex) {
            Logger.getLogger(AplicaFiltros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    
    public void azul(){
        
    JFileChooser arquivo = new JFileChooser();
       
    int opcao = arquivo.showOpenDialog(arquivo); // verificar se selecionou arquivo
    if (opcao == JFileChooser.APPROVE_OPTION){ //verifica se carregou a imagem
                File file = new File("caminho");
                file = arquivo.getSelectedFile();// recebe onde a imagem está
                String filename = file.getAbsolutePath();
    
        AplicaFiltros pdi = new AplicaFiltros();
        BufferedImage buffeIN, bufferOUT;

        //Seleção Color
        buffeIN = pdi.carrega_img(filename);
        bufferOUT = azul.corimagen(buffeIN);
    
        try {
            
            pdi.exibe_img(buffeIN);
            
            pdi.save("C:\\Users\\Public\\Pictures/azul.png", bufferOUT);
        } catch (IOException ex) {
            Logger.getLogger(AplicaFiltros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    
    
    void amarelo() {
        
    JFileChooser arquivo = new JFileChooser();
       
    int opcao = arquivo.showOpenDialog(arquivo); // verificar se selecionou arquivo
    if (opcao == JFileChooser.APPROVE_OPTION){ //verifica se carregou a imagem
                File file = new File("caminho");
                file = arquivo.getSelectedFile();// recebe onde a imagem está
                String filename = file.getAbsolutePath();
    
        AplicaFiltros pdi = new AplicaFiltros();
        BufferedImage buffeIN, bufferOUT;

        //Seleção Color
        buffeIN = pdi.carrega_img(filename);
        bufferOUT = amarelo.corimagen(buffeIN);
    
        try {
            
            pdi.exibe_img(buffeIN);
            
            pdi.save("C:\\Users\\Public\\Pictures/amarelo.png", bufferOUT);
        } catch (IOException ex) {
            Logger.getLogger(AplicaFiltros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }

    void ciano() {
        
    JFileChooser arquivo = new JFileChooser();
       
    int opcao = arquivo.showOpenDialog(arquivo); // verificar se selecionou arquivo
    if (opcao == JFileChooser.APPROVE_OPTION){ //verifica se carregou a imagem
                File file = new File("caminho");
                file = arquivo.getSelectedFile();// recebe onde a imagem está
                String filename = file.getAbsolutePath();
    
        AplicaFiltros pdi = new AplicaFiltros();
        BufferedImage buffeIN, bufferOUT;

        //Seleção Color
        buffeIN = pdi.carrega_img(filename);
        bufferOUT = ciano.corimagen(buffeIN);
    
        try {
            
            pdi.exibe_img(buffeIN);
            
            pdi.save("C:\\Users\\Public\\Pictures/Ciano.png", bufferOUT);
        } catch (IOException ex) {
            Logger.getLogger(AplicaFiltros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }

    
    
    public void negativo(){
        
        JFileChooser arquivo = new JFileChooser();
       
    int opcao = arquivo.showOpenDialog(arquivo); // verificar se selecionou arquivo
    if (opcao == JFileChooser.APPROVE_OPTION){ //verifica se carregou a imagem
                File file = new File("caminho");
                file = arquivo.getSelectedFile();// recebe onde a imagem está
                String filename = file.getAbsolutePath();
    
        AplicaFiltros pdi = new AplicaFiltros();
        BufferedImage buffeIN, bufferOUT;

        //Seleção Color
        buffeIN = pdi.carrega_img(filename);
        bufferOUT = Negativa.negativa(buffeIN);

        try {
            
            pdi.exibe_img(buffeIN);
            
            pdi.save("C:\\Users\\Public\\Pictures/Negativa.png", bufferOUT);
        } catch (IOException ex) {
            Logger.getLogger(AplicaFiltros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    
    public void limiariza(){
    //lumiar
        JFileChooser arquivo = new JFileChooser();
       
    int opcao = arquivo.showOpenDialog(arquivo); // verificar se selecionou arquivo
    if (opcao == JFileChooser.APPROVE_OPTION){ //verifica se carregou a imagem
                File file = new File("caminho");
                file = arquivo.getSelectedFile();// recebe onde a imagem está
                String filename = file.getAbsolutePath();
    
        AplicaFiltros pdi = new AplicaFiltros();
        BufferedImage buffeIN, bufferOUT;

        //Seleção Color
        buffeIN = pdi.carrega_img(filename);
        bufferOUT = limiariza.limiarizar(buffeIN);

        try {
            
            pdi.exibe_img(buffeIN);
            
            pdi.save("C:\\Users\\Public\\Pictures/FotoLimiar.png", bufferOUT);
        } catch (IOException ex) {
            Logger.getLogger(AplicaFiltros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    
    public void cinza(){
        JFileChooser arquivo = new JFileChooser();
       
    int opcao = arquivo.showOpenDialog(arquivo); // verificar se selecionou arquivo
    if (opcao == JFileChooser.APPROVE_OPTION){ //verifica se carregou a imagem
                File file = new File("caminho");
                file = arquivo.getSelectedFile();// recebe onde a imagem está
                String filename = file.getAbsolutePath();
    
        AplicaFiltros pdi = new AplicaFiltros();
        BufferedImage buffeIN, bufferOUT;
        buffeIN = pdi.carrega_img(filename);
        bufferOUT = EscalaCinza.escalaDeCinza(buffeIN);

        try {
            
            pdi.exibe_img(buffeIN);
            
            pdi.save("C:\\Users\\Public\\Pictures/fotocinza.png", bufferOUT);
        } catch (IOException ex) {
            Logger.getLogger(AplicaFiltros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    
    public void sepia(){
        JFileChooser arquivo = new JFileChooser();
       
    int opcao = arquivo.showOpenDialog(arquivo); // verificar se selecionou arquivo
    if (opcao == JFileChooser.APPROVE_OPTION){ //verifica se carregou a imagem
                File file = new File("caminho");
                file = arquivo.getSelectedFile();// recebe onde a imagem está
         
        String filename = file.getAbsolutePath();    
        
        AplicaFiltros pdi = new AplicaFiltros();
        BufferedImage buffeIN, bufferOUT;
        buffeIN = pdi.carrega_img(filename);
       bufferOUT = sepia.sepia(buffeIN);

        try {
            pdi.save("C:\\Users\\Public\\Pictures/fotoSepia.png", bufferOUT);
            pdi.exibe_img(buffeIN);
        } catch (IOException ex) {
            Logger.getLogger(AplicaFiltros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    
    public void exibe_img(BufferedImage view) {
        String imagem = null;
        ImageIcon icon = new ImageIcon(view, imagem);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
       
        
        int w= icon.getIconWidth();
        int h =icon.getIconHeight();
            
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new GridLayout());
        contentPane.add(new JScrollPane(imageLabel));
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(w,h);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        
    }

    public BufferedImage carrega_img(String arq) {

        try {
            BufferedImage img = ImageIO.read(new File(arq));
            return img;
        } catch (IOException ex) {

            System.out.println(ex.getMessage() + "Erro ao abrir o arquvo");
        }
        return null;
    }
    
    public BufferedImage copy_img(BufferedImage buffer) {
        int width = buffer.getWidth();
        int height = buffer.getHeight();
        int red, green, blue;

        BufferedImage buffer_out = new BufferedImage(width, height, buffer.getType());

        Raster raster = buffer.getRaster();
        WritableRaster wraster = buffer_out.getRaster();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                red = raster.getSample(x, y, 0);
                green = raster.getSample(x, y, 1);
                blue = raster.getSample(x, y, 2);

                //    System.out.println("Red: "+red+" Green: "+green+" Blue: "+blue);
                //CTRL+V
                wraster.setSample(x, y, 0, red);
                wraster.setSample(x, y, 1, green);
                wraster.setSample(x, y, 2, blue);

            }
        }

       exibe_img(buffer);
       exibe_img(buffer_out);

        try {
            save("copy.jpg", buffer_out);

        } catch (IOException ex) {
            Logger.getLogger(AplicaFiltros.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void save(String name, BufferedImage buffer_out) throws IOException {
        File output = new File(name);
        ImageIO.write(buffer_out, "png", output);
        ImageIO.write(buffer_out, "jpg", output);
        ImageIO.write(buffer_out, "jpeg", output);
    }

}
