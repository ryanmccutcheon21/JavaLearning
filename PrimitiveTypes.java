class Main {
    public static void main(String[] args) {
        // package academy.learnprogramming;

        // Primitive Types
        // int
        // byte
        // short
        // long
        // float
        // double

        // int myValue = 10000;
        // see the range for int data type
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        // Ineger Minimum Value = -2147483648
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        // Ineger Maximum Value = 2147483647
        System.out.println("Busted Maximum Value = " + (myMaxIntValue + 1));
        // Busted Maximum Value = -2147483648
        // This is called Overflow
        // can do same with min value by subtracting 1

        // Byte
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        // Byte Minimum Value = -128
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        // Byte Maximum Value = 127

        // Short
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        // Short Minimum Value = -32768
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        // Short Maximum Value = 32767

        // A byte occupies 8 bits
        // byte has a width of 8

        // A short occupies 16 bits, and has a width of 16

        // An int occupies 32 bits, and has a width of 32
        // An int takes up 4 times the amount of data space as a byte

        // For numbers bigger than an int, use long
        // long occupies 64 bits
        // notice the letter L after the number
        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long minimum value = " + myMinLongValue);
        // Long minimum value = -9223372036854775808
        System.out.println("Long maximum value = " + myMaxLongValue);
        // Long maximum value = 9223372036854775807

        // Casting in Java
        int myTotal = (myMinIntValue / 2);
        // no error
        // byte myNewByteValue = (myMinByteValue / 2);
        // we get an error because default whole number in Java is an int
        // so it is trying to divide by an int when a byte is required
        // so we need to tell Java to treat it as a byte using 'casting'
        // to do this, we need to put the data type in parenthesis before
        // the expression like this
        byte myNewNewByteValue = (byte) (myMinByteValue / 2);
        // now the error disappears

        // can do the same with other data types
        short myNewShortValue = (short) (myMinShortValue / 2);

        // Challenge
        byte challengeByte = 100;
        short challengeShort = 32000;
        int challengeInt = 2000000;
        long challengeLong = 50000L + 10L * (challengeByte + challengeShort + challengeInt);

        // Floats and doubles
        // Float is a single precision number
        // double is a double precision number
        // precision refers to the format and amount of
        // space occupied by the type
        // Single precision occupies 32 bits
        // Double precision occupies 64 bits

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum vlaue = " + myMinFloatValue);
        // Float minimum vlaue = 1.4E-45
        System.out.println("Float maximum value = " + myMaxFloatValue);
        // Float maximum value = 3.4028235E38

        double myMinDoubleVaue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleVaue);
        // Double minimum value = 4.9E-324
        System.out.println("Double maximum value = " + myMaxDoubleValue);
        // Double maximum value = 1.7976931348623157E308

        int myIntValue = 5;
        float myFloatValue = 5.25f;
        double myDoubleValue = 5.25d;
        // double is accepted as default for decimal numbers

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        // Challenge: convert lbs to kilograms
        double pounds = 230;
        double kilograms = pounds * 0.45359237;
        System.out.println(kilograms);

        // Char data type
        // char myChar = 'D';
        // can only store a single character
        // occupies two bytes of memory, or 16 bits
        // not a sinlge byte because you can also store Unicode
        // characters
        // can use Unicode for the character
        // char myUnicodeChar = "\u0044";
        // System.out.println(myChar);
        // System.out.println(myUnicodeChar);

        // Boolean data type
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverEighteen = true;

        // String
        // Not a primitive type
        // It is of type Class
        String myString = "This is a string.";
        System.out.println(myString);

        // If-then statement
        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("it is not an alien!");

        }

        // Challenge
        double chalDouble = 20.00;
        double chalDouble2 = 80.00;
        double chalDouble3 = (chalDouble + chalDouble2) * 100;
        double chalResult = chalDouble3 % 40.00;

        boolean chalBool = chalResult == 0 ? true : false;
        System.out.println(chalBool);
        if (!chalBool) {
            System.out.println("Got some remainder");
        }
    }
}