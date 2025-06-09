package Exercizi_17.Rotazionale;

       public static String encode(String input, int key) {
        
        int k = ((key % 26) + 26) % 26;
        StringBuilder result = new StringBuilder(input.length());

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                                char shifted = (char) ('A' + (c - 'A' + k) % 26);
                result.append(shifted);
            } else if (Character.isLowerCase(c)) {
                char shifted = (char) ('a' + (c - 'a' + k) % 26);
                result.append(shifted);
            } else {
               
            	result.append(c);
            }
        }
        return result.toString();
    }

        public static String decode(String input, int key) {
        return encode(input, 26 - (key % 26));
    }

    public static void main(String[] args) {
        String plain = "Hello, World! 123";
        int key = 13;  // ROT13

        String cipher = encode(plain, key);
        String deciphered = decode(cipher, key);

        System.out.println("Plain:      " + plain);
        System.out.println("Cipher (ROT" + key + "): " + cipher);
        System.out.println("Deciphered: " + deciphered);
    }
}
