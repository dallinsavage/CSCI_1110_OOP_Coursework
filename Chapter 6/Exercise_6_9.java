/* Dallin Savage
 * 8/3/20
 * imperial and metric conversions
 */
public class Exercise_6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Feet   Meters    Meters    Feet");
		double y = 20;
		for (double x = 1; x <= 10; x++) {
			System.out.printf(x + "    " + "%4.3f" + "    " + y + "    " + "%4.3f \n", footToMeter(x), meterToFoot(y));
			y += 5;
		}
	}
	public static double footToMeter(double foot) {
		double meter = foot * 0.305;
		return meter;		
	}
	public static double meterToFoot(double meter) {
		double foot = meter * 3.279;
		return foot;
	}

}
