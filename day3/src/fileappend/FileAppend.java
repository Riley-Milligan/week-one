package fileappend;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class FileAppend {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String fileToEdit = "";
        String textToAppend = "";

        System.out.println("What is the absolute path to the file that you would like to add text to?");
        fileToEdit = input.nextLine();

        System.out.println("What would you like to write on the end of this file?");
        textToAppend = input.nextLine() + "\n";

        try {
            Files.write(Paths.get(fileToEdit), textToAppend.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("It looks like something went wrong.  Please make sure that you put in the correct path to your file.");
            e.printStackTrace();
        }
    }
}
