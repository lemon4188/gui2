package exercise;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Windows extends JFrame{
    static JTextField field1;
    private Font f=new Font(" ",Font.PLAIN,30);
    public Windows (){
        setTitle("dqy");
        setSize(300,300);
        field1=new JTextField(50);
        field1.setLocation(200,100);
        field1.setText("嗨嗨嗨！");
        field1.setFont(f);
        add(field1);
    }
    public static void main(String args[]){
        Windows windows1=new Windows();
        windows1.setVisible(true);
        windows1.addWindowListener(new m());
    }
}
class m extends WindowAdapter{
    public void windowOpened(WindowEvent e){
        Windows.field1.setText("hi!");
    }
}
