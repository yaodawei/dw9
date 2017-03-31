package interfaceDouble;

/**
 * Created by dwy on 2015/10/26.
 */
@FunctionalInterface
public interface Test3FormulaInterface extends Test1FormulaInterface ,Test2FormulaInterface{

    double calculate(int a);
    default double sqrt(int a) {
        return a +3;
    }

    public static void main(String[] args) {
        Test3FormulaInterface formula = new Test3FormulaInterface() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };
        System.out.println("args = [" + formula.calculate(100) + "]");
        System.out.println("args = [" + formula.sqrt(16) + "]");
        System.out.println("args = [" + formula.abs(-11) + "]");

        Test3FormulaInterface formula2 = (f) -> f;
    }
}
