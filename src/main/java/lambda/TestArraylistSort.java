package lambda;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by dwy on 2015/10/26.
 */
public class TestArraylistSort {
    static List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

    public static void main(String[] args) {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });
        for (String s : names) {
            System.out.println("args0 = [" + s + "]");
        }
        Collections.sort(names, (a, b) -> -b.compareTo(a));
        for (String s : names) {
            System.out.println("args3 = [" + s + "]");
        }

        Comparator<String> c =(lhs, rhs) ->{
            System.out.println("I am comparing " +lhs + " to " + rhs);
            return lhs.compareTo(rhs);
        };
        int result = c.compare("Hello", "World");
        System.out.println(result);


    }

    public static String testString() {
        return "";
    }
    public static void testList(String s) {
        List<TestBigdecimal> list = new ArrayList<>();
        TestBigdecimal t1 = new TestBigdecimal();
        t1.setAftertax1(new BigDecimal(11.22));
        t1.setBefertax1(new BigDecimal(10.02));
        TestBigdecimal t2 = new TestBigdecimal();
        t2.setAftertax1(new BigDecimal(13.22));
        t2.setBefertax1(new BigDecimal(11.02));
        TestBigdecimal t3 = new TestBigdecimal();
        t3.setAftertax1(new BigDecimal(15.22));
        t3.setBefertax1(new BigDecimal(13.02));
        list.add(t1);
        list.add(t2);
        list.add(t3);
        Collections.sort(list,(c,d) ->  c.getAftertax1().subtract(d.getAftertax1()).intValue());
        for (TestBigdecimal t:list) {
            System.out.println("args = [" + t.getAftertax1() + "]");
        }
        Collections.sort(list,(c,d) -> 1);
        list.forEach(a -> a.setAftertax1(new BigDecimal(22)) );

     /*   Collections.sort(list, new Comparator<TestBigdecimal>() {
            @Override
            public int compare(TestBigdecimal o1, TestBigdecimal o2) {
                return new CompareToBuilder()
            }
        });*/



    }

    public static class TestBigdecimal extends TestArraylistSort {
        private BigDecimal aftertax1;
        private BigDecimal befertax1;

        public BigDecimal getAftertax1() {
            return aftertax1;
        }

        public void setAftertax1(BigDecimal aftertax1) {
            this.aftertax1 = aftertax1;
        }

        public BigDecimal getBefertax1() {
            return befertax1;
        }

        public void setBefertax1(BigDecimal befertax1) {
            this.befertax1 = befertax1;
        }


    }
}
