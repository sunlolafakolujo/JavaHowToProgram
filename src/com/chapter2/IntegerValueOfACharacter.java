package com.chapter2;
import java.util.Scanner;

/*Here’s another peek ahead. In this chapter, you learned about
integers and the type int. Java can also represent uppercase letters, lowercase letters and a considerable
variety of special symbols. Every character has a corresponding integer representation. The set
of characters a computer uses together with the corresponding integer representations for those
characters is called that computer’s character set. You can indicate a character value in a program
simply by enclosing that character in single quotes, as in 'A'.
You can determine a character’s integer equivalent by preceding that character with (int), as in
(int) 'A'
An operator of this form is called a cast operator. (You’ll learn about cast operators in Chapter 4.)
The following statement outputs a character and its integer equivalent:
System.out.printf("The character %c has the value %d%n", 'A', ((int) 'A'));
When the preceding statement executes, it displays the character A and the value 65 (from the Unicode
® character set) as part of the string. The format specifier %c is a placeholder for a character (in
this case, the character 'A').
Using statements similar to the one shown earlier in this exercise, write an application that displays
the integer equivalents of some uppercase letters, lowercase letters, digits and special symbols.
Display the integer equivalents of the following: A B C a b c 0 1 2 $ * + / and the blank character.

 */

public class IntegerValueOfACharacter {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any character: ");

        char character = sc.next().charAt(0);

        System.out.printf("%s%15s%n", "Character","Integer Value");
        System.out.printf("%c %11d%n",character,(int)character);

        sc.close();
    }
}
