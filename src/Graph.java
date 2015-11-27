import java.util.Map;

/**
 * Created by junky on 11/27/15.
 */
public class Graph {

    static void buildgraph(Map graph, int positionstart){

        String current = String.valueOf(graph.get(positionstart));

        if (current == null){
            System.out.println("Invalid start position");
            return;
        }

        String result = "";
        int i = positionstart+1;

        while(!current.equals("end")){
            result += current;
            current = String.valueOf(graph.get(i));
            i++;
            if (current == null){
                System.out.println(" Fatal error ");
                return;
            }
        }
        System.out.println(result);
    }

}
