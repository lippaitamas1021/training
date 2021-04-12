package clone.issuetracker;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Issue {

    private String name;
    private LocalDateTime time;
    private Status status;
    private List<Comment> comments;

    public Issue(String name, LocalDateTime time, Status status, List<Comment> comments) {
        this.name = name;
        this.time = time;
        this.status = status;
        this.comments = new ArrayList<>(comments);
    }

    public Issue(Issue anotherIssue, CopyMode copyMode) {
        name = anotherIssue.name;
        time = anotherIssue.time;
        status = anotherIssue.status;
        comments = anotherIssue.comments;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public Status getStatus() {
        return status;
    }

    public List<Comment> getComments() {
        return comments;
    }
}
