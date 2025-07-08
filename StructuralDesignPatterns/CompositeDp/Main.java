public class Main {
    public static void main(String[] args) {

        FileSystem file1 = new File("After 1");
        Directory directory1 = new Directory("Box 1");
        FileSystem file2 = new File("After 2");
        Directory parentDirectory = new Directory("Parent");
        directory1.add(file1);
        parentDirectory.add(file2);
        parentDirectory.add(directory1);
        parentDirectory.ls();
    }
}