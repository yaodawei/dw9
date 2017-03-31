package interfaceDouble;

/**
 * Created by dwy on 2015/10/26.
 */
@FunctionalInterface
public interface Test1FormulaInterface {

    double calculate(int a);
    default double sqrt(int a) {

        return a;
    }


    public static void main(String[] args) {
        Test1FormulaInterface formula = new Test1FormulaInterface() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };
        System.out.println("args = [" + formula.calculate(100) + "]");
        System.out.println("args = [" + formula.sqrt(16) + "]");
    }

}
