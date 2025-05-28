package day_03;

public class NomeQuadrado {
	 public static void main(String[] args) {
	        String nome = " 'Mercedes' ";

	        int lunghezza = nome.length();
	        
	        // Riga superiore
	        System.out.print("+");
	        for (int i = 0; i < lunghezza + 2; i++) {
	            System.out.print("-");
	        }
	        System.out.println("+");

	        // Riga con il nome
	        System.out.println("| " + nome + " |");

	        // Riga Inferiore
	        System.out.print("+");
	        for (int i = 0; i < lunghezza + 2; i++) {
	            System.out.print("-");
	        }
	        System.out.println("+");
	    }

}
