
public class DownloadFile implements Command {

    private File file;

    public DownloadFile(File file){
        this.file = file;
    }

    public void execute() {
        download();
    }

    private void download() {
        System.out.println("Downloading file : " + file.getName());
    }

    public void setFile(File file) {
        this.file = file;
    }
}
