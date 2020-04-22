package com.rta.wc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/locations")
    public String gotoLocations(){
        return "locations";
    }

    @GetMapping("/customers")
    public String gotoCustomers(){
        return "customers";
    }

    @GetMapping("/invoices")
    public String gotoInvoices(){
        return "invoices";
    }

    @GetMapping("/index")
    public String gotoHome(){
        return "index";
    }
}
