import java.nio.file.*;        // Files, Path
// import java.io.IOException;    // <-- make IOException visible

public class Exception{
static void loadConfig() {
        String str = null;
        System.out.println(str.length());
    }

    // no try/catch – we just declare that main itself may throw
    public static void main(String[] args) {
        loadConfig();                       // may throw IOException
        System.out.println("Exception Handled");  // runs only if no exception
    }
}