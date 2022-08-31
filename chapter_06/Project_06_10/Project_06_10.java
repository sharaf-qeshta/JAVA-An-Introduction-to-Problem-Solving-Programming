package chapter_06;

/**
 * 10. Write a program that will record the votes for one of two candidates by
 * using the class VoteRecorder, which you will design and create. Vote
 * Recorder will have static variables to keep track of the total votes for
 * candidates and instance variables to keep track of the votes made by a
 * single person. It will have the following attributes:
 * • nameCandidatePresident1—a static string that holds the name of the
 * first candidate for president
 * • nameCandidatePresident2—a static string that holds the name of the
 * second candidate for president
 * • nameCandidateVicePresident1—a static string that holds the name of
 * the first candidate for vice president
 * • nameCandidateVicePresident2—a static string that holds the name of
 * the second candidate for vice president
 * • votesCandidatePresident1—a static integer that holds the number of
 * votes for the first candidate for president
 * • votesCandidatePresident2—a static integer that holds the number of
 * votes for the second candidate for president
 * • votesCandidateVicePresident1—a static integer that holds the
 * number of votes for the first candidate for vice president
 * • votesCandidateVicePresident2—a static integer that holds the
 * number of votes for the second candidate for vice president
 * • myVoteForPresident—an integer that holds the vote of a single
 * individual for president (0 for no choice, 1 for the first candidate, and 2
 * for the second candidate)
 * • myVoteForVicePresident—an integer that holds the vote of a single
 * individual for vice president (0 for no choice, 1 for the first candidate,
 * and 2 for the second candidate)
 * In addition to appropriate constructors, VoteRecorder has the following
 * methods:
 * • setCandidatesPresident(String name1, String name2)—a static
 * method that sets the names of the two candidates for president
 * • setCandidatesVicePresident(String name1, String name2)—a
 * static method that sets the names of the two candidates for vice president
 * • resetVotes—a static method that resets the vote counts to zero
 * • getCurrentVotePresident—a static method that returns a string with
 * the current total number of votes for both presidential candidates
 * • getCurrentVoteVicePresident—a static method that returns a string
 * with the current total number of votes for both vice presidential
 * candidates
 * • getAndConfirmVotes—a non-static method that gets an individual’s
 * votes, confirms them, and then records them
 * • getAVote(String name1, String name2)—a private method that
 * returns a vote choice for a single race from an individual (0 for no
 * choice, 1 for the first candidate, and 2 for the second candidate)
 * • getVotes—a private method that returns a vote choice for president and
 * vice president from an individual
 * • confirmVotes—a private method that displays a person’s vote for
 * president and vice president, asks whether the voter is happy with these
 * choices, and returns true or false according to a yes-or-no response
 * • recordVotes—a private method that will add an individual’s votes to
 * the appropriate static variables
 * Create a program that will conduct an election. The candidates for president
 * are Annie and Bob. The candidates for vice president are John and Susan.
 * Use a loop to record the votes of many voters. Create a new Vote Recorder
 * object for each voter. After all the voters are done, present the results.
 *
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_06_10
{
    public static void main(String[] args)
    {
        VoteRecorder.setCandidatesPresident("Annie", "Bob");
        VoteRecorder.setCandidatesVicePresident("John", "Susan");

        for (int i = 0; i < 10; i++)
            new VoteRecorder().getAndConfirmVotes();

        System.out.println(VoteRecorder.getCurrentVotePresident());
        System.out.println(VoteRecorder.getCurrentVoteVicePresident());
    }
}
