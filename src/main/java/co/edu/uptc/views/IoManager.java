package co.edu.uptc.views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JWindow;
import java.awt.*;

public class IoManager extends JFrame {

    private JButton centeredButton;
    private JWindow windowForButton;

    public IoManager(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        windowForButton = new JWindow();//Como un JDialog pero sin marco. Perfecto para crear la ilusión de un objeto flotante.
        windowForButton.setSize(200, 30);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension windowSize = windowForButton.getSize();
        int x = (screenSize.width - windowSize.width)/2; //centrar horizontalmente
        int y = (screenSize.height - windowSize.height)/2; //centrar verticalmente
        windowForButton.setLocation(x, y);;
        windowForButton.setAlwaysOnTop(true);
        centeredButton = new JButton("centeredButton");
        windowForButton.add(centeredButton);
        windowForButton.setVisible(true); //JWindow y JDialog no son objetos JComponent y no se agregan anun contenedor
    }
    
}