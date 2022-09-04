package lamdas;
import static java.util.stream.Collectors.groupingBy;

import java.util.Map;
public class DemoCollection {

public static void main(String[] args) {
    // Map<Currency, List<Transaction>> transactionsByCurrencies = new HashMap<>(); 
    // for (Transaction transaction : transactions) 
    // { 
    //     if(transaction.getPrice() > 1000)
    //     {
    //          Currency currency = transaction.getCurrency(); 
    //          List<Transaction> transactionsForCurrency = transactionsByCurrencies.get(currency); 
    //          if (transactionsForCurrency == null) { 
    //             transactionsForCurrency = new ArrayList<>(); 
    //             transactionsByCurrencies.put(currency, transactionsForCurrency); 
    //         } 
    //         transactionsForCurrency.add(transaction); 
    //     } 
    // }

                //or
     //Map<Currency, List<Transaction>> transactionsByCurrencies = transactions.stream() .filter((Transaction t) -> t.getPrice() > 1000) .collect(groupingBy(Transaction::getCurrency));

    


}

     
    
}
