package first;

public class StringMultiword {
	public static void main(String[] args) {

		String str = "Naveen is a good ";
		String space = " ";
		String[] splitstring = null;
		String s = " ";

		splitstring = str.split(space);
		System.out.println(splitstring.length);

		StringBuilder sb = new StringBuilder();

		for (int i = splitstring.length - 1; i >= 0; i--) {
			sb.append(splitstring[i]);
			s += sb.toString() + " ";

		}

		System.out.print(s);

	}

}
