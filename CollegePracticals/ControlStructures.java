package CollegePracticals;

import java.util.Scanner;

public class ControlStructures {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
// IF-ELSE
System.out.print("Enter a number: ");
int num = sc.nextInt();
if (num > 0)
System.out.println("Positive");
else if (num < 0)
System.out.println("Negative");
else
System.out.println("Zero");
// SWITCH
System.out.print("Enter day number (1-7): ");
int day = sc.nextInt();
switch (day) {
case 1: System.out.println("Monday"); break;
case 2: System.out.println("Tuesday"); break;
case 3: System.out.println("Wednesday"); break;
case 4: System.out.println("Thursday"); break;
case 5: System.out.println("Friday"); break;
case 6: System.out.println("Saturday"); break;
case 7: System.out.println("Sunday"); break;
default: System.out.println("Invalid day");
}
// LOOPS
System.out.println("For Loop:");
for (int i = 1; i <= 5; i++) {
System.out.print(i + " ");
}
System.out.println("\nWhile Loop:");
int i = 1;
while (i <= 5) {
System.out.print(i + " ");
i++;
}
System.out.println("\nDo-While Loop:");
int j = 1;
do {
System.out.print(j + " ");
j++;
} while (j <= 5);

sc.close();
}   
}
