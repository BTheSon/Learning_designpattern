package vn.edu.qnu.example.singleton;

public class PrintSpooler {
    private static  PrintSpooler instance;
    private PrintSpooler(){
        init();
    }

    private void init() {
        System.out.println("print spooler has been create");
    }

    public static PrintSpooler getInstance() {
        if (instance == null)
            instance = new PrintSpooler();

        return instance;
    }

    public void printDocs(String content) {
        System.out.println("Đang in: " + content);
    }

}
