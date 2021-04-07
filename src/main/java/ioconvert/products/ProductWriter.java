package ioconvert.products;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.List;

public class ProductWriter {

    public void saveProduct(OutputStream os, List<Product> products) {
        try (PrintStream outputStream = new PrintStream(
                new BufferedOutputStream(os))) {
            for (Product product : products) {
                outputStream.print(product.getName());
                outputStream.print(";");
                outputStream.print(product.getPrice());
                outputStream.println();
            }
        }
    }
}
