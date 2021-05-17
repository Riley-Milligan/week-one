package directoryscan;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class DirectoryScanApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DirVisitor dirVisitor = new DirVisitor();

        String startDir;

        System.out.println("Which directory would you like to scan?");
        startDir = input.nextLine();

        //takes the path string given by user and uses it to start walking the file tree at the given location
        try {
            Files.walkFileTree(Paths.get(startDir), dirVisitor);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
