package OpenClosed.LoggerFiles;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {
    String fileName;

    public FileLogger(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void log(String message) {
        try(FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(message + System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
