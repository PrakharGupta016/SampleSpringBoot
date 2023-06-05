package com.example.demo.entity;

import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;

@Entity
@Table(name = "Contact")
public class Contact {
    public Contact() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer contact_id;
    private String  contact_name;
    private String  contact_type;
    private String currency_code;
    private String status;

    public Contact(Integer contact_id, String contact_name, String contact_type, String currency_code, String status) {
        this.contact_id = contact_id;
        this.contact_name = contact_name;
        this.contact_type = contact_type;
        this.currency_code = currency_code;
        this.status = status;
    }

    public Integer getContact_id() {
        return contact_id;
    }

    public void setContact_id(Integer contact_id) {
        this.contact_id = contact_id;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getContact_type() {
        return contact_type;
    }

    public void setContact_type(String contact_type) {
        this.contact_type = contact_type;
    }

    public String getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
