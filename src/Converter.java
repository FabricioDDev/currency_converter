
public class Converter {
	//Atributes.
	public Double FirstValue;
	public Double SecondValue;
	//Builder
	public Converter(Double FirstValue, Double SecondValue) {
		this.FirstValue = FirstValue;
		this.SecondValue = SecondValue;
	}
	//Methods
	public Double convert() {
		return FirstValue * SecondValue;
	}
	//public Double ReverseConvert() {
	//	return SecondValue/FirstValue;
	//}
}
