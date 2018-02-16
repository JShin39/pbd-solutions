public class NumbersAndMath
{
	public static void main(String[] args)
	{
		// prints a statement
		System.out.println("I will now count my chickens:");

		// prints "Hens" and divides 30 by 6 and adds the result (5) to 25, resulting 30
		System.out.println("Hens " + (25.0 + 30.0 / 6.0));
		// prints "Roosters" and multiplies 25 by 3 and does 75 % 4, then subtracts 100 -3, which finally results 97
		System.out.println("Roosters " + (100.0 - 25.0 * 3.0 % 4.0));

		// prints a statement
		System.out.println("Now I will count the eggs:");

		// divides 1 by 4 then adds 3, 2, 1, 4%2, 6 and subtracts 5, 1
		System.out.println(3.0 + 2.0 + 1.0 - 5.0 + 4.0 % 2.0 - 1.0 / 4.0 + 6.0);

		// adds 3 by 2 on one side and subtracts 5 by 7 and prints a comparing statement
		System.out.println("Is it true that 3.0 + 2.0 < 5.0 - 7.0?");

		// since 5 is not less than -2, it outputs false
		System.out.println(3.0 + 2.0 < 5.0 - 7.0);

		// adds 3 by 2 and prints a statement using the resulted number
		System.out.println("What is 3 + 2? " + (3.0 + 2.0));
		// subtracts 5 by 7 and prints a statement  using the resulted number
		System.out.println("What is 5 - 7? " + (5.0 - 7.0));

		// prints a statement
		System.out.println("Oh, that's why it's false.");
		// prints a statement
		System.out.println("How about some more.");

		// outputs true because 5 is greater than -2
		System.out.println("Is it greater? " + (5.0 > -2.0));
		// outputs true because 5 is greater than -2
		System.out.println("Is it greater or equal? " + (5.0 >= -2.0));
		// outputs false because 5 is not equal or less than -2
		System.out.println("Is it less or equal? " + (5.0 <= -2.0));
	}
}

// float point number is a number that has no fixed number of digits before and after the decimal point
