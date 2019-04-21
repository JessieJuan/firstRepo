package chapter1.lsj;

// Person 我们给它叫Bean类
// final类不能被继承。
public final class FinalClass {
    final int numb = 3;
    private String field1;
    String field2;
    // 这是一个getter 用来得到private的变量的值。
    public String getField1() {
        return field1;
    }

    //这是一个setter，用来修改private变量的值。
    public void setField1(String value) {
        this.field1 = value;
    }

    public int getNumb() {
        return numb;
    }

    // final方法不能被子类override
    public final void doit(){
    }
    public static void main(String args[]){
        final FinalClass finalObj = new FinalClass();
        // final variable canno be assigned a new value;
        //        finalObj.numb++;
        System.out.println("numb = "+ finalObj.numb);
        // final 既可以修饰基本变量也可以修饰引用变量
        // final variable canno be assigned a new value;
//        finalObj = new FinalClass();
    }
}
