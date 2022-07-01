package chapter_04;

import java.util.Scanner;

/**
 * 16. Imagine a program that compresses files by 80 percent and stores them
 * on storage media. Before the compressed file is stored, it must be divided
 * into blocks of 512 bytes each. Develop an algorithm for this program
 * that first reads the number of blocks available on the storage media.
 * Then, in a loop, read the uncompressed size of a file and determine
 * whether the compressed file will fit in the space left on the storage
 * media. If so, the program should compress and save the file. It continues
 * until it encounters a file that will exceed the available space on the
 * media.
 *
 * For example, suppose the media can hold 1000 blocks. A file of size
 * 1100 bytes will compress to size 880 and require 2 blocks. The available
 * space is now 998 blocks. A file of size 20,000 bytes will compress to size
 * 16,000 and require 32 blocks. The available space is now 966.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_04_16
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many blocks the media have: ");
        int blocks = scanner.nextInt();

        while (blocks > 0)
        {
            System.out.print("Enter the file size in bytes: ");
            double fileSize = scanner.nextInt();

            // compression
            fileSize = fileSize * 0.8;
            System.out.println("File size after compression " + fileSize + " bytes");

            // store the file
            int blocksNeeded = (int) Math.ceil(fileSize/512);
            if (blocks - blocksNeeded >= 0)
            {
                System.out.println("The file can be stored in the media and need " + blocksNeeded + " blocks");
                blocks -= blocksNeeded;
            }
            else
                System.out.println("The file cannot be stored on the media");
            System.out.println("the remaining storage on the media " + blocks + " blocks");
        }
    }
}
