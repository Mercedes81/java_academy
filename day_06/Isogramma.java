package Day_06;

public class Isogramma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "abcdef";
		boolean[] lettereTrovate = new boolean[26];
		for (int i = 0; i < frase.length(); i++) {
			char c = frase.charAt(i);
			if (c >= 'a' && c <= 'z') {
				int indice = c - 'a';
				if (lettereTrovate[indice]) {
					System.out.println("La frase non è un isogramma");
					return;
				} else {
					lettereTrovate[indice] = true;
				}
			}
		}
		System.out.println("La frase è un isogramma");

	}

}