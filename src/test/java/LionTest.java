import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class LionTest {
    Feline feline = new Feline();
    @Test
    public void getKittensMock()throws Exception{
        Feline mockFeline = mock(Feline.class);
        int result = 7;
        Mockito.when(mockFeline.getKittens()).thenReturn(7);
        Lion lion = new Lion("Самец", mockFeline);
        assertEquals(result, lion.getKittens());
    }
    @Test
    public void getFoodFithMock()throws Exception{
        Feline mockFeline = mock(Feline.class);
        List<String> result = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(mockFeline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion("Самка", mockFeline);
        assertEquals(result, lion.getFood());
    }
    @Test(expected = Exception.class)
    public void UnMale() throws Exception {
        Lion lion = new Lion("DDD", feline);
    }
    @Test
    public void LionExpectionMessengTest() {
        try {
            new Lion("Dog", feline);
        }
        catch (Exception exception){
            assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage() );
        }
        }
    }