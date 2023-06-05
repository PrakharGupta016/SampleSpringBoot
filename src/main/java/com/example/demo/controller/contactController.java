package com.example.demo.controller;

import com.example.demo.entity.Contact;
import com.example.demo.service.contactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class contactController {
    @Autowired
    private contactService contactservice;
    @PostMapping("/addContact")
   public String addContact(@RequestBody Contact contact)
    {
        contactservice.addContact(contact);

        return "done";

    }
}
