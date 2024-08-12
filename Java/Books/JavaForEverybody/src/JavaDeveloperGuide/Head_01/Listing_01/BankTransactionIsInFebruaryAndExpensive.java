package JavaDeveloperGuide.Head_01.Listing_01;

import java.time.Month;
import java.util.List;

public class BankTransactionIsInFebruaryAndExpensive implements BankTransactionFilter {
    @Override
    public boolean test(final BankTransaction bankTransaction) {
        return bankTransaction.getDate().getMonth() == Month.FEBRUARY
                && bankTransaction.getAmount() >= 1_000;
//        final List<BankTransaction> transactions = bankStatementProcessor
//                .findTransactions(new BankTransactionIsInFebruaryAndExpensive());
    }

}
