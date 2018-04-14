package com.danparkin.organizingdata.replacedatavaluewithobject;

import java.util.ArrayList;

public class Client {
    public static int numberOfOrdersFor(ArrayList<Order> orders, String customer) {
        int result = 0;
        for(Order order : orders) {
            if(order.getCustomer().equals(customer)) result++;
        }
        return result;
    }
}
