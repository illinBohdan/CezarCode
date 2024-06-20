import javax.swing.*;
import java.awt.*;
import java.io.IOException;

import static text.StringFinal.*;

public class GraphicsWindow extends JFrame {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;

    private JLabel label;


    GraphicsWindow() {
        initComponents();
        actionLisener();
        window();

    }


    private void initComponents() {
        this.setTitle("CodeCesar");
        label = new JLabel(MODE);
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");

        this.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 25));
        this.add(label);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);


    }
    private void actionLisener() {
        button1.addActionListener(e -> {
            try {
                //secondWindows();
                Selector.start(1);

            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        });
        button2.addActionListener(e -> {
            try {
                Selector.start(2);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        button3.addActionListener(e -> {
            try {
                Selector.start(3);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        button4.addActionListener(e -> {
            try {
                Selector.start(4);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }

    private void secondWindows(){
        JFrame jFrame2 = new JFrame();
        jFrame2.setTitle("CodeCesar2");
        jFrame2.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jFrame2.setVisible(true);
        jFrame2.setLocationRelativeTo(null);
        jFrame2.setSize(350, 100);

        label = new JLabel(FILE_FOR_ENCRYPT);
        button1 = new JButton("11");
        button2 = new JButton("22");
        jFrame2.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 25));
        jFrame2.add(label);
        jFrame2.add(button1);
       // jFrame2.add(button2);
        jFrame2.pack();
    }

    private void window() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setLocationRelativeTo(null);
        this.setSize(650, 300);
        // frame.setLayout(null);
        this.setVisible(true);
          }



}
