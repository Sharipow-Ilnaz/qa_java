import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

/* Мне очень не хочется удалять этот тест, я не очень понял тему параметризации, но пока писал этот тест наконец всё понял)))
@RunWith(Parameterized.class)
public class GetKittensTest {
    private final int count;
    private final int expected;
    Feline feline = new Feline();
    public GetKittensTest(int count, int expected) {
        this.count = count;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getKittens() {
        return new Object[][]{
                {3, 3},
                {7, 7}
        };
    }

    @Test
    public void getKittensReturnObject() {
        assertEquals(expected, feline.getKittens(count));
    }
}
*/
