import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String S = br.readLine();
            String[] command = S.split(" ");

            if (command[0].equals("push")) {
                int k = Integer.parseInt(command[1]);
                q.offer(k);
            } else if (command[0].equals("pop")) {
                if (q.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(q.poll()).append("\n");
                }
            } else if (command[0].equals("size")) {
                sb.append(q.size()).append("\n");
            } else if (command[0].equals("empty")) {
                if (q.isEmpty()) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            } else if (command[0].equals("front")) {
                if (q.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(q.peek()).append("\n");
                }
            } else if (command[0].equals("back")) {
                if (q.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    int last = ((LinkedList<Integer>) q).getLast();
                    sb.append(last).append("\n");
                }
            }
        }
        System.out.print(sb.toString());
    }
}
