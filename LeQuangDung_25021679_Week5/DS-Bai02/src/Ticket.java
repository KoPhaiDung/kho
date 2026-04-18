import java.sql.Timestamp;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

public class Ticket {
    private String id;
    private String content;
    private long time;
    public Ticket(String id, String content, long time) {
        this.id = id;
        this.content = content;
        this.time = time;
    }

    public String getContent() {
        return content;
    }
}
