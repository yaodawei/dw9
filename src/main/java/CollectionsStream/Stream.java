package CollectionsStream;

/**
 * Created by dwy on 2015/11/13.
 */
public class Stream {
    /*

No storage. Streams don't have storage for values; they carry values from a source (which could be a data structure,
       a generating function, an I/O channel, etc) through a pipeline of computational steps.

Functional in nature. Operations on a stream produce a result, but do not modify its underlying data source.

Laziness-seeking. Many stream operations, such as filtering, mapping, sorting, or duplicate removal)
      can be implemented lazily. This facilitates efficient single-pass execution of entire pipelines,
       as well as facilitating efficient implementation of short-circuiting operations.

Bounds optional. There are many problems that are sensible to express as infinite streams,
     letting clients consume values until they are satisfied. (If we were enumerating perfect numbers,
      it is easy to express this as a filtering operation on the stream of all integers.)
      While a Collection is constrained to be finite, a stream is not. (To terminate in finite time,
      a stream pipeline with an infinite source can use short-circuiting operations; alternately,
      you can request an Iterator from a Stream and traverse it manually.)
   */

   /*
   java.util.stream
   流和集合（Streams vs Collections）
   并行（Parallelism）
惰性（Laziness）
收集器（Collectors）
    */
}
