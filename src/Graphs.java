public class Graphs {
    static Graph<String> makeGraph(){
        Graph<String> graph = new AdjacencyGraph<>();
        
        graph.add("A");
        graph.add("B");
        graph.add("C");
        graph.add("D");
        graph.add("E");
        graph.add("F");
        graph.add("G");
        graph.add("H");
        graph.add("I");
        graph.add("J");
        graph.add("K");

        graph.connectUndirected("A", "B");
        graph.connectUndirected("A", "C");
        graph.connectUndirected("B", "E");
        graph.connectUndirected("C", "D");
        graph.connectUndirected("C", "E");
        graph.connectUndirected("C", "H");
        graph.connectUndirected("D", "B");
        graph.connectUndirected("D", "F");
        graph.connectUndirected("E", "F");
        graph.connectUndirected("F", "G");
        graph.connectUndirected("I", "K");
        graph.connectUndirected("J", "I");
        graph.connectUndirected("J", "K");

        return graph;
    }
    
}
