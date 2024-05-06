import java.io.File;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class practical_36 {
    public static void main(String[] args) {
        String directoryPath = "D:/MyPack";
        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println("File name: " + file.getName());
                    System.out.println("File path: " + file.getAbsolutePath());
                    System.out.println("File size: " + file.length() + " bytes");
                    try {
                        Path filePath = Paths.get(file.getAbsolutePath());
                        BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);
                        System.out.println("Creation time: " + attributes.creationTime());
                        System.out.println("Last modified time: " + attributes.lastModifiedTime());
                        System.out.println("Last accessed time: " + attributes.lastAccessTime());
                        System.out.println("Is directory: " + attributes.isDirectory());
                        System.out.println("Is regular file: " + attributes.isRegularFile());
                        System.out.println("Is symbolic link: " + attributes.isSymbolicLink());
                        System.out.println();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            System.out.println("The directory does not exist or is not a directory.");
        }
    }
}
