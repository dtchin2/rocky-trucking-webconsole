package com.rta.wc.dao;

import com.rta.wc.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface LocationDao extends JpaRepository<Location, Long> {
}
