
public class CleanFile implements Command {

    private File file;

    public CleanFile(File file){
        this.file = file;
    }

    public void execute() {
        clean();
    }

    private void clean() {
        System.out.println("Cleaning file : " + file.getName());
    }

    public void setFile(File file) {
        this.file = file;
    }
}
