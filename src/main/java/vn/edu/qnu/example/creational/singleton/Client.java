package vn.edu.qnu.example.creational.singleton;

public class Client {
    public static void main(String[] args) {
        PrintSpooler printSpooler = PrintSpooler.getInstance();
        printSpooler.printDocs("Sách giáo khoa khóa 36");
    }
}
