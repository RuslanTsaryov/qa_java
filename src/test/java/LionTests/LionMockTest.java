package LionTests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionMockTest {

    Lion lion;
    @Mock
    Feline feline;

    @Test
    public void lionGetKittenTestPositive() throws Exception {

        String sex = "Самец";
        lion = new Lion(sex, feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void lionUnknownAnimalTest() {

        Exception exception = Assert.assertThrows(Exception.class, () -> {
            lion = new Lion("неизвестный",feline);
        });
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

    @Test
    public void lionShouldEatOnlyMeat() throws Exception {

        String sex = "Самка";
        Lion lion = new Lion(sex,feline);
        List <String> listPredator = List.of("Животные, Птицы, Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(listPredator);
        List<String> actual = lion.getFood();
        assertEquals(listPredator, actual);
    }
}