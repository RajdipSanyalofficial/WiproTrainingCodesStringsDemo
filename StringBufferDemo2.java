/**
 *
 */

package stringsdemo;

public class StringBufferDemo2 {

    public static void main(String[] args)
    {
        // Create a StringBuffer object with an initial capacity
        StringBuffer sb = new StringBuffer(50);

        // Display the initial capacity
        System.out.println("Initial capacity: " + sb.capacity());

        // Append text
        sb.append("Java Programming");
        System.out.println("After append: " + sb.toString());

        // Display the current length and capacity
        System.out.println("Current length: " + sb.length());
        System.out.println("Current capacity: " + sb.capacity());

        // Ensure capacity
        sb.ensureCapacity(100);
        System.out.println("Capacity after ensuring 100: " + sb.capacity());

        // Append more text
        sb.append(" is fun and powerful.");
        System.out.println("After appending more text: " + sb.toString());

        // Get character at a specific index
        char charAt = sb.charAt(5);
        System.out.println("Character at index 5: " + charAt);

        // Set character at a specific index
        sb.setCharAt(5, 'p');
        System.out.println("After setting character at index 5: " + sb.toString());

        // Get substring from StringBuffer
        String substring = sb.substring(5, 16);
        System.out.println("Substring from index 5 to 16: " + substring);

        // Delete characters from StringBuffer
        sb.delete(5, 16);
        System.out.println("After deleting characters from index 5 to 16: " + sb.toString());

        // Insert text at a specific position
        sb.insert(5, " is");
        System.out.println("After insertion: " + sb.toString());

    }
}
