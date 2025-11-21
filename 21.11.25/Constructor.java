package nov21;

public class Constructor {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo(50);
        System.out.println(d1.x);
        System.out.println(d2.x);
    }
}

class Demo {
    int x;
    Demo() {
        x = 10;
    }
    Demo(int a) {
        x = a;
    }
}
