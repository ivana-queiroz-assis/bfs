import java.util.LinkedList;

public class Graph {

	int n; // Numero de nos do grafo
	Node nodes[]; // Array para conter os nos

	Graph(int n) {
		this.n = n;
		nodes = new Node[n + 1]; // +1 se os comecam em 1 ao inves de 0
		for (int i = 1; i <= n; i++)
			nodes[i] = new Node();
	}

	public void addLink(int a, int b) {
		nodes[a].adj.add(b);
		nodes[b].adj.add(a);
	}

	// Algoritmo de pesquisa em largura
	public void bfs(int v) {
		LinkedList<Integer> q = new LinkedList<Integer>();

		q.add(v);
		nodes[v].visited = true;
		nodes[v].distance = 0;

		while (q.size() > 0) {
			int u = q.removeFirst();
			System.out.println(u + " [dist=" + nodes[u].distance + "]");
			for (int w : nodes[u].adj)
				if (!nodes[w].visited) {
					q.add(w);
					nodes[w].visited = true;
					nodes[w].distance = nodes[u].distance + 1;
				}
		}
	}

}
