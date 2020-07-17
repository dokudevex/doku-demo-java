package com.doku.demoapps.repository;

import com.doku.demoapps.entity.SetupConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SetupConfigurationRepository extends JpaRepository<SetupConfiguration, Integer> {
    @Query("SELECT sc FROM SetupConfiguration sc")
    SetupConfiguration findOne();
}
