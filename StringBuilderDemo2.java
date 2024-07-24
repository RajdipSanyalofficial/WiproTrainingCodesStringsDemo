/**
 * Java Program demonstrating how to use StringBuilder to format and build a
 *  string representation of user data in a hypothetical user management system.
 */


package stringsdemo;

public class StringBuilderDemo2 {

    public static void main(String[] args)
    {
        // User data
        String[] names = {"John Doe", "Jane Smith", "Emily Davis","Raj GS","Rajdip Sanyal"};
        int[] ages = {30, 25, 35,39,25};
        String[] emails = {"john@example.com", "jane@example.com", "emily@example.com","raj@test.com","Rajdip@gmail.com"};

        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder();

        // Build a formatted string for each user
        for (int i = 0; i < names.length; i++) {
            sb.append("User ").append(i+1).append(":\n").append("\t")
                    .append("Name: ").append(names[i]).append("\n").append("\t")
                    .append("Age: ").append(ages[i]).append("\n").append("\t")
                    .append("Email: ").append(emails[i]).append("\t")
                    .append("Email: ").append(emails[i]).append("\n")
                    .append("\n"); //Adding new line for Separation
        }

        //Display the final formatted String
        System.out.println(sb);
    }
}
