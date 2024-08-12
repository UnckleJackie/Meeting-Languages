package JavaDeveloperGuide.Head_01.Listing_01;

@FunctionalInterface
public interface BankTransactionFilter {
    boolean test(BankTransaction bankTransaction);
}
