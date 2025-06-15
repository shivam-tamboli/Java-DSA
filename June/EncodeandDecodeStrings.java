/*

NeetCode - Encode and Decode Strings

Problem:

Design an algorithm to encode a list of strings to a single string. The encoded string is then decoded back to the original list of strings.

Please implement encode and decode

Example:
Input: ["we","say",":","yes"]

Output: ["we","say",":","yes"]

*/

import java.util.*;

public class EncodeandDecodeStrings {

    
    public static String encode(List<String> strs) {
        StringBuilder encode = new StringBuilder();

        for (String str : strs) {
            // Add length + '#' + actual string.
            encode.append(str.length()).append('#').append(str);
        }

        return encode.toString();
    }

    
    public static List<String> decode(String s) {
        List<String> decode = new ArrayList<>();
	//is a pointer.
        int i = 0;

	//it runs until reaches the end of the string.
        while (i < s.length()) {
	//another pointer.	
            int j = i;
            // Find the '#' to extract length.
            while (s.charAt(j) != '#') {
                j++;
            }

	//extract length of a string.
         int length = Integer.parseInt(s.substring(i, j));
         j++; // move past '#'

	//ex - j = 2, j + length = 4,(2, 6) is a actual string.
         String str = s.substring(j, j + length);
         decode.add(str);
	
	// update i to the start of the next encoded string.
            i = j + length; 
        }

        return decode;
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("neet", "code", "love", "you");

        String encoded = encode(input);
        System.out.println("Encoded: " + encoded);//Expected output : Encoded: 4#neet4#code4#love3#you

        List<String> decoded = decode(encoded);
        System.out.println("Decoded: " + decoded);//Expected output : Decoded: [neet, code, love, you]
    }
}

/*
     * Time and Space Complexity:
     *
     * Let:
     * n = number of strings in the list
     * k = average length of each string
     * 
     * Total characters = n * k
     *
     * encode():
     * - Time: O(n * k) → we append all characters once
     * - Space: O(n * k) → to store the encoded string
     *
     * decode():
     * - Time: O(n * k) → we parse and extract all characters
     * - Space: O(n * k) → to store the decoded list
     
*/
