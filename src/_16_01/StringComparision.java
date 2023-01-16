package _16_01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class StringComparision {
	public void countingCharInString(String input) {
		String[] split = input.split("");
		HashMap<String, Integer> map = new HashMap<>();
		for (String string : split) {
			if (!map.containsKey(string)) {
				map.put(string, 1);
			} else {
				map.put(string, map.get(string) + 1);
			}
		}
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Entry<String, Integer> next = iterator.next();
			System.out.print(next.getKey() + next.getValue());

		}

	}

	public static void main(String[] args) {
		StringComparision obj=new StringComparision();
		obj.countingCharInString("abbccccddd");

	}

}
