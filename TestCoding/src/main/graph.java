package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class graph {

	public static class Edge {
		int src;
		int dest;

		Edge(int s, int d) {
			this.dest = d;
			this.src = s;
		}
	}

	public static void createGraph(ArrayList<Edge> graph[], int n) {

		for (int i = 0; i < n; i++) {
			graph[i] = new ArrayList<>();
		}
		graph[0].add(new Edge(0, 1));
		graph[0].add(new Edge(0, 2));
		graph[1].add(new Edge(1, 0));
		graph[1].add(new Edge(1, 3));
		graph[2].add(new Edge(2, 0));
		graph[2].add(new Edge(2, 1));
		graph[2].add(new Edge(2, 3));
		graph[3].add(new Edge(3, 1));
		graph[3].add(new Edge(3, 2));

	}

	public static void bfs(ArrayList<Edge> graph[], int V) {
		boolean[] visited = new boolean[V];
		Arrays.fill(visited, false);

		Queue<Integer> q = new LinkedList<>();
		q.add(0);

		while (!q.isEmpty()) {
			int curr = q.poll();
			if (visited[curr] == false) {
				visited[curr] = true;
				System.out.print(curr + " ");

				for (int i = 0; i < graph[curr].size(); i++) {
					Edge e = graph[curr].get(i);
					q.add(e.dest);
				}
			}
		}
	}

	public static void dfs(ArrayList<Edge> graph[], int n, boolean[] vis, int index) {

		if (vis[index] == true) {
			return;
		}

		vis[index] = true;
		System.out.print(index + " ");

		for (int i = 0; i < graph[index].size(); i++) {

			Edge e = graph[index].get(i);
			dfs(graph, n, vis, e.dest);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V = 7;
		ArrayList<Edge> graph[] = new ArrayList[V];
		boolean[] vis = new boolean[V];
		int n = 7;
		createGraph(graph, n);
		System.out.println("BFS Output");
		bfs(graph, V);
		System.out.println("\nDFS Output");
		dfs(graph, V, vis, 0);

	}

}
