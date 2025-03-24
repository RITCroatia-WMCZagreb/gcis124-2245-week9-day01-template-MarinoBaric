/*
@ASSESSME.USERID: mb8561
@ASSESSME.AUTHOR: Marino Bric
@ASSESSME.DESCRIPTION: WEEK 9 DAY 01
@ASSESSME.ANALYZE: YES
*/

import java.util.HashSet;
import java.util.Set;

public class Vertex<E> {
    private E vlaue;
    private Set<Vertex<E>> neighbors = null;

    public Vertex(E value){
        this.vlaue = value;
        this.neighbors = new HashSet<>();
    }

    public E getValue(){
        return this.vlaue;
    }

    public void connect(Vertex<E> neighbour){
        this.neighbors.add(neighbour);
    }

    public boolean connected(Vertex<E> neighbor){
        return this.neighbors.contains(neighbor);
    }

    public Set<Vertex<E>> getNeighbors(){
        return this.neighbors;
    }

    public static void main(String[] args) {
        Vertex<String> vA = new Vertex<String>("A");
        Vertex<String> vB = new Vertex<String>("B");
        Vertex<String> vC = new Vertex<String>("C");

        vA.connect(vB);
        vA.connect(vC);
        vB.connect(vC);
        vC.connect(vB);
        vC.connect(vA);
    }
}
