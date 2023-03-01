import java.util.Map;
import java.util.HashMap;
public class Money {

	public String Name;
	private Map<String, Double>Equivalents = new HashMap<String, Double>();
	
	public Map<String, Double> getEquivalents() {
		return Equivalents;
	}
	public Double getElementFromEquivalents(String Key) {
		return Equivalents.get(Key);
	}
	public void setEquivalents(String Key,Double value) {
		Equivalents.put(Key, value);
	}
	public Money(String name,double dolar, double euro, double yen) {
		Name = name;
		setEquivalents("Dolar", dolar);
		setEquivalents("Euro", euro);
		setEquivalents("Yen", yen);
	}
}
