package realWorld.bank;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class BankStatementCSVParserTest {

    private final BankStatementParser statementParser = new BankStatementCSVParserV2();

    @Test
    public void shouldParseOneCorrectLine() throws Exception{
        final String line = "30-01-2017,-50,Tesco";

        final BankTransaction result = statementParser.parseFrom(line);

        final BankTransaction expected = new BankTransaction(-50, LocalDate.of(2017, Month.JANUARY, 30), "Tesco");
        final double tolerance = 0.0d;

        Assert.assertEquals(expected.getAmount(), result.getAmount(), tolerance);
        Assert.assertEquals(expected.getDate(), result.getDate());
        Assert.assertEquals(expected.getDescription(), result.getDescription());
    }
}
