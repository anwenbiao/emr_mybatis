package com.taiji.emr_demo.gen.controller;


import com.taiji.emr_demo.gen.entity.TInpPatientReg;
import com.taiji.emr_demo.gen.service.ITInpPatientRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 住院就诊登记表 前端控制器
 * </p>
 *
 * @author anwenbiao
 * @since 2020-02-14
 */
@RestController
@RequestMapping("/inpPatientReg")
public class TInpPatientRegController {

    @Autowired
    private ITInpPatientRegService itInpPatientRegService;

    @RequestMapping("getById")
    public TInpPatientReg getById(String id){
        return itInpPatientRegService.getById(id);
    }


}
