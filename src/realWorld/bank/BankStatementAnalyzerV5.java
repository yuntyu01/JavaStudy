package realWorld.bank;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class BankStatementAnalyzerV5 {
    private static final String RESOURCES = "C:\\Users\\82109\\OneDrive\\.개인공부\\JavaStudy\\JavaStudy\\src\\resources\\bank-data-simple.csv";
    private static final BankStatementCSVParserV1 bankStatementParser = new BankStatementCSVParserV1();

    public static void main(String[] args) throws IOException {

        final Path path = Paths.get(RESOURCES);
        final List<String> lines = Files.readAllLines(path);

        final List<BankTransaction> bankTransactions = bankStatementParser.parseLinesFormCSV(lines);

        final BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(bankTransactions);
        collectSummary(bankStatementProcessor);


        final BankStatementDateRange bankStatementDateRange = new BankStatementDateRange(bankTransactions);
        LocalDate minRange = LocalDate.of(2016, 1, 1);
        LocalDate maxRange = LocalDate.of(2018, 1, 1);
        System.out.println(bankStatementDateRange.DateRangeMaxAmount(minRange, maxRange));
        System.out.println(bankStatementDateRange.DateRangeMinAmount(minRange, maxRange));

        final BankStatementGrouping bankStatementGrouping = new BankStatementGrouping(bankTransactions);
        bankStatementGrouping.groupingDate();
        bankStatementGrouping.groupingAmount();
        bankStatementGrouping.groupingDescription();
    }

    private static void collectSummary(final BankStatementProcessor bankStatementProcessor){
        System.out.println("The total for all transactions is " + bankStatementProcessor.calculateTotalAmount());
        System.out.println("The total for all transactions in January is" + bankStatementProcessor.calculateTotalMonth(Month.JANUARY));
        System.out.println("The total salary received is" + bankStatementProcessor.calculateTotalForCategory("Salary"));
    }


}
