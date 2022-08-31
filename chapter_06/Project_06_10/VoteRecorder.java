package chapter_06;

import java.util.Scanner;

public class VoteRecorder
{
    private static String nameCandidatePresident1, nameCandidatePresident2;
    private static String nameCandidateVicePresident1, nameCandidateVicePresident2;
    private static int votesCandidatePresident1, votesCandidatePresident2;
    private static int votesCandidateVicePresident1, votesCandidateVicePresident2;

    private int myVoteForPresident, myVoteForVicePresident;

    public static void setCandidatesPresident(String name1, String name2)
    {
        nameCandidatePresident1 = name1;
        nameCandidatePresident2 = name2;
    }

    public static void setCandidatesVicePresident(String name1, String name2)
    {
        nameCandidateVicePresident1 = name1;
        nameCandidateVicePresident2 = name2;
    }

    public static void resetVotes()
    {
        votesCandidatePresident1 = 0;
        votesCandidatePresident2 = 0;
        votesCandidateVicePresident1 = 0;
        votesCandidateVicePresident2 = 0;
    }

    public static String getCurrentVotePresident()
    {
        return nameCandidatePresident1 + ": " + votesCandidatePresident1 + "\n"
                + nameCandidatePresident2 + ": " + votesCandidatePresident2;
    }

    public static String getCurrentVoteVicePresident()
    {
        return nameCandidateVicePresident1 + ": " + votesCandidateVicePresident1 + "\n"
                + nameCandidateVicePresident2 + ": " + votesCandidateVicePresident2;
    }

    public String getAndConfirmVotes()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a vote for President: ");
        myVoteForPresident = scanner.nextInt();

        System.out.print("Enter a vote for Vice President: ");
        myVoteForVicePresident = scanner.nextInt();

        if (confirmVotes())
            recordVotes();

        return getInfo();
    }

    private String getInfo()
    {
        return "President " +
                ((myVoteForPresident == 1) ? nameCandidatePresident1 : nameCandidatePresident2)
                + " | Vice President " +
                ((myVoteForVicePresident == 1) ? nameCandidateVicePresident1 : nameCandidateVicePresident2);
    }

    private String getAVote(String name1, String name2)
    {
        int president;
        if (name1.equals(nameCandidatePresident1))
            president = 1;
        else if (name1.equals(nameCandidatePresident2))
            president = 2;
        else
            president = 0;

        int vicePresident;
        if (name2.equals(nameCandidateVicePresident1))
            vicePresident = 1;
        else if (name2.equals(nameCandidateVicePresident2))
            vicePresident = 2;
        else
            vicePresident = 0;

        return "President --> " + president + " :: Vice President --> " + vicePresident;
    }

    private boolean confirmVotes()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getInfo());
        System.out.print("Are you happy with these votes: ");
        String answer = scanner.next().toLowerCase();
        return answer.equals("yes");
    }

    public void recordVotes()
    {
        if (myVoteForPresident == 1)
            votesCandidatePresident1++;
        else if (myVoteForPresident == 2)
            votesCandidatePresident2++;

        if (myVoteForVicePresident == 1)
            votesCandidateVicePresident1++;
        else if (myVoteForVicePresident == 2)
            votesCandidateVicePresident2++;
    }
}
