package ioreadbytes.byteacount;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ByteChecker {

    public int readBytesAndFindAs(String fileName) {
        int numberOfAs = 0;
        Path path = Path.of(fileName);
        try {
          String content = Files.readString(path);
          for (char c : content.toCharArray()) {
              if (c == 'a') {
                  numberOfAs++;
              }
          }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);}
        return numberOfAs;
    }
}
