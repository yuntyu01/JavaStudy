package realWorld.bank;

import java.time.LocalDate;
import java.util.List;
import java.util.OptionalDouble;

public class BankStatementDateRange {

    private final List<BankTransaction> bankTransactions;

    public BankStatementDateRange(List<BankTransaction>bankTransactions){
        this.bankTransactions = bankTransactions;
    }

    public double DateRangeMaxAmount(LocalDate minDate1, LocalDate maxDate2){

        OptionalDouble max = bankTransactions.stream()
                .filter(a -> a.getDate().isBefore(maxDate2))
                .filter(a -> a.getDate().isAfter(minDate1))
                .mapToDouble(BankTransaction::getAmount)
                .max();

        return max.orElseThrow();
    }

    public double DateRangeMinAmount(LocalDate minDate1, LocalDate maxDate2){

        OptionalDouble min = bankTransactions.stream()
                .filter(a -> a.getDate().isBefore(maxDate2))
                .filter(a -> a.getDate().isAfter(minDate1))
                .mapToDouble(BankTransaction::getAmount)
                .min();

        return min.orElseThrow();
    }
}
