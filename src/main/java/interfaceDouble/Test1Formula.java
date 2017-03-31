package interfaceDouble;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by dwy on 2015/10/26.
 */
public class Test1Formula implements Test1FormulaInterface, Test2FormulaInterface, Test3FormulaInterface {


    @Override
    public double calculate(int a) {
        return sqrt(a * 100);
    }


    public static void main(String[] args) {
        Test1Formula formula = new Test1Formula();
        System.out.println("args = [" + formula.calculate(1000) + "]");
        System.out.println("args = [" + formula.sqrt(16) + "]");
        System.out.println("args = [" + formula.abs(-11) + "]");

        ConcurrentHashMap map = new ConcurrentHashMap();
    }
}
