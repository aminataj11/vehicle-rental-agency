import java.util.Iterator; 
public class Transactionstestdriver {
    
    public static void main(String[] args) {
        Transactions transactions = new Transactions();

        Transaction t1 = new Transaction("1111 2222 3333 4444", "Aminata Diallo", "SUV", "2 days","74 miles driven", "$75" );
        transactions.add(t1);

        System.out.println("Transaction List");
        transactions.reset();
        while (transactions.hasNext()) {
            
                        System.out.println(transactions);
        }

    }
}
