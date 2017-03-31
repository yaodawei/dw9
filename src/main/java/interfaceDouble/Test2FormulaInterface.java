package interfaceDouble;

/**
 * Created by dwy on 2015/10/26.
 */
@FunctionalInterface
public interface Test2FormulaInterface {
    double calculate(int a);
    default double sqrt(int a) {
        return a +1;
    }

    default double abs(int a) {
        return Math.abs(a);
    }
}
