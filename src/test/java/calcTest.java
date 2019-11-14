
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class calcTest {

        @Test
        public void testAdd() {
            Calculator calculator = new Calculator();

          Assertions.assertEquals(3, calculator.add(1, 2));
        }

    }

