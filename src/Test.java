import java.awt.List;
import java.text.DecimalFormat;
import java.util.ArrayList;

//import java.util.List;
//import java.util.ArrayList;
public class Test {
	public static void main(String[] args) {
		Money ARS = new Money("ARS", 1.00, 0.00508, 0.00479, 0.69283, 6.63601, 0.00423);
		Double val = ARS.Equivalents.get("USD");
		//Converter convert = new Converter(200.0, ARS.getElementFromEquivalents("USD"));
		//Double cant = convert.convert();
		System.out.println(val.toString());
	}

}
