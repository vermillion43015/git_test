package edu.cscc;

/**
 * Code to exercise Cipher methods
 * @author rplatt
 */
public class Main {

    /**
     * Main method
     * @param args runtime arguments
     */
    public static void main(String[] args) {
        final int KEY = 10;
	    String str = "The quick brown fox jumped over the lazy dog.";
	    System.out.println("Plaintext: "+str);
	    str = Cipher.encode(KEY,str);
        System.out.println("Ciphertext: "+str);
        str = Cipher.decode(KEY,str);
        System.out.println("Plaintext: "+str);
    }
}
