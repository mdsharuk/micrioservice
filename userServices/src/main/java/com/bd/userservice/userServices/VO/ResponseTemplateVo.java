package com.bd.userservice.userServices.VO;

import com.bd.userservice.userServices.Entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVo {
    private User user;
    private Deparment deparment;

}
