package collectionsqueue.collectionspriorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class JobDispatcher {

    public Queue<Job> addJob(Job... jobs) {
        PriorityQueue<Job> result = new PriorityQueue<>();
        for (Job job : jobs) {
            result.add(job);
        }
        return result;
    }

    public Job dispatchNextJob(Queue<Job> jobs) throws NoJobException {
        if (jobs.isEmpty()) {
            throw new NoJobException("No available job");
        }
        return jobs.poll();
    }
}
