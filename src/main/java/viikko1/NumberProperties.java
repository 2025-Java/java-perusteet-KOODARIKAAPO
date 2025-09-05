package viikko1;

public class NumberProperties {
    public static String describe(int n) {
        if (n==0) return "nolla";
        boolean parillinen = n % 2 == 0;
        if (n > 0) {
            return parillinen ? "positiivinen parillinen" : "positiivinen pariton";
        } else {
            return parillinen ? "negatiivinen parillinen" : "negatiivinen pariton";
        }
    }
}


