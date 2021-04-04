//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//
//public class TransactionsHistory {
//
//    protected final ArrayList<String> historyOfTransactions = new ArrayList<String>();
//
//    public ArrayList<String> readHistory() throws IOException {
//
//        try (InputStream inputStream = Envelope.class.getResourceAsStream("/history.txt")) {
//
//            BufferedReader file = new BufferedReader(new InputStreamReader(inputStream));
//            for (; ; ) {
//                String line = file.readLine();
//                if (line == null) {
//                    break;
//                }
//                historyOfTransactions.add(line);
//            }
//            System.out.println("The latest transactions: (D - Deposits, W - Withdraws) for " + envelopeType + " are: ");
//            return historyOfTransactions;
//        }
//    }
//
//
//}
