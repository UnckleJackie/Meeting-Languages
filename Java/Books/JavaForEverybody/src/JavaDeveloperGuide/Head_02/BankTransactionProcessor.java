package JavaDeveloperGuide.Head_02;

import java.time.Month;
import java.util.List;
import java.util.Locale;

public interface BankTransactionProcessor {
    double calculateTotalAmount();

    double calculateTotalInMonth(Month month);

    double calculateTotalInJanuary();

    double calculateAverageAmount();

    double calculateAverageAmountForCategory(Locale.Category category);

    List<BankTransaction> findTransactions(BankTransactionFilter bankTransactionFilter);
}
