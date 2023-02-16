package com.example.hw1;

import java.time.LocalDate;
import java.util.Date;

public class Customer {
    private final String lastName;
    private final String name;
    private final String gender;
    private final int id;
    private final String country;
    private final String address;
    private String phoneNumber;
    private String email;
    private String customerType;
    private String manager;
    private String managerPhone;
    private String managerEmail;
    private int discount;
    private int orderNumber;


    public Customer(String lastName, String name, String gender, int id, String country, String address, String phoneNumber, String email, String customerType, String manager, String managerPhone, String managerEmail, int discount, int orderNumber) {
        this.lastName = lastName;
        this.name = name;
        this.gender = gender;
        this.id = id;
        this.country = country;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerType = customerType;
        this.manager = manager;
        this.managerPhone = managerPhone;
        this.managerEmail = managerEmail;
        this.discount = discount;
        this.orderNumber = orderNumber;

    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getCustomerType() {
        return customerType;
    }

    public String getManager() {
        return manager;
    }

    public String getManagerPhone() {
        return managerPhone;
    }

    public String getManagerEmail() {
        return managerEmail;
    }

    public int getDiscount() {
        return discount;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone;
    }

    public void setManagerEmail(String managerEmail) {
        this.managerEmail = managerEmail;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", customerType='" + customerType + '\'' +
                ", manager='" + manager + '\'' +
                ", managerPhone='" + managerPhone + '\'' +
                ", managerEmail='" + managerEmail + '\'' +
                ", discount=" + discount +
                ", orderNumber=" + orderNumber +
                '}';
    }
}