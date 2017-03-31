package FunctionalInterface;

/**
 * Created by dwy on 2015/10/26.
 */
@java.lang.FunctionalInterface
public interface FunctionalInterface<F, T> {
 /*   The interface ActionListener, used above, has just one method.
    Many common callback interfaces have this property,
    such as Runnable and Comparator. We'll give all interfaces that have just one method a name: functional interfaces.
    (These were previously called SAM Types, which stood for "Single Abstract Method".)*/

// nominal types

    T convert(F f);

    public static void main(String[] args) {
        FunctionalInterface<String, Integer> converter = (f) -> Integer.valueOf(f);
        Integer converted = converter.convert("123");
        System.out.println(converted);

        FunctionalInterface<String, Integer> converter1 = Integer::valueOf;
        Integer converted1 = converter1.convert("12356");
        System.out.println(converted1);

        /* java.lang.Runnable w;

           java.util.concurrent.Callable e;

           java.security.PrivilegedAction r;

           java.util.Comparator t;

           java.io.FileFilter y;

           java.beans.PropertyChangeListener u;

           BiFunction a;*/

      /*  Predicate<T> -- a boolean-valued property of an object
        Consumer<T> -- an action to be performed on an object
        Function<T,R> -- a function transforming a T to a R
        Supplier<T> -- provide an instance of a T (such as a factory)
        UnaryOperator<T> -- a function from T to T
        BinaryOperator<T> -- a function from (T, T) to T*/
    }
}
