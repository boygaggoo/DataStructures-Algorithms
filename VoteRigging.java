import java.util.Collections;
import java.util.PriorityQueue;

public class VoteRigging {
	public int minimumVotes(int[] votes) {
		int sumAdded = 0;
		if(votes.length==1) return sumAdded;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
			for (int i = 1; i < votes.length; i++) {
				pq.offer(votes[i]);
			}
		while (votes[0] <= pq.peek()) {
				votes[0]++;
				int reduce = pq.remove();
				reduce--;
				pq.offer(reduce);
				sumAdded++;
			}
		return sumAdded;
	}
}