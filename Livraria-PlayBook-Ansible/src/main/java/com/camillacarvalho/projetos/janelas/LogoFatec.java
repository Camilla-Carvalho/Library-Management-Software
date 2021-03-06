package com.camillacarvalho.projetos.janelas;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class LogoFatec extends JPanel {

    private BufferedImage image;

    public LogoFatec() {
       try {                
          image = ImageIO.read(new File("./logo-fatec-botucatu.jpg"));
       } catch (IOException ex) {
            System.out.println(ex);
       }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this); // see javadoc for more info on the parameters            
    }

}