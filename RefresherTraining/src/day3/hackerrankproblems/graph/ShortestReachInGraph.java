package day3.hackerrankproblems.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ShortestReachInGraph {
	static void bfs(int n, ArrayList<ArrayList<Integer>> graph, int start) {
		int[] dist = new int[n + 1];
		Arrays.fill(dist, -1);

		Queue<Integer> q = new LinkedList<>();
		q.offer(start);
		dist[start] = 0;

		while (!q.isEmpty()) {
			int curr = q.poll();

			for (int next : graph.get(curr)) {
				if (dist[next] == -1) {
					dist[next] = dist[curr] + 6;
					q.offer(next);
				}
			}
		}

		for (int i = 1; i <= n; i++) {
			if (i != start) {
				System.out.print(dist[i] + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int q = sc.nextInt();

		while (q-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

			for (int i = 0; i <= n; i++) {
				graph.add(new ArrayList<>());
			}

			for (int i = 0; i < m; i++) {
				int u = sc.nextInt();
				int v = sc.nextInt();

				graph.get(u).add(v);
				graph.get(v).add(u);
			}
			int start = sc.nextInt();

			// BFS
			bfs(n, graph, start);
		}
		sc.close();
	}
}
