package Two_Sign;

public class Sign {

	int width;
	String text;

	public Sign(String t, int w) {
		width = w;
		text = t;
	}

	public int numberOfLines(){
		int lines = text.length()/width;
		if(text.length()%width != 0)
			lines++;
		return lines;
	}

	public String getLines(){
		int n = numberOfLines();
//		for(int i = 0; i < arr.length; i++){
//			if(i != arr.length-1)
//				arr[i] = text.substring(i*width, i*width+width);
//			else
//				arr[i] = text.substring(i*width);
//		}
		String str = "";
		for(int i = 0; i < n; i++){
			if(i != n-1)
				str += text.substring(i*width, i*width+width)+";";
			else
				str += text.substring(i*width);
		}
		return str;
	}

	public String toString(){
		return text+" === "+width;
	}
}