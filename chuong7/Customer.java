package chuong7;
import java.util.Date;
class Customer {
    private String name;
    private boolean member = false;
    private String memberType;

    public Customer(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public boolean isMember() {
        return member;
    }
    public void setMember(boolean member) {
        this.member = member;
    }
    public String getMemberType() {
        return memberType;
    }
    public void setMemberType(String type) {
        this.memberType = type;
        this.member = true;
    }
    @Override
    public String toString() {
        return "Customer[name=" + name + ", member=" + member + ", memberType=" + memberType + "]";
    }
}

class DiscountRate {
    private static final double serviceDiscountPremium = 0.2;
    private static final double serviceDiscountGold = 0.15;
    private static final double serviceDiscountSilver = 0.1;
    private static final double productDiscountPremium = 0.1;
    private static final double productDiscountGold = 0.1;
    private static final double productDiscountSilver = 0.1;

    public static double getServiceDiscountRate(String type) {
        switch (type) {
            case "Premium": return serviceDiscountPremium;
            case "Gold": return serviceDiscountGold;
            case "Silver": return serviceDiscountSilver;
            default: return 0.0;
        }
    }

    public static double getProductDiscountRate(String type) {
        switch (type) {
            case "Premium": return productDiscountPremium;
            case "Gold": return productDiscountGold;
            case "Silver": return productDiscountSilver;
            default: return 0.0;
        }
    }
}

class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, Date date) {
        this.customer = customer;
        this.date = date;
    }
    
    public String getName() {
        return customer.getName();
    }
    public void setServiceExpense(double expense) {
        this.serviceExpense = expense;
    }
    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setProductExpense(double expense) {
        this.productExpense = expense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public double getTotalExpense() {
        double serviceDiscount = customer.isMember() ? DiscountRate.getServiceDiscountRate(customer.getMemberType()) : 0;
        double productDiscount = customer.isMember() ? DiscountRate.getProductDiscountRate(customer.getMemberType()) : 0;
        
        double totalServiceCost = serviceExpense * (1 - serviceDiscount);
        double totalProductCost = productExpense * (1 - productDiscount);
        
        return totalServiceCost + totalProductCost;
    }

    @Override
    public String toString() {
        return "Visit[customer=" + customer + ", date=" + date + ", serviceExpense=" + serviceExpense + ", productExpense=" + productExpense + ", totalExpense=" + getTotalExpense() + "]";
    }
}

