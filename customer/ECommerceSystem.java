package customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ECommerceSystem {
    public static void main(String[] args) {

        Customer c1 = new Customer("C001", "Anna", "anna@mail.com");
        Customer c2 = new Customer("C002", "Davit", "davit@mail.com");
        Customer c3 = new Customer("C003", "Babken", "babken@mail.com");


        List<Order> orders = new ArrayList<>();
        orders.add(new Order("O1", "Laptop", c2));
        orders.add(new Order("O2", "Phone", c1));
        orders.add(new Order("O3", "Book", c2));
        orders.add(new Order("O4", "Headphones", c3));
        orders.add(new Order("O5", "Mouse", c1));
        orders.add(new Order("O6", "Keyboard", c1));

        // ԽՆԴՐԻ ՄԱՍ 1: Որ հաճախորդը քանի պատվեր ունի

        Map<Customer, Integer> customerOrderCountMap = new HashMap<>();
        System.out.println(" Մաս 1");
        for (Order order : orders) {
            Customer customer = order.getCustomer();
            customerOrderCountMap.put(customer, customerOrderCountMap.getOrDefault(customer, 0) + 1);
        }

        for (Map.Entry<Customer, Integer> entry : customerOrderCountMap.entrySet()) {
            System.out.println(entry.getKey() + " -> Պատվերների քանակը: " + entry.getValue());
        }

        // ԽՆԴՐԻ ՄԱՍ 2: Սորտավորված ըստ հաճախորդի անունի (TreeMap)
        Map<Customer, Integer> sortedCustomerOrders = new TreeMap<>(customerOrderCountMap);

        System.out.println(" Մաս 2");
        for (Map.Entry<Customer, Integer> entry : sortedCustomerOrders.entrySet()) {
            System.out.println("Customer: " + entry.getKey().getName() + " | Order: " + entry.getValue());
        }
    }
}