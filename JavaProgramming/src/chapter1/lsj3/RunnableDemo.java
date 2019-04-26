package chapter1.lsj3;

public class RunnableDemo extends JFrame implements Runnable{
    private JTextArea textArea;
    private String introduction = " 现在大家已经对计算机很熟悉了，如今计算机的操作"+ "系统可以同时执行多个任务，在听歌的同时能够打字/下载文件，在聊天窗口打"+"的，Java语言使用多线程实现一个程序中的多个任务同时运行。程序员可以在程"+"序中执行多个线程，每一个线程完成一个功能，并与其他线程并发执行，这种机"+"制被称为多线程。";
    public static void main(String args[]){
        RunnableDemo frame = new RunnableDemo();
        frame.setVisible(true);
        Thread thread = new Thread(frame);
        thread.start();
    }
    public RunnableDemo(){
        super();
        setBounds(100,100,383,225);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JLabel label = new JLabel("多线程简介：");
        getContentPane().add(label,BorderLayout.NORTH);
        textArea = new JTextArea("\t");
        textArea.setBorder(new BevelBorder(BevelBorder.LOWERED));
        textArea.setLineWrap(true);
        getContentPane().add(textArea,BorderLayout.CENTER);
    }

    public String getIntroduction() {
        public void run(){
            String[]intros = introduction.split("");
            for(String ch:intros){
                textArea.append(ch);
                try{
                    Thread.sleep(100);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
