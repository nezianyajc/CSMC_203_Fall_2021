

public class CryptoManager {
	
	private static final char LOWER_BOUND = 32;
	private static final char UPPER_BOUND = 95;
	private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_BOUND and UPPER_BOUND characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean stringInBounds (String plainText) {
		boolean flag = false;
		for(int i=0; i < plainText.length(); i++) {
			System.out.println(plainText.charAt(i));
			if(plainText.charAt(i) >= LOWER_BOUND && plainText.charAt(i) <= UPPER_BOUND) {
				System.out.println("String in bounds");
				flag = true;
			} else if(!(plainText.charAt(i) >= LOWER_BOUND && plainText.charAt(i) <= UPPER_BOUND)) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String encryptCaesar(String plainText, int key) {
		
		boolean testString = stringInBounds(plainText);
		String encryptedString = "";
		if(testString == true) {
			for(int i =0; i < plainText.length(); i++) {
				int shiftedText = plainText.charAt(i) + key;
				while( shiftedText > UPPER_BOUND) {
					shiftedText -= RANGE;
				}
				encryptedString += Character.toString((char) ((int) shiftedText));
				
			}
		}
		return encryptedString;
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String encryptBellaso(String plainText, String bellasoStr) {
		
		boolean testString = stringInBounds(plainText);
	
			String encryptedString = "";
			int bellasoStrCount = bellasoStr.length(); 
			int shiftedText;
			for(int i = 0; i < plainText.length();   i++) {
				if(testString) {
					int textToShift = plainText.charAt(i);
					shiftedText = ((int)textToShift + (int)bellasoStr.charAt(i % bellasoStrCount));
			
					while( shiftedText > UPPER_BOUND) {
						shiftedText -= RANGE;
					}
					encryptedString += (char)shiftedText;
					}		
				}
		
			return encryptedString;

	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String decryptCaesar(String encryptedText, int key) {
		String decryptedString = "";
		key = keyCorr(key);
			for(int i =0; i < encryptedText.length(); i++) {
			
				int shiftedText = encryptedText.charAt(i) - key;
				decryptedString += Character.toString((char) ((int) shiftedText));
			}
		return decryptedString;
	}
	
	public static int keyCorr(int key) {
		while( key > UPPER_BOUND) {
			key -= RANGE;
		}
		return key;
	}


	
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String decryptBellaso(String encryptedText, String bellasoStr) {
		String decryptedString = "";
		boolean testString = stringInBounds(encryptedText);
		int bellasoStrCount = bellasoStr.length(); 
		int shiftedText;
		for(int i = 0; i < encryptedText.length();   i++) {
			if(testString) {
				int textToShift = encryptedText.charAt(i);
				shiftedText = ((int)textToShift - (int)bellasoStr.charAt(i % bellasoStrCount));
			
			while( shiftedText < LOWER_BOUND) {
				shiftedText += RANGE;
			}
				decryptedString += (char)shiftedText;
				}
			}
		return decryptedString;
		
	}
}