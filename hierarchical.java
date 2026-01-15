
class Base {
    public void base() {
        System.out.println("You are in the Base Class");
    }
}


class Derived_1 extends Base {
    public void derived_1() {
        System.out.println("You are in Derived 1");
    }
}


class Derived_2 extends Base {
    public void derived_2() {
        System.out.println("You are in Derived 2");
    }
}

class Derived_3 extends Base {
    public void derived_3() {
        System.out.println("You are in Derived 3");
    }
}


public class hierarchical {
    public static void main(String args[]) {

        Derived_1 s1 = new Derived_1();
        s1.base();
        s1.derived_1();

        Derived_2 s2 = new Derived_2();
        s2.base();
        s2.derived_2();

        Derived_3 s3 = new Derived_3();
        s3.base();
        s3.derived_3();
    }
}
