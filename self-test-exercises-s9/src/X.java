public class X<T extends Number> extends Z {
    public T value;
    public void doThis(T in) {
        value = in;
        System.out.println(value.doubleValue() * data.doubleValue());
        data = new Integer(data.intValue() + in.intValue());
    }
}

