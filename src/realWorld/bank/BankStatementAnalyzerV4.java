package realWorld.bank;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BankStatementAnalyzerV4 {
    private static final String RESOURCES = "C:\\Users\\82109\\OneDrive\\.개인공부\\JavaStudy\\JavaStudy\\src\\resources\\bank-data-simple.csv";


    public void analyze(final String fileName, final BankStatementParser bankStatementParser)throws IOException{

        final Path path = Paths.get(RESOURCES);
        final List<String> lines = Files.readAllLines(path);

        final List<BankTransaction> bankTransactions = bankStatementParser.parseLinesFrom(lines);

        final BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(bankTransactions);

    }
}
