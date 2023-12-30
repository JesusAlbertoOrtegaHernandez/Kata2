package software.ulpgc.kata2;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        CustomerLoader loader = new TsvFileCustomerLoader(new File("customers-10000.txt"));
        List<Customer> customers = loader.load();
        Map<String, Integer> chart = new HashMap();
        Iterator var4 = customers.iterator();

        while(var4.hasNext()) {
            Customer customer = (Customer)var4.next();
            String country = customer.getCountry();
            chart.put(country, (Integer)chart.getOrDefault(country, 0) + 1);
        }

        var4 = chart.keySet().iterator();

        while(var4.hasNext()) {
            String key = (String)var4.next();
            System.out.println(key + ":" + String.valueOf(chart.get(key)));
        }

    }
}