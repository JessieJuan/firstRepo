package chapter1.lsj2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DemoFrame extends JFrame {
    public static void main(String args[]){
        EventQueue.invokeLater(new Runnable(){
            public void run(){
                try{
                    DemoFrame frame = new DemoFrame();
                    frame.setVisible(true);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
    public DemoFrame(){
        super();
        setBounds(100,100,214,140);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JLabel label = new JLabel();
        label.setText("一个JFrame窗体实例");
        getContentPane().add(label,BorderLayout.CENTER);
    }
}
