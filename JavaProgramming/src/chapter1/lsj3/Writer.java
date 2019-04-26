package chapter1.lsj3;

public class Writer extends Thread{
    private String name = "未知";
    public Writer(String name){
        this.name = name;
    }
    public void run(){
        while(true){
            System.out.println(name+":写一段文稿");
            System.out.println(name+":吸一口烟，放松一下。");
            try{
                Thread.sleep((int)(Math.random()*10000));
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args){
        Thread writer1 = new Writer("作者1");
        Thread writer2 = new Writer("\t作者2");
        writer1.start();
        writer2.start();
    }
}
