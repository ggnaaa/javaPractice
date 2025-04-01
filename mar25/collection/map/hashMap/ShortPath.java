package mar25.collection.map.hashMap;
//Find the shortest path in an unweighted graph using BFS (use a HashMap for adjacency list representation).
import java.util.*;

public class ShortPath {
    private Map<Integer, List<Integer>> graph;

    public ShortPath() {
        graph = new HashMap<>();
    }

    public void addEdge(int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u); // Since it's an undirected graph
    }

    public List<Integer> shortestPath(int start, int end) {
        Map<Integer, Integer> parent = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);
        parent.put(start, null);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (node == end) break;

            for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                    parent.put(neighbor, node);
                }
            }
        }

        // Reconstruct the path
        List<Integer> path = new ArrayList<>();
        for (Integer at = end; at != null; at = parent.get(at)) {
            path.add(at);
        }

        Collections.reverse(path);
        return path.get(0) == start ? path : Collections.emptyList(); // Return empty if no path
    }

    public static void main(String[] args) {
        ShortPath graph = new ShortPath();
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 6);
        graph.addEdge(5, 6);

        System.out.println("Shortest path from 1 to 6: " + graph.shortestPath(1, 6));
    }
}
