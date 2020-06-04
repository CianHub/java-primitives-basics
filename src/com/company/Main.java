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

	}
}
