package com.company;

public class CustomerValidator {
    public CustomerValidator() {
        System.out.println("Customer validator Default constructor");
    }
    static {
        System.out.println("Customer validator Static constructor");
    }
    public static boolean isValidCustomer(Customer customer){
        System.out.println("Static method");
        if (!customer.name.isEmpty() && customer.salary>0)
            return true;
        else
            return false;
    }
    public boolean isValidCustomer2(Customer customer){
        System.out.println("Default method");
        if (!customer.name.isEmpty() && customer.salary>0)
            return true;
        else
            return false;
    }

    public static class CustomerValidatorStatic{
        public static boolean isValidCustomer3(Customer customer){
            System.out.println("Static inner class");
            if (!customer.name.isEmpty() && customer.salary>0)
                return true;
            else
                return false;
        }
    }
}
