package FunctionalInterface;


/**
 * Created by dwy on 2015/10/28.
 */
public class TestSomethingLambda {
    public static void main(String[] args) {
        Something s = (Integer i, int e) -> i + e;
        Something s1 = (Integer i, int e) -> {
            int k = 1;
            return k + i + e;
        };
        System.out.println("s  " + s.doit(4, 5));
        System.out.println("s1  " + s1.doit(6, 7));

        Something s3 = (k,g) -> calculateTest(k);
        System.out.println("s3  " + s3.doit(9,1));
        System.out.println("s3  " + s3.doit(11,1));


        Something s4 = (k,t) -> calculateTest2(t);
        System.out.println("s4  " + s4.doit(1,999));
//        System.out.println("s4  " + s4.doit(1,100000));
        System.out.println("s4  " + s4.doit(1,888));

       /* try {
            Something s5 = (k,t) -> calculateTest3(t);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        Something s6 = Something::doits;
//        FileFilter java = (File f) -> f.getName().endsWith("*.java");
    }

    public static Integer calculateTest(int k) {
       if (k < 10) {
           return -1;
       } else if ( k<100){
           return 0;
       } else {
           return 1;
       }
    }

    public static int calculateTest2(int g)  {
        if (g > 1000) {
             int i  = 1/0;
        }
        return g;
    }

    public static int calculateTest3(int g) throws Exception {
        if (g > 1000) {
           throw new Exception("G有点大");
        }
        return g;
    }

}
