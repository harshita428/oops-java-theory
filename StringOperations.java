package Com.Sample;

import java.util.Arrays;

public class StringOperations {

    /**
     * Compares two strings for equality.
     *
     * @param s1 The first string.
     * @param s2 The second string.
     * @return true if the strings are equal, false otherwise.
     */
    public static boolean compareStrings(String s1, String s2) {
        return s1.equals(s2);
    }

    /**
     * Concatenates two strings.
     *
     * @param s1 The first string.
     * @param s2 The second string.
     * @return The concatenated string.
     */
    public static String concatenateStrings(String s1, String s2) {
        return s1 + s2;
    }

    /**
     * Returns the length of a string.
     *
     * @param s The string.
     * @return The length of the string.
     */
    public static int getStringLength(String s) {
        return s.length();
    }

    /**
     * Retrieves the character at a specific 1D index of a string.
     *
     * @param s The string.
     * @param index The index of the character to retrieve.
     * @return The character at the specified index.
     * @throws StringIndexOutOfBoundsException if the index is out of bounds.
     */
    public static char getCharacterAtIndex(String s, int index) {
        return s.charAt(index);
    }

    /**
     * Retrieves the character at a specific 2D index.
     * This is useful for an array of strings.
     *
     * @param stringArray The array of strings.
     * @param rowIndex The index of the string in the array.
     * @param colIndex The index of the character in the string.
     * @return The character at the specified 2D index.
     * @throws IndexOutOfBoundsException if either index is out of bounds.
     */
    public static char getCharacterAt2DIndex(String[] stringArray, int rowIndex, int colIndex) {
        return stringArray[rowIndex].charAt(colIndex);
    }

    /**
     * Slices a portion of a string.
     *
     * @param s The string to slice.
     * @param startIndex The beginning index, inclusive.
     * @param endIndex The ending index, exclusive.
     * @return The sliced substring.
     * @throws StringIndexOutOfBoundsException if the indices are out of bounds.
     */
    public static String sliceString(String s, int startIndex, int endIndex) {
        return s.substring(startIndex, endIndex);
    }

    /**
     * Reverses a string.
     *
     * @param s The string to reverse.
     * @return The reversed string.
     */
    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    /**
     * Replaces all occurrences of a character in a string with another character.
     *
     * @param s The string.
     * @param oldChar The character to be replaced.
     * @param newChar The character to replace with.
     * @return The new string with all replacements made.
     */
    public static String replaceCharacters(String s, char oldChar, char newChar) {
        return s.replace(oldChar, newChar);
    }

    public static void main(String[] args) {
        // Sample strings for demonstration
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Hello";

        System.out.println("1. String Comparison:");
        System.out.println("Are '" + str1 + "' and '" + str2 + "' equal? " + compareStrings(str1, str2));
        System.out.println("Are '" + str1 + "' and '" + str3 + "' equal? " + compareStrings(str1, str3));
        System.out.println();

        System.out.println("2. String Concatenation:");
        String concatenated = concatenateStrings(str1, " " + str2);
        System.out.println("Result of concatenation: " + concatenated);
        System.out.println();

        System.out.println("3. String Length:");
        System.out.println("Length of '" + concatenated + "': " + getStringLength(concatenated));
        System.out.println();

        System.out.println("4. Indexing:");
        // 1D Indexing
        System.out.println("Character at index 1 of '" + str1 + "': " + getCharacterAtIndex(str1, 1));
        
        // 2D Indexing (with an array of strings)
        String[] sentence = {"Java", "is", "fun"};
        System.out.println("Character at index [1][0] of " + Arrays.toString(sentence) + ": " + getCharacterAt2DIndex(sentence, 1, 0));
        System.out.println();

        System.out.println("5. Slicing:");
        String sliced = sliceString(concatenated, 6, 11);
        System.out.println("Sliced from '" + concatenated + "': " + sliced);
        System.out.println();

        System.out.println("6. Reversing a String:");
        String reversed = reverseString(str1);
        System.out.println("Reverse of '" + str1 + "': " + reversed);
        System.out.println();

        System.out.println("7. Replacing Characters:");
        String replaced = replaceCharacters("banana", 'a', 'o');
        System.out.println("Original: 'banana', Replaced 'a' with 'o': " + replaced);
        System.out.println();
    }
}
