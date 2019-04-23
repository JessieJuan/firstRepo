package chapter1.lsj2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DemoFrame extends JFrame {
    public static void main(String args[]){
        EventQueue.invokeLater(new Runnable(){
            // 在事件队列中创建窗体
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
        // 设置窗体的大小位置
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗体的默认关闭方式
        final JLabel label = new JLabel();
        //创建JL标签组建
        label.setText("一个JFrame窗体实例");
        // 设置标签文本
        getContentPane().add(label,BorderLayout.CENTER);
        // 添加标签组件到窗体容器
    }
}
