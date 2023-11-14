package q10866;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        Deque<Integer> realDeque = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());





        for (int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");
            int m = 0;
            switch (command[0]) {
                case "push_front":
                    m = Integer.parseInt(command[1]);
                    realDeque.offerFirst(m);
                    break;

                case "push_back":
                    m = Integer.parseInt(command[1]);
                    realDeque.offerLast(m);
                    break;

                case "pop_front":
                    if (!realDeque.isEmpty()) {
                        System.out.println(realDeque.pollFirst());
                    } else {
                        System.out.println(-1);
                    }
                    break;

                case "pop_back":
                    if (!realDeque.isEmpty()) {
                        System.out.println(realDeque.pollLast());
                    } else {
                        System.out.println(-1);
                    }
                    break;

                case "size":
                    System.out.println(realDeque.size());
                    break;

                case "empty":
                    if (realDeque.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "front":
                    if (realDeque.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(realDeque.getFirst());
                    }
                    break;
                case "back":
                    if (realDeque.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(realDeque.getLast());
                    }
                    break;
            }
        }
    }
}

