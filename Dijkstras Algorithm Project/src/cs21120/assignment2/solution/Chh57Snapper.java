package cs21120.assignment2.solution;

import java.awt.Point;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import cs21120.assignment2.FloatImage;
import cs21120.assignment2.ISnapper;

public class Chh57Snapper implements ISnapper {
	BlockingQueue<Edge> edges = new PriorityBlockingQueue<Edge>();
	// The below boolean will be of the same size as the pixels in the image
	boolean[] visited;
	Point[] map;

	public LinkedList<Point> getPath(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setSeed(int arg0, int arg1, FloatImage[] arg2) {
		// TODO Auto-generated method stub

	}

	private class Edge implements Comparable<Edge> {

		String type = ""; // can be start point, end point or weight

		public int compareTo(Edge otherEdge) {
			// TODO Auto-generated method stub
			return 0;
		}

	}

}
