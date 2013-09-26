
public class Weather {


	public static void main(String[] args) {
		float fah = 86;
		System.out.println(fah + " degrees Fahrenheit is ...");
		//to convert fahrenheit to celcius
		// begin by subtracting 32
		fah = fah - 32;
		//divide the answer by 9
		fah = fah / 9;
		//multiply that answer by 5
		fah = fah * 5;
		System.out.println(fah + " degrees celcius\n");
		float cel = 33;
		System.out.println(cel +" degrees Celcius is ...");
		/* to concert celcius to fahrenheit, begin by multiplying by 9
		 * then divide that answer by 5, then lastly you add 32*/
		cel = cel * 9;
		cel = cel / 5;
		cel = cel + 32;
		System.out.println(cel +" degrees fahrenhiet");
	}

}
