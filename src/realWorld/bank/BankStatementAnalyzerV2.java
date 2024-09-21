package realWorld.bank;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class BankStatementAnalyzerV2 {
    private static final String RESOURCES = "C:\\Users\\82109\\OneDrive\\.개인공부\\JavaStudy\\JavaStudy\\src\\resources\\bank-data-simple.csv";

    public static void main(String[] args) throws IOException {
        final BankStatementCSVParserV1 bankStatementCSVParser = new BankStatementCSVParserV1();

        final Path path = Paths.get(RESOURCES);
        List<String> lines = Files.readAllLines(path);

        List<BankTransaction> bankTransactions = bankStatementCSVParser.parseLinesFormCSV(lines);

        System.out.println("The total for all transactions is" + calculateTotalAmount(bankTransactions));
        System.out.println("Transactions in January" + selectInMonth(bankTransactions, Month.JANUARY));
    }

    public static double calculateTotalAmount(final List<BankTransaction> bankTransactions){
        double total = 0;
        for (BankTransaction bankTransaction : bankTransactions) {
            total += bankTransaction.getAmount();
        }

        return total;
    }

    public static List<BankTransaction> selectInMonth(final List<BankTransaction> bankTransactions, final  Month month){
        final List<BankTransaction> bankTransactionsInMonth = new ArrayList<>();
        for (BankTransaction bankTransaction : bankTransactions) {
            if (bankTransaction.getDate().getMonth() == month){
                bankTransactionsInMonth.add(bankTransaction);
            }
        }
        return bankTransactionsInMonth;
    }
}
