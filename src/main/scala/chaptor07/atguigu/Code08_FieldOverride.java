package chaptor07.atguigu;

public class Code08_FieldOverride {
    public static void main(String[] args) {

        Sub sub1 = new Sub();
        System.out.println(sub1.s);  //sub

        Super super_sub1 = new Sub();
        System.out.println(super_sub1.s);  //super

        /**
         * 成员变量不能像方法一样被重写。当一个子类定义了一个跟父类同名字段，
         * 子类就是定义了一个新的字段。这个字段在父类中被隐藏的，是不可重写的。
         */

        //访问隐藏字段方式
        Super sub2 = new Sub();
        System.out.println(sub2.s);

        System.out.println(((Super) sub1).s);

    }
}

//父类
class Super {
    String s = "super";
}

//子类
class Sub extends Super {
    String s = "sub";
}