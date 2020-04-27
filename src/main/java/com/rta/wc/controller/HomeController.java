package com.rta.wc.controller;

import com.rta.wc.dao.LocationDao;
import com.rta.wc.entity.Location;
import com.rta.wc.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private LocationService service = new LocationService();

    @Autowired
    private LocationDao dao;

    @GetMapping("/locations")
    public String gotoLocations(Model model){
        List<Location> locations = dao.findAll();
        model.addAttribute("locations", locations);
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
