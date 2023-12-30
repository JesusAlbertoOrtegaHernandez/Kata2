package software.ulpgc.kata2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TsvFileCustomerLoader implements CustomerLoader {
    private final File file;

    public TsvFileCustomerLoader(File file) {
        this.file = file;
    }

    public List<Customer> load() {
        try {
            return this.load(new FileReader(this.file));
        } catch (IOException var2) {
            throw new RuntimeException(var2);
        }
    }

    private List<Customer> load(FileReader reader) throws IOException {
        return this.load(new BufferedReader(reader));
    }

    private List<Customer> load(BufferedReader reader) throws IOException {
        reader.skip(1L);
        List<Customer> customers = new ArrayList();

        while(true) {
            String line = reader.readLine();
            if (line == null) {
                return customers;
            }

            customers.add(this.toCustomer(line));
        }
    }

    private Customer toCustomer(String line) {
        return this.toCustomer(line.split("\t"));
    }

    private Customer toCustomer(String[] fields) {
        return new Customer(fields[0], fields[1], fields[2], fields[3], fields[4], fields[5], fields[6], fields[7], fields[8], fields[9], fields[10]);
    }
}