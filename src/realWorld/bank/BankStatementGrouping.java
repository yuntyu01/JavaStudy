package realWorld.bank;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BankStatementGrouping {

    private final List<BankTransaction> bankTransaction;

    public BankStatementGrouping(List<BankTransaction> bankTransaction) {
        this.bankTransaction = bankTransaction;
    }


    public void groupingDate(){
        Map<LocalDate, List<BankTransaction>> collect = bankTransaction.stream()
                .collect(Collectors.groupingBy(BankTransaction::getDate));

        System.out.println(collect);
    }

    public void groupingDate(List<BankTransaction> bankTransaction){
        Map<LocalDate, List<BankTransaction>> collect = bankTransaction.stream()
                .collect(Collectors.groupingBy(BankTransaction::getDate));

        System.out.println(collect);
    }

    public void groupingAmount(){
        Map<Double, List<BankTransaction>> collect = bankTransaction.stream()
                .collect(Collectors.groupingBy(BankTransaction::getAmount));

        System.out.println(collect);
    }

    public void groupingAmount(List<BankTransaction> bankTransaction){
        Map<Double, List<BankTransaction>> collect = bankTransaction.stream()
                .collect(Collectors.groupingBy(BankTransaction::getAmount));

        System.out.println(collect);
    }

    public void groupingDescription(){
        Map<String, List<BankTransaction>> collect = bankTransaction.stream()
                .collect(Collectors.groupingBy(BankTransaction::getDescription));

        System.out.println(collect);
    }

    public void groupingDescription(List<BankTransaction> bankTransaction){
        Map<String, List<BankTransaction>> collect = bankTransaction.stream()
                .collect(Collectors.groupingBy(BankTransaction::getDescription));

        System.out.println(collect);
    }
}
