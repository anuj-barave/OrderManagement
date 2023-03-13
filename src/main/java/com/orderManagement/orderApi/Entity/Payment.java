package com.orderManagement.orderApi.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.orderManagement.orderApi.Entity.orderapp;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String method;
    private String status;
    private Date date;
    @JsonIgnore
    @OneToOne(mappedBy = "payment")
    private orderapp orderApp;

    public Payment() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public orderapp getOrderApp() {
        return orderApp;
    }

    public void setOrderApp(orderapp orderApp) {
        this.orderApp = orderApp;
    }

    public Payment(String method, String status, Date date) {
        this.method = method;
        this.status = status;
        this.date = date;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
