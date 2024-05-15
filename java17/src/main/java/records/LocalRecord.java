package records;


import java.lang.reflect.RecordComponent;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

record Merchant(String name) { }

record Sale(Merchant merchant, LocalDate date, double value) { }

// Serialization details: https://docs.oracle.com/en/java/javase/21/docs/specs/serialization/serial-arch.html#serialization-of-records
public class LocalRecord {

  List<Merchant> findTopMerchants(
      List<Sale> sales, List<Merchant> merchants, int year, Month month) {

    // Local record class
    record MerchantSales(Merchant merchant, double sales) {}

    // Local record improves readability of the stream
    return merchants.stream()
        .map(merchant -> new MerchantSales(
            merchant, this.computeSales(sales, merchant, year, month)))
        .sorted((m1, m2) -> Double.compare(m2.sales(), m1.sales()))
        .map(MerchantSales::merchant)
        .collect(Collectors.toList());
  }

  double computeSales(List<Sale> sales, Merchant mt, int yr, Month mo) {
    return sales.stream()
        .filter(s -> s.merchant().name().equals(mt.name()) &&
            s.date().getYear() == yr &&
            s.date().getMonth() == mo)
        .mapToDouble(Sale::value)
        .sum();
  }

  // Record methods
  public boolean isRecordExample(Merchant merchant) {
    return merchant.getClass().isRecord();
  }

  public RecordComponent[] getRecordComponents(Merchant merchant) {
    return merchant.getClass().getRecordComponents();
  }

  public static void main(String[] args){
    LocalRecord localRecord = new LocalRecord();
    System.out.println(localRecord.isRecordExample(new Merchant("bob")));
    System.out.println(
        Arrays.toString(localRecord.getRecordComponents(new Merchant("bob"))));
  }

}
