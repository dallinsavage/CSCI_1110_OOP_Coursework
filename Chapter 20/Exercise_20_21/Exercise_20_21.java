import java.util.Comparator;

public class Exercise_20_21 {
  public static void main(String[] args) {
    GeometricObject[] list = {new Circle(5), new Rectangle(4, 5),
        new Circle(5.5), new Rectangle(2.4, 5), new Circle(0.5), 
        new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1),
        new Circle(6.5), new Rectangle(4, 5)};

    selectionSort(list, new GeometricObjectComparator());
    for (int i = 0; i < list.length; i++)
      System.out.println(list[i].getArea() + " ");
  }
  public static <E> void selectionSort(E[] list, Comparator<? super E> comparator) {
	  for (int i = 0; i < list.length - 1; i++) {
		  E currentMin = list[0];
		  int currentMinIndex = i;
		  for (int j = i + 1; j < list.length; j++) {
			  if (comparator.compare(currentMin, list[j]) > 0) {
				  currentMin = list[j];
				  currentMinIndex = j;
			  }
			  else {
			  }
		  }
		  if (currentMinIndex != i) {
			  list[currentMinIndex] = list[i];
			  list[i] = currentMin;
		  }
	  }
  }
}