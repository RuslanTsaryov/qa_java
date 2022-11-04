import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void felineEatMeatTest() throws Exception {

        String actual = feline.eatMeat().toString();
        assertEquals("[Животные, Птицы, Рыба]", actual);
    }

    @Test
    public void felineGetKittensTest() {

        assertEquals(1, feline.getKittens());
    }

    @Test
    public void felineGetKittensWithParameterTest() {

        assertEquals(2, feline.getKittens(2));
    }

    @Test
    public void felineGetFamilyTest() {

        String actual = feline.getFamily();
        assertEquals("Кошачьи", actual);
    }
}