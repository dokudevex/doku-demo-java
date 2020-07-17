package com.doku.demoapps.dto;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class SetupConfigurationDto {
    private Integer id;
    private String merchantName;
    private String clientId;
    private String sharedKey;
    private String serverLocation;
}
