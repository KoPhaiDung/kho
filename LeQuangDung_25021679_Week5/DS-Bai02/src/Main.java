import java.util.*;

public class Main {
    static void main() {
        Ticket ticketA = new Ticket("101", "Sản phẩm bị lỗi đóng gói", System.currentTimeMillis());
        Costumer costumerA = new Costumer("1", "Khách A", ticketA);
        SystemActing.addCostumer(costumerA);
        Ticket ticketB = new Ticket("102", "Hỏi về thời gian giao hàng", System.currentTimeMillis());
        Costumer costumerB = new Costumer("2", "Khách B", ticketB);
        SystemActing.addCostumer(costumerB);
        SystemActing.processNextCostumer();
        SystemActing.typeMessage(new Message(1, "Dạ em chào anh/chị ạ."));
        SystemActing.typeMessage(new Message(2, "Anh/chị vui lòng cung cấp mã đơn hàng để em kiểm tra nhé."));
        SystemActing.typeMessage(new Message(3, "À khoan, em nhầm khách."));
        SystemActing.viewLastMessage();
        SystemActing.undoMessage();
        SystemActing.processNextCostumer();
        SystemActing.typeMessage(new Message(4, "Chào bạn, đơn hàng của bạn dự kiến giao vào ngày mai nhé."));
        System.out.println();
        SystemActing.processNextCostumer();
    }
}