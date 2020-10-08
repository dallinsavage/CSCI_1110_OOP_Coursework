/* Dallin Savage
 * 10/8/20
 * remove duplicates from generic list
 */

import java.util.ArrayList;

public class Exercise_19_3 {

	public static void main(String[] args) {
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(14);
	    list.add(24);
	    list.add(14);
	    list.add(42);
	    list.add(25);
	    ArrayList<Integer> newList = removeDuplicates(list);
	    for (int y = 0; y < newList.size(); y++) {
	    	System.out.print(newList.get(y) + " ");
	    }
	}

	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int x = i + 1; x < list.size(); x++) {
				if (list.get(i).equals(list.get(x))) {
					list.remove(x);
					x--;
				}
				else {
				}
			}
		}
		return list;
	}
}
