package lab.demand;

public class Tax {

    public double calculateTax(String country) throws IllegalArgumentException {
        if (!(country instanceof String)) {
            throw new IllegalArgumentException("calculateTax() only receives Alpha-2 country codes");
        }
        if (country.equals("PE"))
            return 0.18;
        if (country.equals("BR"))
            return 0.12;
        return 0.0;
    }
}
