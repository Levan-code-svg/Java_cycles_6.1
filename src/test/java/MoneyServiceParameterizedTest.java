import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.service.MoneyService;

public class MoneyServiceParameterizedTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/java/Resources/MoneyService.csv")
    public void shouldCalculateAmountMonthOfRest(int expected, int income, int expenses, int threshold) {

        MoneyService service = new MoneyService();

        int actual = service.calcMonth( income,  expenses,  threshold);

        Assertions.assertEquals(expected, actual);
    }
}