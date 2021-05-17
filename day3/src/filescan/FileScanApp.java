package filescan;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileScanApp {

    public static void main(String[] args) {

        String fileToScan;
        Character charToSearch;
        String scanLine;
        Integer characterCount = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("What file would you like to scan?");
        fileToScan = input.nextLine();

        System.out.println("What character would you like to count?");
        charToSearch = input.next().charAt(0);

        //uses resource buffered reader to go line by line through the file, and counts how many times the given character occurs in that file
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileToScan))) {

            while ((scanLine = bufferedReader.readLine()) != null) {
                if (scanLine.contains(charToSearch.toString())) {
                    for (Character c : scanLine.toCharArray()) {
                        if (charToSearch == Character.toUpperCase(c) || charToSearch == Character.toLowerCase(c)) {
                            characterCount++;
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //and lets us know how many times that is
        System.out.println("The character " + charToSearch + " occurs " + characterCount + " times in " + fileToScan + ".");
    }
}
