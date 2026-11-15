import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;
    @RunWith(Parameterized.class)
    public class HaveManeParamTest {
        private final String male;
        private final boolean expected;
        public HaveManeParamTest(String male, boolean expected) {
            this.male = male;
            this.expected = expected;
        }

        @Parameterized.Parameters
        public static Object[][] getMane() {
            return new Object[][]{
                    {"Самец", true},
                    {"Самка", false}
            };
        }

        @Test
        public void getManeFithObject() throws Exception{
            Feline feline = new Feline();
            Lion lion = new Lion(male, feline);
            assertEquals(expected, lion.doesHaveMane());
        }
    }
