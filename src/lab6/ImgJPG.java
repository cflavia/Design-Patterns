package lab6;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImgJPG {
    public static void img(String i) throws IOException {
        BufferedImage picture= ImageIO.read(new File(i));
        JLabel pLable=new JLabel(new ImageIcon(picture));
        JPanel jPanel=new JPanel();
        jPanel.add(pLable);
        JFrame jFrame=new JFrame();
        jFrame.setSize(new Dimension(picture.getWidth(), picture.getHeight()));
        jFrame.add(jPanel);
        jFrame.setVisible(true);

    }
}
