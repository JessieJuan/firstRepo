package chapter1.lsj;

public class FinalClass {
    int numb = 3;
    public void doit(){
    }
    public static void main(String args[]){
        FinalClass finalObj = new FinalClass();
        finalObj.numb++;
        System.out.println("numb = "+ finalObj.numb);
    }
}
