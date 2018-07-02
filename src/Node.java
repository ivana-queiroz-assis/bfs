import java.util.LinkedList;

public class Node {

	public LinkedList<Integer> adj; // Lista de adjacencias
	public boolean visited; // Valor booleano que indica se foi visitao numa pesquisa
	public int distance; // Distancia do no origem da pesquisa

	public Node() {
		adj = new LinkedList<Integer>();
		visited = false;
		distance = -1;
	}

}
