import java.text.DecimalFormat;

//import java.util.List;
//import java.util.ArrayList;
public class Test {
	public static void main(String[] args) {
		Money PesoArgentino = new Money("Peso Argentino", 0.00508, 0.00479, 0.69283);
		
		Converter convert1 = new Converter(200.0, PesoArgentino.getElementFromEquivalents("Dolar"));
		
		DecimalFormat Format1 = new DecimalFormat("#.00");
		
		System.out.println(Format1.format(convert1.convert()));
	}

}
