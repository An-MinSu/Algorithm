import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		
		while(N-->0) {
			int value = Integer.parseInt(br.readLine());
			
			if(maxHeap.size() == minHeap.size()) {
				maxHeap.offer(value);
			}
			else
				minHeap.offer(value);
			
			if(!maxHeap.isEmpty() && !minHeap.isEmpty()) {
				if(maxHeap.peek()>minHeap.peek()) {
					int temp = maxHeap.poll();
					maxHeap.offer(minHeap.poll());
					minHeap.offer(temp);
				}
			}
			sb.append(maxHeap.peek()).append("\n");
		}
		System.out.println(sb);
	}
}