import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class MathematicalToolTest {
    static MathematicalTool tool;
    @BeforeAll
    static void beforeAll(){
        tool=new MathematicalTool();
    }


    @ParameterizedTest
    @ValueSource(doubles = {2,2,4,2})
    public void twoPlusTow(){
        assertEquals(4,tool.add(2,2));
    }

    @Test
    @DisplayName("")
    public void TwoDividedByZeroShouldThrowException(){
        Assertions.assertThrows(ArithmeticException.class
                ,() -> tool.Division(2,0));
    }
}