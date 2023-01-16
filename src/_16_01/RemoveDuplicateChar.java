package _16_01;

public class RemoveDuplicateChar {
	public String removeDuplicate(String input) {
		input = input.toLowerCase();
		String replace = "";
		for (int i = 0; i < input.length() - 1; i++) {
			for (int j = i + 1; j < input.length(); j++) {
				if (input.charAt(i) == input.charAt(j)) {

				} else {
					if (!replace.contains(input.charAt(i) + "")) {
						replace = replace + input.charAt(i);
					}

				}

			}
		}
		return replace;
	}

	public static void main(String[] args) {
		RemoveDuplicateChar obj = new RemoveDuplicateChar();
		String removeDuplicate = obj.removeDuplicate("Antra");
		System.out.println(removeDuplicate);

	}

}
