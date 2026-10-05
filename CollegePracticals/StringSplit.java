package CollegePracticals;

import java.util.Scanner;

public class StringSplit {
 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System. out.print("Enter a sentence: ");
String str = sc.nextLine();
String[] words = str.split(" ");
System. out.println("The words are:");
for (String w: words) {
System.out.println(w);
sc.close();
}
}   
}
