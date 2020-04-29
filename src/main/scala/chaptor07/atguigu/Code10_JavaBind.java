package chaptor07.atguigu;

//java中的动态绑定机制
public class Code10_JavaBind {
    public static void main(String[] args) {

        A a = new B();
        System.out.println(a.i);
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }
}

class A {
    public int i = 10;

    public int getI() {
        return i;
    }

    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }
}

class B extends A {
    public int i = 20;

    public int getI() {
        return i;
    }

    public int sum() {
        return i + 20;
    }

    public int sum1() {
        return i + 10;
    }
}