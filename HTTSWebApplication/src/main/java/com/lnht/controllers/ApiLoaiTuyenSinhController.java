/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lnht.controllers;

import com.lnht.pojo.LoaiTuyenSinh;
import com.lnht.service.LoaiTuyenSinhService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Admin
 */
@RestController
@RequestMapping("/api")
public class ApiLoaiTuyenSinhController {
    @Autowired
    private LoaiTuyenSinhService loaiTSService;
    
    @GetMapping("/categories/")
    @CrossOrigin
    public ResponseEntity<List<LoaiTuyenSinh>> list() {
        return new ResponseEntity<>(this.loaiTSService.getLoaiTuyenSinhs(), HttpStatus.OK);
    }
    
}
