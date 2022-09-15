import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    int count = 0;
    JFrame frame = new JFrame();


    JLabel label = new JLabel("Number of Clicks: ");

    JPanel panel = new JPanel();
    public GUI(){

        JButton button = new JButton("Click Me");
        button.addActionListener(this);

        panel.setBorder (BorderFactory.createEmptyBorder(100,200,100,200));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);


    }
    public static void main (String[] args){

        new GUI();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}
