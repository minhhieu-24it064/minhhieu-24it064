package chuong7;

import java.util.Date;

public class BeautySalon {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice");
        customer.setMemberType("Gold");
        
        Visit visit = new Visit(customer, new Date());
        visit.setServiceExpense(100);
        visit.setProductExpense(50);
        
        System.out.println(visit);
    }
}
