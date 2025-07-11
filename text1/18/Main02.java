import javax.swing.*;
import java.awt.FlowLayout;

public class Main02 {
    public static void main(String[] args){
        JFrame frame = new JFrame("初めてのGUI");
        JLabel label = new JLabel("Hello World!!");
        JButton button = new JButton("押して");
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(label);
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,100);
        frame.setVisible(true);
    }
}
