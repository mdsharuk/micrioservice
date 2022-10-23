package com.bd.userservice.userServices.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Deparment {

    private Long deparmentId;
    private String deparmentName;
    private String deparmentAddress;
    private String deparmentCode;
}
