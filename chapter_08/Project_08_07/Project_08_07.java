package chapter_08;

import java.util.Arrays;

/**
 * 7. Modify the Student class in Listing 8.2 so that it implements the
 * Comparable interface. Define the compareTo method to order Student
 * objects based on the value in studentNumber. In a main method create an
 * array of at least five Student objects, sort them using Arrays.sort, and
 * output the students. They should be listed by ascending student number.
 * Next, modify the compareTo method so it orders Student objects based on
 * the lexicographic ordering of the name variable. Without modification to
 * the main method, the program should now output the students ordered by
 * name.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_08_07
{
    public static void main(String[] args)
    {
        Student[] students = new Student[5];
        students[0] = new Student("John Smith", 16);
        students[1] = new Student("Sharaf Qeshta", 22);
        students[2] = new Student("Robert Garcia", 9);
        students[3] = new Student("Brian White", 15);
        students[4] = new Student("Alvin Palmer", 21);
        Arrays.sort(students);

        for (Student student : students)
            student.writeOutput();
    }
}
