package chaptor08;

public class Code09_InnerClassTest {
    public static void main(String[] args) {

        //创建静态内部类对象
        OuterClass.StaticInnerClass in1 = new OuterClass.StaticInnerClass();
        OuterClass.StaticInnerClass in2 = new OuterClass.StaticInnerClass();

        //创建成员内部类对象
        OuterClass out1 = new OuterClass();
        OuterClass out2 = new OuterClass();
        OuterClass.InnerClass inner1 = out1.new InnerClass();
        OuterClass.InnerClass inner2 = out2.new InnerClass();

        //下面的方法调用说明在java中，内部类对象只和类型相关，也就是说,只要是
        //OuterClass.InnerClass 类型的对象就可以传给形参 InnerClass ic
        inner1.test(inner2);
        inner1.test(inner1);

        inner2.test(inner1);
        inner2.test(inner2);
    }
}

class OuterClass {

    //成员内部类
    class InnerClass {
        public void test(InnerClass ic) {
            System.out.println(ic);
        }
    }

    //静态内部类
    static class StaticInnerClass {
    }
}
