
public class Application {

	public static void main(String[] args) {
		RationalNumber r1 = new RationalNumber(6, 8);
        RationalNumber r2 = new RationalNumber(1, 3);
        RationalNumber r3 = new RationalNumber(3, 4);

        System.out.println("First rational number: " + r1);
        System.out.println("Second rational number: " + r2);
        System.out.println("Third rational numner: " + r3);
        
        
        RationalNumber sum = r1.add(r2);
        RationalNumber difference = r1.subtract(r2);
        RationalNumber product = r1.multiply(r2);
        RationalNumber quotient = r1.divide(r2);

        System.out.println("r1 + r2: " + sum);
        System.out.println("r1 - r2: " + difference);
        System.out.println("r1 * r2: " + product);
        System.out.println("r1 / r2: " + quotient);

        if (r1.isLike(r2)) {
            System.out.println("The numbers are equal.");
        } else {
            System.out.println("The numbers are not equal.");
        }
        
        if (r1.isLike(r3)) {
            System.out.println("The numbers are equal.");
        } else {
            System.out.println("The numbers are not equal.");
        }
        
        
        int compareResult1 = r1.compareTo(r2);
        int compareResult2 = r1.compareTo(r3);

        System.out.println("Comparison result (r1 vs. r2): " + compareResult1);
        System.out.println("Comparison result (r1 vs. r3): " + compareResult2);
	}

}
