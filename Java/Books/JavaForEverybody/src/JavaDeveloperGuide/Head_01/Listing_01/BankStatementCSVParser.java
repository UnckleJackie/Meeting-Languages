package JavaDeveloperGuide.Head_01.Listing_01;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class BankStatementCSVParser implements BankStatementParser {
    private static final DateTimeFormatter DATE_PATTERN
            = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    public BankTransaction parseFrom(final String line) {
        final String[] columns = line.split(",");
        final LocalDate date = LocalDate.parse(columns[0], DATE_PATTERN);
        final double amount = Double.parseDouble(columns[1]);
        return new BankTransaction(date, amount, columns[2]);
    }
    public List<BankTransaction> parseLinesFrom(final List<String> lines) {
        return lines.stream().map(this::parseFrom).collect(toList());

//    private BankTransaction parseFromCSV(final String line) {
//        final String[] columns = line.split(",");
//        final LocalDate date = LocalDate.parse(columns[0], DATE_PATTERN);
//        final double amount = Double.parseDouble(columns[1]);
//        final String description = columns[2];
//        return new BankTransaction(date, amount, description);
//    }
//
//    public List<BankTransaction> parseLinesFromCSV(final List<String> lines) {
//        final List<BankTransaction> bankTransactions = new ArrayList<>();
//        for (final String line : lines) {
//            bankTransactions.add(parseFromCSV(line));
//        }

//        final BankStatementCSVParser bankStatementParser = new BankTransactionCSVParser();
//        final String fileName = args[0];
//        final Path path = Paths.get(RESOURCES + fileName);
//        final List<String> lines = Files.readAllLines(path);
//        final List<BankTransaction> bankTransactions
//                = bankStatementParser.parseLinesFromCSV(lines);
//        System.out.println("The total for all transactions is " +
//                calculateTotalAmount(bankTransactions));
//        System.out.println("Transactions in January " +
//        selectInMonth(BankTransaction, Month.JANUARY));
//        return bankTransactions;
    }

//    public static double calculateTotalAmount(final List<BankTransaction> bankTransactions) {
//        double total = 0d;
//        for (final BankTransaction bankTransaction : bankTransactions) {
//            total += bankTransaction.getAmount();
//        }
//        return total;
//    }
//
//    public static List<BankTransaction> selectInMonth(final List<BankTransaction>
//                                          bankTransactions, final Month month) {
//        final List<BankTransaction> bankTransactionsInMonth = new ArrayList<>();
//        for (final BankTransaction bankTransaction : bankTransactions) {
//            if (bankTransaction.getDate().getMonth() == month) {
//                bankTransactionsInMonth.add(bankTransaction);
//            }
//        }
//        return bankTransactionsInMonth;
//    }
}
