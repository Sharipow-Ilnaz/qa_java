import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class CatTest {
    Feline feline;
    Cat cat = new Cat(feline);

    @Test
    public void getSoundMew(){
        String sound = "Мяу";
        assertEquals(sound, cat.getSound());
    }
    @Test
    public void getFoodFithMock()throws Exception{
       Feline mockFeline = mock(Feline.class);
        List<String>result = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(mockFeline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Cat cat1 = new Cat(mockFeline);
        assertEquals(result, cat1.getFood());
    }
}
