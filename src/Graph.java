/*
@ASSESSME.USERID: mb8561
@ASSESSME.AUTHOR: Marino Bric
@ASSESSME.DESCRIPTION: WEEK 9 DAY 01
@ASSESSME.ANALYZE: YES
*/

public interface Graph<E> {
    void add(E vlaue);
    boolean contains(E value);
    int size();
    void connectDirected(E a, E b);
    void connectUndirected(E a, E b);
    boolean connected(E a, E b);
    
} 
