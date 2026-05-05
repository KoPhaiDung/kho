import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.MathUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtilsTest {
    private static Logger logger = LoggerFactory.getLogger(MathUtilsTest.class);
    @BeforeAll
    static void initAll() {
        logger.info("=== Bắt đầu chạy MathUtilsTest ===");
    }

    @AfterAll
    static void tearDownAll() {logger.info("=== Kết thúc ===");
    }

    @Test
    @DisplayName("Kiểm thử hàm max với EP và BVA")
    void testMax() {
        // EP
        assertEquals(10, MathUtils.max(10, 5), "10 phải lớn hơn 5");
        assertEquals(8, MathUtils.max(3, 8), "8 phải lớn hơn 3");
        assertEquals(7, MathUtils.max(7, 7), "Hai số bằng nhau trả về chính nó");

        // BVA
        assertEquals(Integer.MAX_VALUE, MathUtils.max(Integer.MIN_VALUE, Integer.MAX_VALUE));
        assertEquals(Integer.MAX_VALUE, MathUtils.max(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    @DisplayName("Kiểm thử hàm divide với các trường hợp hợp lệ")
    void testDivide() {
        assertEquals(5, MathUtils.divide(10, 2));
        assertEquals(-5, MathUtils.divide(10, -2));
    }

    @Test
    @DisplayName("Kiểm thử ngoại lệ khi chia cho 0")
    void testDivideByZero() {
        // Sử dụng assertThrows để bắt ngoại lệ mong đợi 
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            MathUtils.divide(10, 0);
        });

        assertEquals("Divider must not be zero", exception.getMessage());
    }
}