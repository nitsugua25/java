package TP6.composite;

public class Main {
    public static void main(String[] args) {
        Component file1 = new File("file1");
        Component file2 = new File("file2");
        Directory directory1 = new Directory("directory1");
        Directory directory2 = new Directory("directory2");
        Directory directory3 = new Directory("directory3");
        directory1.add(file1);
        directory2.add(directory1);
        directory2.add(directory3);
        directory2.add(file2);
        System.out.println(directory2.execute());
    }
}
