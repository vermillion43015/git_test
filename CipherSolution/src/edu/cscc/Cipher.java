package edu.cscc;

/**
 * Implementation of Caesar cipher
 * @author rplatt
 */
public class Cipher {
    private static final char[] alphabet =
            "abcdefghijklmnopqrstuvwxyz".toCharArray();

    /**
     * Encrypt plaintext using Caesar cipher
     * @param key encryption key
     * @param plaintext unencrypted text
     * @return ciphertext
     */
    public static String encode(int key, String plaintext) {
        String ciphertext = null;
        if (plaintext != null && !plaintext.isBlank()) {
            char[] parr = plaintext.trim().toLowerCase().toCharArray();
            char[] carr = new char[parr.length];
            for (int i=0; i<parr.length; ++i) {
                if (Character.isLetter(parr[i])) {
                    carr[i] = alphabet[((parr[i] - 'a' + key)%26)];
                } else {
                    carr[i] = parr[i];
                }
            }
            ciphertext = new String(carr);
        }
        return ciphertext;
    }

    /**
     * Decrypt ciphertext using Caesar cipher
     * @param key decryption key
     * @param ciphertext encrypted text
     * @return plaintext
     */
    public static String decode(int key, String ciphertext) {
        String plaintext = null;
        if (ciphertext != null && !ciphertext.isBlank()) {
            char[] carr = ciphertext.trim().toLowerCase().toCharArray();
            char[] parr = new char[carr.length];
            for (int i=0; i<carr.length; ++i) {
                if (Character.isLetter(carr[i])) {
                    parr[i] = alphabet[((carr[i] - 'a' - key+26)%26)];
                } else {
                    parr[i] = carr[i];
                }
            }
            plaintext = new String(parr);
        }
        return plaintext;
    }
}
