package chapter1.lsj3;

public class MainThread {
    public static void main(String[] args){
        System.out.println("main 主方法开始运行");
        Thread currentThread = Thread.currentThread();
        System.out.println("成功获取当前线程对象");
        String name = currentThread.getName();
        System.out.println("当前线程的名称是：" + name);
    }
}
