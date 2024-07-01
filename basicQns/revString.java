package basicQns;

public class revString {
    public static boolean palindrome(String str) {
        String cleanString = str.replace("['^A-Za-z0-9']", " ").toLowerCase();
        String reversetring = new StringBuilder(cleanString).reverse().toString(); // this is object

        return cleanString.equals(reversetring); // equals=Compares this string to the specified object. The result is
                                                 // true if and only if the argument is not null and is a String object
                                                 // that represents the same sequence of characters as this object.
    }

    public static void main(String[] args) {
        String str1 = "mam";
        String str2 = "man";
        if (palindrome(str1)) {
            System.out.println("is  a palindrome");
        } else {
            System.out.println("is not  a palindrome");
        }

        if (palindrome(str2)) {
            System.out.println("is  a palindrome");
        } else {
            System.out.println("is not  a palindrome");
        }
    }
}
