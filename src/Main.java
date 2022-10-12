import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = scan.nextLine();

        int length1 = first.length();
        System.out.println("String Length: " + length1);
        System.out.println("First half: " + first.substring(0,length1/2));
        System.out.println("Second half: " + first.substring(length1/2));

        System.out.print("Enter second string: ");
        String second = scan.nextLine();
        int length2 = second.length();

        if (length1>length2){
            System.out.println(first + " is longer");
        } else if (length1<length2){
            System.out.println(second + " is longer");
        } else{
            System.out.println("Both strings have the same length");
        }

        if (first.equals(second)){
            System.out.println("Both strings have the exact same characters");
        } else{
            if (first.compareTo(second)>0) {
                System.out.println(second + " is first alphabetically");
            }else{
                System.out.println(first + " is first alphabetically");
            }
        }

        int index = first.indexOf(second);
        if (index == -1){
            System.out.println(second + " is NOT found in " + first);
        } else{
            System.out.println(second + " is found in " + first + " at index " + index);
        }
    }
}
