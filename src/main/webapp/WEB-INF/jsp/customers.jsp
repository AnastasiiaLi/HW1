<%@ page import="com.example.hw1.Customer" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Customers View</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
     <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>

    <style>
        table {
            margin-left: auto;
            margin-right: auto;
        }
        table, th, td {
            border: 1px solid black;
        }

    </style>
</head>
<body>
<div class="container">
    <h2>Customers table</h2>

    <table class="table table-success table-striped">
        <thead>
        <tr>

            <th>Last Name</th>
            <th>Name</th>
            <th>Gender</th>
            <th>Id</th>
            <th>Country</th>
            <th>Address</th>
            <th>Phone number</th>
            <th>Email</th>
            <th>Customer type</th>
            <th>Manager</th>
            <th>Manager's phone number</th>
            <th>Manager's email</th>
            <th>Discount %</th>
            <th>Order number</th>

        </tr>
        </thead>
        <tbody>

        <%
            List<Customer> customers = (List<Customer>) request.getAttribute("customersList");
            for (Customer customer : customers) {
                out.print("<tr><td>"
                        + customer.getLastName() + "</td><td>"
                        + customer.getName() + "</td><td>"
                        + customer.getGender() + "</td><td>"
                        + customer.getId() + "</td><td>"
                        + customer.getCountry() + "</td><td>"
                        + customer.getAddress() + "</td><td>"
                        + customer.getPhoneNumber() + "</td><td>"
                        + customer.getEmail() + "</td><td>"
                        + customer.getCustomerType() + "</td><td>"
                        + customer.getManager() + "</td><td>"
                        + customer.getManagerPhone() + "</td><td>"
                        + customer.getManagerEmail() + "</td><td>"
                        + customer.getDiscount() + "</td><td>"
                        + customer.getOrderNumber() + "</td></tr>");
            }
        %>

        </tbody>
    </table>
</div>
</body>
</html>
