package hard;

import java.util.Queue;

public class LoadBalancer {
//  public static void main(String[] args) {
//
//    int m = Integer.parseInt(args[0]);
//    int length = Integer.parseInt(args[1]);
//    int addStr = Integer.parseInt(args[2]);
//
//    // Create server queues.
//    RandomQueue<Queue<Integer>> servers = new RandomQueue<Queue<Integer>>();
//
//    for (int i = 0; i < m; i++) {
//      servers.enqueue(new Queue<Integer>());
//    }
//
//    // Assign an item to a server
//    for (int j = 0; j < length; j++) {
//
//      // Pick a random server, update if new min.
//      Queue<Integer> min = servers.sample();
//      for (int k = 1; k < addStr; k++) {
//        Queue<Integer> queue = servers.sample();
//        if (queue.length() < min.length()) min = queue;
//      }
//
//      // min is the shortest server queue
//      min.enqueue(j);
//    }
//
//    int i = 0;
//    double[] lengths = new double[m];
//    for (Queue<Integer> queue : servers) {
//      lengths[i++] = queue.length();
//      StdDraw.setYscale(0, 2.0*length/m);
//      StdStats.plotBars(lengths);
//    }
//  }
}
