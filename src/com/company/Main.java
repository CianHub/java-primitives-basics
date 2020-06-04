package com.company;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;

	    // 32bits
	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;
	    System.out.println("Min = " + myMinIntValue + " Max = " + myMaxIntValue);

	    // 8bits
	    byte myMinByteValue = Byte.MIN_VALUE;
	    byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Min = " + myMinByteValue + " Max = " + myMaxByteValue);

		// 16bits
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("Min = " + myMinShortValue + " Max = " + myMaxShortValue);

		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		System.out.println("Min = " + myMinLongValue + " Max = " + myMaxLongValue);

		long bigLong = 2147483647 + 1L;
		System.out.println(bigLong);

		short bigShort = 32767;

		int myTotal = (myMinIntValue / 2);

		// int is assumed by default have to cast to another type
		byte myNewByteValue = (byte) (myMinByteValue / 2);

		short myNewShortValue = (short) (myMinShortValue / 2);

		byte myByte = 126;

		short myShort = 32767;

		int myInt = 100;

		long myLong = (50000L + ((myByte + myInt + myShort) * 10L));

		System.out.println(myLong);

		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		System.out.println(myMaxFloatValue);
		System.out.println(myMinFloatValue);

		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		System.out.println(myMaxDoubleValue);
		System.out.println(myMinDoubleValue);

		int myNewIntVal = 5;
		float myFloat = 5.25f; // add an f after a float or cast, double is default
		double myDouble = 5d; // add a d after a double




	}
}
