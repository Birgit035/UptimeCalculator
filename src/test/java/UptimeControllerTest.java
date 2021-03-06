import at.hofleitner.UptimeController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UptimeControllerTest {
    @Test
    public void test_calculateUpTime_shouldBeCalculatedCorrectly(){

        //Arrange
        UptimeController controller = new UptimeController();

        //Act
       String actualValue = controller.calculateUpTime(99.95);

       //Assert
        Assertions.assertEquals(String.format("%.2f", 43178.40), actualValue);
    }
}
