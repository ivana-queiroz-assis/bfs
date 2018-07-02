import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Graph g = new Graph(in.nextInt());
		int e = in.nextInt();
		for (int i = 0; i < e; i++)
			g.addLink(in.nextInt(), in.nextInt());

		// Pesquisa em largura a partir do no 1
		g.bfs(1);

	}

}
