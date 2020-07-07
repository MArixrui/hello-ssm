package com.xrstandard.springboot.ssm.hellossm.controller;

import com.xrstandard.springboot.ssm.hellossm.bean.TAdmin;
import com.xrstandard.springboot.ssm.hellossm.service.TAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TAdminController {

    @Autowired
    TAdminService tAdminService;

    @GetMapping("/one")
    public TAdmin getTAdmin(Integer id) {
        return tAdminService.getTAdmin(id);
    }
}
