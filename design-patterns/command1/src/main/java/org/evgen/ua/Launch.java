package org.evgen.ua;

public class Launch {

    public static void main(String[] args) {
        File file = new File("text.txt");
        Command command1 = new DownloadFile(file);
        Command command2 = new CleanFile(file);
        ThreadWorker threadWorker = new ThreadWorker(command1);
        threadWorker.run();
        threadWorker.setCommand(command2);
        threadWorker.run();
    }
}
