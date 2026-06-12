import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertSame;

class LoggerTest {

    @Test
    void test() {
        Logger l1=Logger.returnsomething();
        Logger l2=Logger.returnsomething();
        assertSame(l1,l2);

    }

}
