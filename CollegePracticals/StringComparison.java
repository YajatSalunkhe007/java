package CollegePracticals;

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System. out.print("Enter first string: ");
String s1 = sc.nextLine();
System. out.print("Enter second string: ");
String s2 = sc.nextLine();
// equals()
if (s1.equals(s2))
System. out.println("Strings are equal (equals).");
else
System. out.println("Strings are not equal (equals).");
// equalsIgnoreCase()
if (s1.equalsIgnoreCase(s2))
System. out.println("Strings are equal ignoring case.");
else
System. out.println("Strings are not equal ignoring case.");
// ==
if (s1 == s2)
System. out.println("Strings are equal (==).");
else
System. out.println("Strings are not equal (==).");
// compareTo
int result = s1.compareTo(s2);
if (result == 0)
System. out.println("Strings are equal (compareTo).");
else if (result > 0)
System. out.println("First string is greater.");
else
System. out.println("Second string is greater.");
sc.close();
}
}
