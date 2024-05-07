package generic;
/**
 * Generic version of the Box class.
 * @param <T> the type of the value being boxed
 */
public class Box<T> {
    //T == Type

    private T t;

    public T getObject() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}
