// [ Thursday, October 7, 2021 9:52 AM ] Krishnaa: Bar Graph (Loops and Conditionals)
// Synopsis
// Write a program to read in grades and print a bar graph of their distribution.

// Details
// Write a program that behaves as follows:

// It prints an introduction, with a title, short description of the program, and your name and A-number as author.
// It pauses.
// It prompts for and reads an arbitrary number of grades, ending with any negative number (which is not a grade).
// For each of these grades it updates a counter:

// One counter for grades 80 and above.
// One counter for grades 70 to 79.
// One counter for grades 60 to 69.
// One counter for grades under 60.
// It pauses again.
// It prints out a titled bar graph showing how many grades were in each range. Each bar starts with a statement of the range (80+, 70-79, ...). It then has a vertical line ("|") followed by as many stars on it as there were grades in that range. The vertical bars must be lined up.
// It pauses one last time.
// See the sample output (linked at the top of the page) for examples of what the bar graph should look like.
import java.util.Scanner;
class GradeDistribution{
public static void main(String[] args) {
    System.out.println("Grade Distribution \n------------------");
    System.out.println("This program prints a bar graph showing the distribution of grades in a class.\n");
    System.out.println("By Kapil Bhandari (A00000000)");

    System.out.println("...press enter...↩");
    Scanner sc = new Scanner(System.in);
    String pressEnter;
    pressEnter=sc.nextLine();
    System.out.println("Enter the grades below, ending with a negative number:");

    int score;
    score = sc.nextInt();

    String starA = "";
    String starB = "";
    String starC = "";
    String starD = "";
    while(score >= 0){
        if(score >= 80){
            starA += "*";
        }else if(score >= 70 && score <= 79){
            starB += "*";
        }else if(score >=60 && score <=69){
            starC+= "*";
        }else if(score >=0 && score <=59){
            starD+="*";
        }

        score = sc.nextInt();
    }
    System.out.println("...press enter...↩");
    pressEnter = sc.nextLine();
    System.out.println("Distribution");

    System.out.println("80+   |"+ starA);
    System.out.println("70-79 |" + starB);
    System.out.println("60-69 |" +starC);
    System.out.println("0-59 |" +starD);
    
    System.out.println("...press enter...");
    pressEnter = sc.nextLine();
}
}
