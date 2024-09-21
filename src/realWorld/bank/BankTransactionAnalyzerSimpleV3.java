package realWorld.bank;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.List;

public class BankTransactionAnalyzerSimpleV3 {
    private static final String RESOURCES = "C:\\Users\\82109\\OneDrive\\.개인공부\\JavaStudy\\JavaStudy\\src\\resources\\bank-data-simple.csv";

    public static void main(String[] args) throws IOException {
        final BankStatementCSVParser bankStatementCSVParser = new BankStatementCSVParser();

        final Path path = Paths.get(RESOURCES);
        List<String> lines = Files.readAllLines(path);

        List<BankTransaction> bankTransactions = bankStatementCSVParser.parseLinesFormCSV(lines);

        System.out.println("The total for all transactions is" + calculateTotalAmount(bankTransactions));
        System.out.println("Transactions in January" + selectInMonth(bankTransactions, Month.JANUARY));
    }
}
