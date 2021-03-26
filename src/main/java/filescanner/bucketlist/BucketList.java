package filescanner.bucketlist;

import java.util.Scanner;

public class BucketList {

    public void readFromFile(String fileName) {
        try (Scanner scanner = new Scanner(BucketList.class.getResourceAsStream("/" + fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }
    }
}
