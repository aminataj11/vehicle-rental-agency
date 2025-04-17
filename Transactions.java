import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
//Aminata Diallo
public class Transactions {
      private List<Transaction> transactions;

      public Transactions() {
        this.transactions = new ArrayList<>();

      }
      public void add(Transaction t) {
        transactions.add(t);

      }

      private Iterator<Transaction> iterator;
      public void reset() {
        this.iterator = transactions.iterator();
      }
      public boolean hasNext() {
return iterator.hasNext();
      }
      public Transaction getNext() {
        return iterator.next();
      }
}
