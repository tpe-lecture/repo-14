package tpe.testate.crypter;

/**
 * Diese Klasse implementiert das interface Crypter und dient dazu, Texte mit der
 * speziellen TPE-Verschl�sselung zu verschl�sseln.
 */
public class CrypterImpl implements Crypter {
	public char[] buchstaben = "abcdefghijklmnopqrstuvwxyz ".toCharArray();
	public char[] zahlen = "0123456789".toCharArray();
	public char[] crypter = "3l1o0a4t7".toCharArray();
	public char[] crypter2 = "e1l0o4a7t".toCharArray();

	/**
	 * Verschl�sselt den gegebenen Text. Enth�lt die Eingabe Gro�buchstaben,so
	 * werden diese in Kleinbuchstaben umgewandelt. Ung�ltige Zeichen werden
	 * ignoriert und nicht in den verschl�sselten Text �bernommen.
	 *
	 * @param input Text, der verschl�sselt werden soll.
	 * @return Verschl�sselter Text.
	 */
	@Override
	public String encrypt(String input) {
		input = input.toLowerCase();
		char[] ca = input.toCharArray();
		String output = "";

		for (int position = 0; position < ca.length; position++) {
			inner: for (int posCrypter = 0; posCrypter < crypter.length; posCrypter++) {
				if (ca[position] == crypter[posCrypter]) {
					ca[position] = crypter2[posCrypter];
					break inner;
				}
				if (ca[position] == crypter2[posCrypter]) {
					ca[position] = crypter[posCrypter];
					break inner;

				}
			}
		}

		for (int position = 0; position < ca.length; position++) {
			for (int pos = 0; pos < buchstaben.length; pos++) {
				if (pos < zahlen.length) {
					if (ca[position] == zahlen[pos]) {
						output = output + ca[position];
					}
				}

				if (ca[position] == buchstaben[pos]) {
					output = output + ca[position];
				}

			}
		}

		return output;

	}

	/**
	 * Entschl�sselt den gegebenen Text. Enth�lt die Eingabe Gro�buchstaben,
	 * oder andere ung�ltige Zeichen, so wirft die Methode eine Ausnahme.
	 * @param input Text, der entschl�sselt werden soll.
	 * @return Entschl�sselter Text.
	 * @throws IllegalArgumentException Wird geworfen, wenn die Eingabe
	 * ung�ltige Zeichen (Gro�buchstaben) enth�lt.
	 */
	@Override
	public String decrypt(String input) throws IllegalArgumentException {

		for (int position = 0; position < input.length(); position++) {

			inner: for (int position2 = 0; position2 < buchstaben.length; position2++) {
				if (position2 < zahlen.length) {
					if (input.charAt(position) == zahlen[position2]) {
						break inner;
					}
				}
				if (input.charAt(position) == buchstaben[position2]) {
					break inner;
				}
				if (position2 + 1 == buchstaben.length) {
					throw new IllegalArgumentException();
				}
			}
		}
		return encrypt(input);
	}

}