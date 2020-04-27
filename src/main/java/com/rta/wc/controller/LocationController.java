package com.rta.wc.controller;

import com.rta.wc.dao.LocationDao;
import com.rta.wc.entity.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LocationController {

    @Autowired
    private LocationDao dao;

    @GetMapping("/addLocation")
    public String addLocation(Model model){
        Location location = new Location();
        model.addAttribute(location);
        return "comp/addLocation";
    }

    @PostMapping("/addLocation")
    public String addLocationObj(Location location){
        return "comp/addLocationConfirmation";
    }
}
