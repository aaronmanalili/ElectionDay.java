# ElectionDay.java

ElectionDay.java was part of an assignment from my Fundamentals of Programming class, and submitted on April 5, 2020

Text from Assignment:

It’s almost election day and the election officials need a program to help tally election results. There are two candidates for 
office—Polly Tichen and Ernest Orator. The program’s job is to take as input the number of votes each candidate received in 
each voting precinct and find the total number of votes for each. The program should print out the final tally for each 
candidate—both the total number of votes each received and the percent of votes each received. Clearly a loop is needed. 
Each iteration of the loop is responsible for reading in the votes from a single precinct and updating the tallies. A skeleton of 
the program is in the file Election.java. Open a copy of the program in your text editor and do the following. 
1. Add the code to control the loop. You may use either a while loop or a do...while loop. The loop must be controlled by 
asking the user whether or not there are more precincts to report (that is, more precincts whose votes need to be added 
in). The user should answer with the character y or n though your program should also allow uppercase repsonses. The 
variable response (type String) has already been declared. 
2. Add the code to read in the votes for each candidate and find the total votes. Note that variables have already been 
declared for you to use. Print out the totals and the percentages after the loop. 
3. Test your program to make sure it is correctly tallying the votes and finding the percentages AND that the loop control is 
correct (it goes when it should and stops when it should). 
4. The election officials want more information. They want to know how many precincts each candidate carried (won). Add 
code to compute and print this. You need three new variables: one to count the number of precincts won by Polly, one to 
count the number won by Ernest, and one to count the number of ties. Test your program after adding this code. 
// ************************************************************ 
// Election.java 
// 
// This file contains a program that tallies the results of 
// an election.  It reads in the number of votes for each of 
// two candidates in each of several precincts.  It determines 
// the total number of votes received by each candidate, the 
// percent of votes received by each candidate, the number of 
// precincts each candidate carries, and the 
// maximum winning margin in a precinct. 
// ************************************************************ 
import java.util.Scanner; 
public class Election {           public static void main (String[] args) { 
int votesForPolly;  // number of votes for Polly in each precinct 
int votesForErnest; // number of votes for Ernest in each precinct 
int totalPolly; // running total of votes for Polly 
int totalErnest; // running total of votes for Ernest 
String response; // answer (y or n) to the "more precincts" question 
Scanner scan = new Scanner(System.in); 
System.out.println (); 
System.out.println ("Election Day Vote Counting Program"); 
System.out.println (); 
// Initializations 
// Loop to "process" the votes in each precinct 
// Print out the results 
} 
} 
 
