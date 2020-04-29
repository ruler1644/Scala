package chaptor01;

/**
 * @Auther wu
 * @Date 2019/8/5  19:25
 */

//使用java模拟scala实现
public class Code03_Hello2 {
    public static void main(String[] paramArrayOfString) {
        Hello2$.MODULE$.main(paramArrayOfString);
    }
}

final class Hello2$ {
    public static final Hello2$ MODULE$; //静态变量

    static {
        MODULE$ = new Hello2$();
    }

    public void main(String[] args) {
        System.out.println("hello, scala world！");
    }

//  private Hello$() { //构造器，完成了一个初始化  MODULE$
//    MODULE$ = this;
//  }
}