package chaptor07.atguigu;

//访问隐藏字段
public class Code09_Test {
    public static void main(String[] args) {

        //本态引用
        //chaptor07.atguigu.MM@6e0be858
        //20
        MM m = new MM();
        System.out.println(m);
        System.out.println(m.i);


        //多态引用
        //chaptor07.atguigu.MM@61bbe9ba
        //10
        HH h = new MM();
        System.out.println(h);
        System.out.println(h.i);


        //chaptor07.atguigu.MM@6e0be858
        //10
        HH h1 = (HH) m;
        System.out.println(h1);
        System.out.println(h1.i);
    }
}

class HH {
    int i = 10;
}

class MM extends HH {
    int i = 20;
}