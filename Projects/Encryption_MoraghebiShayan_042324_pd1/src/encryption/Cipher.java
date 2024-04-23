package encryption;

public class Cipher {
	private String phrase;
	private int key;

	public Cipher(String str) {
		phrase = str;
		key =(int) (Math.random()*(phrase.length()-1)+1);
	}

	public Cipher(){
		phrase = null;
		key = 0;
	}

	public String matrixCipher(){
		String str = rotatePhrase(phrase);
		int n =(int) Math.ceil(Math.sqrt(phrase.length()));
		String[][] arr = new String[n][n];
		int index = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (index<phrase.length()) {
					arr[i][j] = str.substring(index,index+1);
				}
				else{
					arr[i][j] = "~";
				}
				index++;
			}
		}
		String ret = "";
		for (int k = n - 1; k >= 0; k--) {
			for (int i = k, j = 0; i < n && j < n; i++, j++) {
				ret += arr[i][j];
			}
		}

		for (int k = 1; k < n; k++) {
			for (int i = 0, j = k; i < n && j < n; i++, j++) {
				ret += arr[i][j];
			}
		}
		return ret;
	}

	private String rotatePhrase(String phrase){
		return phrase.substring(phrase.length()-key)+phrase.substring(0,phrase.length()-key);
	}
}
