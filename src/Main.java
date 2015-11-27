import java.util.HashMap;
import java.util.Map;

/**
 * Created by junky on 11/27/15.
 */
public class Main {


    public static void main(String[] args){
        Map<Integer,String> graph = new HashMap<>();

        graph.put(1,"b");
        graph.put(2,":");
        graph.put(3,"=");
        graph.put(4,"0");
        graph.put(5,";");
        graph.put(6,"for ");
        graph.put(7,"n");
        graph.put(8,":");
        graph.put(9,"=");
        graph.put(10,"n ");
        graph.put(11,"downto ");
        graph.put(12,"0 ");
        graph.put(13,"do ");
        graph.put(14,"b");
        graph.put(15,":");
        graph.put(16,"=");
        graph.put(17,"b");
        graph.put(18,"+");
        graph.put(19,"a");
        graph.put(20,"[");
        graph.put(21,"n");
        graph.put(22,"]");
        graph.put(23,"end");

        Graph.buildgraph(graph,1);
    }
}
