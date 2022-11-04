import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void catShouldEatOnlyMeat() throws Exception{

        Cat cat = new Cat(feline);
        List <String> listPredator = List.of("Животные, Птицы, Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(listPredator);
        List<String> actual = cat.getFood();
        assertEquals(listPredator, actual);
    }

    @Test
    public void catSoundPositive() {

        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }
}