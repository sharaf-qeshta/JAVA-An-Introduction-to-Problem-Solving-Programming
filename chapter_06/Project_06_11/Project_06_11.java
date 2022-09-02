package chapter_06;

/**
 * 11. Repeat Programming Project 10 from Chapter 5, but include
 * constructors.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_06_11
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
