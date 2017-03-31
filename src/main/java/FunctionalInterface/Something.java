package FunctionalInterface;

import java.lang.*;

/**
 * Created by dwy on 2015/10/28.
 */
@java.lang.FunctionalInterface
public interface Something {
   int doit(Integer i, int w);
//    int doit(Integer i, int w) throws Exception;

   static int doits(Integer i, int w){
       return 1;
   };
}
