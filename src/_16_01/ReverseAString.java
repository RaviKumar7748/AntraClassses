package _16_01;

public class ReverseAString {
	public String[] reverseString(String s) {
		String[] split = s.split(" ");
		String[] output = new String[split.length];
		int j = 0;
		for (int i = split.length - 1; i >= 0; i--) {

			output[j] = split[i];
			j++;

		}

		return output;
	}

	public static void main(String[] args) {
		ReverseAString obj = new ReverseAString();
		String[] reverseString = obj.reverseString("a boy is sitting here");
		for (String string : reverseString) {
			System.out.print(string + "  ");
		}

	}

}
