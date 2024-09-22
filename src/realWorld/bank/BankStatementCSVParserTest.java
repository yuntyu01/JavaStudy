package realWorld.bank;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class BankStatementCSVParserTest {

    private final BankStatementParser statementParser = new BankStatementCSVParserV2();
    private static final String RESOURCES = "C:\\Users\\82109\\OneDrive\\.개인공부\\JavaStudy\\JavaStudy\\src\\resources\\bank-data-simple.csv";

    @Test
    public void shouldParseOneCorrectLine() throws Exception{
        final String line = "30-01-2017,-50,Tesco";

        final BankTransaction result = statementParser.parseFrom(line);

        Path path = Paths.get(RESOURCES);
        List<String> lines = Files.readAllLines(path);
        final List<BankTransaction> result2 = statementParser.parseLinesFrom(lines);

        double tescoTotalAmount = result2.stream()
                .filter(a -> a.getDescription().equals("Tesco"))
                .mapToDouble(BankTransaction::getAmount).sum();

        final BankTransaction expected = new BankTransaction(-50, LocalDate.of(2017, Month.JANUARY, 30), "Tesco");
        final double tolerance = 0.0d;

        final double expected1 = 2950d;

        Assert.assertEquals(expected.getAmount(), result.getAmount(), tolerance);
        Assert.assertEquals(expected.getDate(), result.getDate());
        Assert.assertEquals(expected.getDescription(), result.getDescription());

        //tescoTotalAmountTest
        Assert.assertEquals(expected1, tescoTotalAmount, 0d);
    }
}
