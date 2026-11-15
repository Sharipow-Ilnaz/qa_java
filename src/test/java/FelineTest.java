import com.example.Feline;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.List;

public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void eatMeatPredator() throws Exception {
        List<String> result = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = (feline.eatMeat());
        assertEquals(result, actual);
    }

    @Test
    public void getFamilyReturnCat() {
        String result = "Кошачьи";
        assertEquals(result, feline.getFamily());
    }

    @Test
    public void getKittensReturn1() {
        assertEquals(1, feline.getKittens());
    }
}