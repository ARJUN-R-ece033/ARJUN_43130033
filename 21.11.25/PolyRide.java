package nov21;

public class PolyRide{
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display();
    }
}

class Parent {
    void display() {
        System.out.println("Parent display");
    }
}
class Child extends Parent {
    void display() {
        System.out.println("Child display");
    }
}
