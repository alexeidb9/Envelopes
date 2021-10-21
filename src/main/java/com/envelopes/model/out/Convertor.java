//import java.util.HashMap;
//import java.util.Map;
//
////This class is a simple currency convertor.
//
//public class Convertor extends BudgetInput {
//
//    public Convertor(double usd, double eu, double zl) {
//        double conversion;
//
//    }
//
//    public Convertor (double zl);
//
//    // EU to ZL converter. How could I make all the conversions in 1 method?
//    public double convertInput(double eu) {
//
//        if(eu <= 0) {
//            System.out.println("Incorrect value.");
//
//            double conversion = eu * CurrencyZL.getOrDefault("EU", 4.47);
//            System.out.println(eu + " euros is" + conversion + " zloty.");
//        }
//
//        return double conversion;
//
//    }
//
//
//    //Hashmaps for storing and accessing currency conversion rates for further convertation.
//    private Map<String, Double> CurrencyEU = new HashMap<>();
//
//    {
//        CurrencyEU.put("USD", 4.44);
//        CurrencyEU.put("ZL", 4.47);
//
//        return CurrencyEU.keySet();
//
//    }
//
//    private Map<String, Double> CurrencyUS = new HashMap<>();
//
//    {
//        CurrencyUS.put("EU", 4.44);
//        CurrencyUS.put("ZL", 4.47);
//
//    }
//
//    private Map<String, Double> CurrencyZL = new HashMap<>();
//
//    {
//        CurrencyZL.put("USD", 4.44);
//        CurrencyZL.put("EU", 4.47);
//
//    }
//
//
//}
//
