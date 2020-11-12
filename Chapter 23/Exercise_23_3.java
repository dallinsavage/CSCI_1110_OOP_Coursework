import java.util.Comparator;

public class Exercise_23_3 {
  public static void main(String[] args) {
    Integer[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    quickSort(list);
    for (int i = 0; i < list.length; i++) {
      System.out.print(list[i] + " ");
    }

    System.out.println();
    Circle[] list1 = {new Circle(2), new Circle(3), new Circle(2),
                     new Circle(5), new Circle(6), new Circle(1), new Circle(2),
                     new Circle(3), new Circle(14), new Circle(12)};
    quickSort(list1, new GeometricObjectComparator());
    for (int i = 0; i < list1.length; i++) {
      System.out.println(list1[i] + " ");
    }
  }
  public static <E extends Comparable<E>> void quickSort(E[] list) {
	  E pivot = list[0];
	  int low = 1;
	  int high = list.length - 1;
	  while (high > low) {
		  while (low <= high && pivot.compareTo(list[low]) >= 0) {
			  low++;
		  }
		  while (low <= high && pivot.compareTo(list[high]) < 0) {
			  high--;
		  }
		  if (high > low) {
			  E temp = list[high];
			  list[high] = list[low];
			  list[low] = temp;
		  }
	  }
	  if (pivot.compareTo(list[high]) > 0) {
		  list[0] = list[high];
		  list[high] = pivot;
	  }
  }
  public static <E> void quickSort(E[] list, Comparator<? super E> comparator) {
	  E pivot = list[0];
	  int low = 1;
	  int high = list.length - 1;
	  while (high > low) {
		  while (low <= high && comparator.compare(pivot, list[low]) >= 0) {
			  low++;
		  }
		  while (low <= high && comparator.compare(pivot, list[high]) < 0) {
			  high--;
		  }
		  if (high > low) {
			  E temp = list[high];
			  list[high] = list[low];
			  list[low] = temp;
		  }
	  }
	  if (comparator.compare(pivot, list[high]) > 0) {
		  list[0] = list[high];
		  list[high] = pivot;
	  }
  }
}