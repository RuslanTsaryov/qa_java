package LionTests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionHasMineParametrizedTest {

    private Feline feline = Mockito.mock(Feline.class);
    private final String sex;
    private final Boolean result;

    public LionHasMineParametrizedTest(String sex, Boolean result) {
        this.sex = sex;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getLionParameters() {
        return new Object[][]{
                {"Самец",true},
                {"Самка",false}
        };
    }

    @Test
    public void lionHasMineTest() throws Exception {

        Lion lion = new Lion(sex,feline);
        assertEquals(result, lion.doesHaveMane());
    }
}