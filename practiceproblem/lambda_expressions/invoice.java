import java.util.*;
import java.util.stream.*;

class Invoice {
    String id;
    Invoice(String id) { this.id = id; }
    public String toString() { return "Invoice for " + id; }
}

 class InvoiceGenerator {
    public static void main(String[] args) {
        List<String> txns = Arrays.asList("TX100", "TX101", "TX102");
        List<Invoice> invoices = txns.stream()
                                     .map(Invoice::new)
                                     .toList();
        invoices.forEach(System.out::println);
    }
}
