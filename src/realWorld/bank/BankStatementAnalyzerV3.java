package realWorld.bank;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.List;

public class BankStatementAnalyzerV3 {
    private static final String RESOURCES = "C:\\Users\\82109\\OneDrive\\.개인공부\\JavaStudy\\JavaStudy\\src\\resources\\bank-data-simple.csv";
    private static final BankStatementCSVParserV1 bankStatementParser = new BankStatementCSVParserV1();

    public static void main(String[] args) throws IOException {

        final Path path = Paths.get(RESOURCES);
        final List<String> lines = Files.readAllLines(path);

        final List<BankTransaction> bankTransactions = bankStatementParser.parseLinesFormCSV(lines);
        final BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(bankTransactions);

        collectSummary(bankStatementProcessor);
    }

    private static void collectSummary(final BankStatementProcessor bankStatementProcessor){
        System.out.println("The total for all transactions is " + bankStatementProcessor.calculateTotalAmount());
        System.out.println("The total for all transactions in January is" + bankStatementProcessor.calculateTotalMonth(Month.JANUARY));
        System.out.println("The total salary received is" + bankStatementProcessor.calculateTotalForCategory("Salary"));
    }

}
