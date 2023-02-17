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
            new Customer("Kostenko","Lina","W",4,"Ukraine","Rjisciv","0503332243","lina@gmail.com",
                    "Loyal","Sergienko","0503333355", "Sergienko@gmail.com",15,3358),
            new Customer("Stus","Vasyl","M",5,"Ukraine","Vinnitsa","0503532243","stus@gmail.com",
                    "Loyal","Sergienko","0503333355", "Sergienko@gmail.com",15,3365),
            new Customer("Hvyliovy","Mukola","M",6,"Ukraine","Harkiv","0503535343","hvyliovy@gmail.com",
                    "Loyal","Sergienko","0503333355", "Sergienko@gmail.com",20,3365),
            new Customer("Qū","Yuán","M",7,"China","In","0303532243","qu@gmail.com",
                    "NEW","Sergienko","0503333355", "Sergienko@gmail.com",5,3367),
            new Customer("Stas","Mikhailo","M",8,"Ukraine","Brovary","0683532243","stas@gmail.com",
                    "Loyal","Popov","0503333356", "Popov@gmail.com",18,3368),
            new Customer("Black","Catrin","W",9,"Canada","Toronto","7593532243","cat@gmail.com",
                    "VIP","Sergienko","0503333355", "Sergienko@gmail.com",28,3369),
            new Customer("Stus","Vasylyna","W",10,"Poland","Warszhawa","0703532243","stusVa@gmail.com",
                    "Loyal","Sergienko","0503333355", "Sergienko@gmail.com",15,3371),
            new Customer("Omar","Li","M",11,"Ukraine","Kyiv","0503538243","omar@gmail.com",
                    "NEW","Popov","0503333356", "Popov@gmail.com",5,3372),
            new Customer("Jek","London","M",12,"Britan","London","003532243","8871@gmail.com",
                    "Loyal","Sergienko","0503333355", "Sergienko@gmail.com",15,3374),
            new Customer("Topolya","Taras","M",13,"Ukraine","Kyiv","0504532243","taras1@gmail.com",
                    "NEW","Popov","0503333356", "Popov@gmail.com",3,3375),
            new Customer("Pup","Milana","W",14,"Ukraine","Obuchiv","0693532243","milana@gmail.com",
                    "Loyal","Popov","0503333356", "Popov@gmail.com",21,3376),
            new Customer("Tramp","Donald","M",15,"USA","New York City","0983532243","14don@gmail.com",
                    "VIP","Popov","0503333356", "Popov@gmail.com",36,3377));

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


