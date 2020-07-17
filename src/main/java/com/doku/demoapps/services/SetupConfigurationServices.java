package com.doku.demoapps.services;

import com.doku.demoapps.entity.SetupConfiguration;
import com.doku.demoapps.repository.SetupConfigurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SetupConfigurationServices {

    @Autowired
    SetupConfigurationRepository setupConfigurationRepository;

    public SetupConfiguration create(SetupConfiguration setupConfiguration){
        return setupConfigurationRepository.save(setupConfiguration);
    }

    public SetupConfiguration findOne(){
        return setupConfigurationRepository.findOne();
    }

}
