package com.example.hw1;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CustomersListServlet extends HttpServlet {
    private List<Customer> customers
            = Arrays.asList(
            new Customer("Liakh","Anastasiia","W",1,"Ukraine","Kyiv","0505013355",
                    "lalala@gmail.com","VIP","Sergienko","0503333355","Sergienko@gmail.com",35,3360),
            new Customer("Shevchenko","Taras","M",2,"Ukraine","Kaniv","0503332233","tatata@gmail.com",
                    "NEW","Petrenko","0503331335","Petrenko@gmail.com",4,3355),
            new Customer("Uktainka","Lesya","W",3,"Ukraine","Lviv","0503232233","lesya@gmail.com",
                    "VIP","Petrenko","0503331335","Petrenko@gmail.com",30,3356),
            new Customer("Kostenko","Lina","W",4,"Ukraine","Rzhyshiw","0503332243","lina@gmail.com",
                    "Loyal","Sergienko","0503333355", "Sergienko@gmail.com",15,3358),
            new Customer("Stus","Vasyl","M",5,"Ukraine","Vinnitsa","0503532243","stus@gmail.com",
                    "Loyal","Sergienko","0503333355", "Sergienko@gmail.com",15,3365));



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customersList", customers);
        request.setAttribute("customers", getCustomerTable());
        request.getRequestDispatcher("/WEB-INF/jsp/customers.jsp").forward(request, response);
    }
    public String getCustomerTable() {
        StringBuilder sb = new StringBuilder();
        for (Customer customer : customers) {
            sb.append("<tr><td>")
                    .append(customer.getId())
                    .append("</td><td>")
                    .append(customer.getName())
                    .append("</td><td>")
                    .append(customer.getAddress())
                    .append("</td></tr>");
        }
        return sb.toString();

    }
}


