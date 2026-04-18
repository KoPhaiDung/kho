import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SystemActing {
    private static Queue<Costumer> customerQueue = new LinkedList<>();
    private static Stack<Message> messageStack = new Stack<>();

    public static void addCostumer(Costumer customer) {
        customerQueue.offer(customer); // Thêm vào cuối hàng đợi
        System.out.println("Khách hàng '" + customer.getName() + "' đã được thêm vào hàng đợi.");
    }
    public static void processNextCostumer() {
        if (customerQueue.isEmpty()) {
            System.out.println("⚠️ [Thông báo] Không còn khách đợi.");
            return;
        }
        Costumer customer = customerQueue.poll();
        System.out.println("\n👨‍💻 [Xử lý] Đang hỗ trợ khách hàng: " + customer.getName());
        System.out.println("   -> Nội dung yêu cầu: " + customer.getTicket().getContent());
        messageStack.clear();
    }
    public static void typeMessage(Message message) {
        messageStack.push(message); // Đưa tin nhắn vào đỉnh Stack
        System.out.println("[Newchat] " + message.getContent());
    }
    public static void viewLastMessage() {
        if (messageStack.isEmpty()) {
            System.out.println("[watch] Lịch sử chat trống.");
        } else {
            Message lastMsg = messageStack.peek(); // Xem đỉnh Stack
            System.out.println("[watch] " + lastMsg.getContent());
        }
    }
    public static void undoMessage() {
        if (messageStack.isEmpty()) {
            System.out.println("[undo] Không có tin nhắn nào để hoàn tác.");
        } else {
            Message removedMsg = messageStack.pop(); // Lấy và xóa khỏi đỉnh Stack
            System.out.println("[undo] Đã thu hồi tin nhắn: \"" + removedMsg.getContent() + "\"");
        }
    }

}

