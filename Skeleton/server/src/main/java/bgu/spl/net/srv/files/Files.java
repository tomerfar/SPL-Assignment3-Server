import java.util.concurrent.ConcurrentHashMap;

public class Files {

    private ConcurrentHashMap<String, ?> files = new ConcurrentHashMap<>();

    public T download(String fileName) {
        // need to implement 
    }

    public void upload(String fileName, T file) {
        
    }

    public void delete(String fileName) {
       files.remove(fileName);
    }

    public List<String> listFiles() {

    }

}