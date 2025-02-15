import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.service.MoneyService;


public class MoneyServiceTest {

    @Test
    public void shouldCalculate3MonthOfRest() {
        MoneyService service = new MoneyService();

        int actual = service.calcMonth(10_000, 3000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculate2MonthOfRest() {
        MoneyService service = new MoneyService();

        int actual = service.calcMonth(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}