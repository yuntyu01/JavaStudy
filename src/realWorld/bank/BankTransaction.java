package realWorld.bank;

import java.time.LocalDate;
import java.util.Objects;

public class BankTransaction {
    private final double amount;
    private final LocalDate date;
    private final String description;

    public BankTransaction(double amount, LocalDate date, String description) {
        this.amount = amount;
        this.date = date;
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "[" +
                "amount=" + amount +
                ", date=" + date +
                ", description='" + description + '\'' +
                ']';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        BankTransaction that = (BankTransaction) object;
        return amount == that.amount && date == that.date && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, date, description);
    }
}
