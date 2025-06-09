package Day_03;

public class TypiNumerici {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
				byte numeroByte = 122; // In Binario  01111010
				short numeroShort= numeroByte; // In Binario : 0000000001111010		
				int numeroint = numeroShort; // in Binario Sarebbero 00000000 00000000 01111010
				long numeroLong = numeroint; 
				// In Binario Sarebbero 00000000 00000000 00000000  00000000 00000000 00000000 00000000 01111010
				long NumeroLong = numeroint;
				float NumeroFloat = NumeroLong;
				double NumeroDouble= NumeroFloat;
				System.out.println("NumeroDouble :" + NumeroDouble);
		}
}
