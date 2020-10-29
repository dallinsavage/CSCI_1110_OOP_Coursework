import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise_20_3 {  
	public static void main(String[] args) {
	ArrayList capitalList = new ArrayList();
	String[][] stateCapital = {
			{"Alabama", "Montgomery"},
			{"Alaska", "Juneau"},
			{"Arizona", "Phoenix"},
			{"Arkansas", "Little Rock"},
			{"California", "Sacramento"},
			{"Colorado", "Denver"},
			{"Connecticut", "Hartford"},
			{"Delaware", "Dover"},
			{"Florida", "Tallahassee"},
			{"Georgia", "Atlanta"},
			{"Hawaii", "Honolulu"},
			{"Idaho", "Boise"},
			{"Illinois", "Springfield"},
			{"Indiana", "Indianapolis"},
			{"Iowa", "Des Moines"},
			{"Kansas", "Topeka"},
			{"Kentucky", "Frankfort"},
			{"Louisiana", "Baton Rouge"},
			{"Maine", "Augusta"},
			{"Maryland", "Annapolis"},
			{"Massachusettes", "Boston"},
			{"Michigan", "Lansing"},
			{"Minnesota", "Saint Paul"},
			{"Mississippi", "Jackson"},
			{"Missouri", "Jefferson City"},
			{"Montana", "Helena"},
			{"Nebraska", "Lincoln"},
			{"Nevada", "Carson City"},
			{"New Hampshire", "Concord"},
			{"New Jersey", "Trenton"},
			{"New York", "Albany"},
			{"New Mexico", "Santa Fe"},
			{"North Carolina", "Raleigh"},
			{"North Dakota", "Bismarck"},
			{"Ohio", "Columbus"},
			{"Oklahoma", "Oklahoma City"},
			{"Oregon", "Salem"},
			{"Pennsylvania", "Harrisburg"},
			{"Rhode Island", "Providence"},
			{"South Carolina", "Columbia"},
			{"South Dakota", "Pierre"},
			{"Tennessee", "Nashville"},
			{"Texas", "Austin"},
			{"Utah", "Salt Lake City"},
			{"Vermont", "Montpelier"},
			{"Virginia", "Richmond"},
			{"Washington", "Olympia"},
			{"West Virginia", "Charleston"},
			{"Wisconsin", "Madison"},
			{"Wyoming", "Cheyenne"}
			};
	Scanner input = new Scanner(System.in);
    int correctCount = 0;
    for (int x = 0; x < stateCapital.length; x++) {
    	capitalList.add(stateCapital[x][0]);
    }
    Collections.shuffle(capitalList);
    for (int i = 0; i < capitalList.size(); i++) {
    	// Prompt the user with a question
    	System.out.print("What is the capital of " + capitalList.get(i) + "? ");
    	String capital = input.nextLine().trim().toLowerCase();
    	if (capital.toLowerCase().equals(getAnswer(capitalList.get(i), stateCapital).toLowerCase())) {
    		System.out.println("Your answer is correct");
    		correctCount++;
    		}
    	else 
    		System.out.println("The correct answer should be " + getAnswer(capitalList.get(i), stateCapital));
    	}
    System.out.println("The correct count is " + correctCount);
    }
	public static String getAnswer(Object object, String[][] stateCapital) {
		String answer = "no";
		for (int i = 0; i < stateCapital.length; i++) {
			if (object.equals(stateCapital[i][0])) {
				answer = stateCapital[i][1].toString();
			}
		}
		return answer;
	}
}
