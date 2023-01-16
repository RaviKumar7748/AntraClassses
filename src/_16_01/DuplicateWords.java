package _16_01;

public class DuplicateWords {
	public String findDuplicate(String input) {
		String[] split = input.split(" ");
		String duplicate = "";
		for (int i = 0; i < split.length; i++) {
			for (int j = 1 + i; j < split.length; j++) {
				if (split[i].equals(split[j])) {
					duplicate = duplicate + split[i]+"  ";
				}

			}
		}

		return duplicate;
	}

	public static void main(String[] args) {
		DuplicateWords obj=new DuplicateWords();
		String findDuplicate = obj.findDuplicate("a boy a girl boy");
		System.out.println(findDuplicate);
		

	}

}
