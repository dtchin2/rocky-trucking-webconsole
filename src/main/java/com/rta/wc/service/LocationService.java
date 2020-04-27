package com.rta.wc.service;

import com.rta.wc.dao.LocationDao;
import com.rta.wc.entity.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocationService {

    @Autowired
    private LocationDao locationDao;

}
