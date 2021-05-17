package directoryscan;

import java.nio.file.FileVisitResult;
import static java.nio.file.FileVisitResult.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class DirVisitor extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attributes) {
        //for each file visited, souts the path as a string
        Path path = Paths.get(file.toString());
        String absolutePath = path.toAbsolutePath().toString();
        System.out.println(absolutePath);

        return CONTINUE;
    }
}
