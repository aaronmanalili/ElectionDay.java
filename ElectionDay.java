// Election.java
//
// This file contains a program that tallies the results of
// an election. It reads in the number of votes for each of
// two candidates in each of several precincts. It determines
// the total number of votes received by each candidate, the
// percent of votes received by each candidate, the number of
// precincts each candidate carries, and the
// maximum winning margin in a precinct.
// ************************************************************
import java.util.Scanner;
public class Election
{
 public static void main (String[] args)
{
	 
int votesForPolly; // number of votes for Polly in each precinct
int votesForErnest; // number of votes for Ernest in each precinct
int totalPolly = 0; // running total of votes for Polly
int totalErnest = 0; // running total of votes for Ernest
String response = "Y"; // answer (y or n) to the "more precincts" question
int precinctsPolly = 0; // Number of precincts won by Polly
int precinctsErnest = 0; // Number of precincts won by Ernest
int precinctsTies = 0; // Number of precincts where the results are ties

@SuppressWarnings({ "resource" })
Scanner scan = new Scanner(System.in);
System.out.println ();
System.out.println ("Election Day Vote Counting Program");
System.out.println ();
// Initializations
while(response.equals("Y")) {
	
	System.out.println("Enter the number of votes for Polly.");
	votesForPolly = scan.nextInt();
	System.out.println("Enter the number of votes for Ernest.");
	votesForErnest = scan.nextInt();
	
	
	totalPolly += votesForPolly;
	totalErnest += votesForErnest;
	
	if(votesForPolly > votesForErnest)
	{
		precinctsPolly++;
	}
	else if(votesForErnest > votesForPolly)
	{
		precinctsErnest++;
	}
	else
	{
		precinctsTies++;
	}
	
	
	System.out.println("Are there any more precincts to report? Type y for yes or n for no.");
	response = scan.next();
}
// Loop to "process" the votes in each precinct



// Print out the results

System.out.println(" Candidates: ");
System.out.println(" Polly Tichen : ");
System.out.println("Number of votes: " + totalPolly); 
System.out.println("Percentage of votes for Polly: " + (100*totalPolly/(totalPolly+totalErnest)));
System.out.println("Number of precincts won by Polly: " + precinctsPolly);
System.out.println();
System.out.println(" Ernest Orator");
System.out.println("Number of votes: " + totalErnest);
System.out.println("Percentage of votes for Ernest: " + (100*totalErnest/(totalPolly+totalErnest)));
System.out.println("Number of precincts won by Ernest: " + precinctsErnest);
System.out.println();
System.out.println("Number of precincts tied: " + precinctsTies);
}
} 
