public class FinalDriver {

    public static void main(String[] args) {
        X<Integer> a = new X<>();
        Y b = new Y();
        Z c = new Z();
        a.doThis(new Integer(4));
        b.seeThis();
        c.printThis();
        a.printThis();
        a.seeThis();
        c.seeThis();
        a.doThis(new Integer(2));
        a.doThis(new Integer(2));
    }
}
