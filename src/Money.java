import java.util.HashMap;
public class Money {
	
	public String Name;
	public HashMap<String, Double> Equivalents = new HashMap<String, Double>();
	
	public Money(String Name, Double ars, Double usd, Double eur, Double jpy, Double krw, Double gbp) {
		this.Name = Name;
		Equivalents.put("ARS", ars);
		Equivalents.put("USD", usd);
		Equivalents.put("EUR", eur);
		Equivalents.put("JPY", jpy);
		Equivalents.put("KRW", krw);
		Equivalents.put("GBP", gbp);
	} 
	public Money() {
		
	}
	
}
