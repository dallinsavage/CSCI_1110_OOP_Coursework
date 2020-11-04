
public class WordOccurrence implements Comparable{
	private String word;
	private int count;
	WordOccurrence(String newWord, int newCount) {
	word = newWord;
	count = newCount;
	}
	public int getCount() {
		return count;
	}
	public String toString() {
		return word + " " + count;
	}
	@Override
	public int compareTo(Object o) {
		if (getCount() > ((WordOccurrence) o).getCount()) {
			return 1;
		}
		else if (getCount() < ((WordOccurrence) o).getCount()) {
			return -1;
		}
		else {
		return 0;	
		}
	}
}
