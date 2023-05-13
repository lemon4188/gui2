import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Main extends JFrame{
    JButton button1;
    public Main(){
        setSize(300,300);
        button1=new JButton("close");
        add(button1);
    }
    public static void main(String[] args) {
        Main frame=new Main();
        frame.setSize(200, 200);
        frame.setTitle("dqy");
        frame.setVisible(true);
        frame.button1.addActionListener(new p());
    }
}
class p implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }
}