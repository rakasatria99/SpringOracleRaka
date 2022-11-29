package com.oraclesinau.sinaukodingraka.controller;

import com.oraclesinau.sinaukodingraka.model.TransaksiDTO;
import com.oraclesinau.sinaukodingraka.service.TransaksiService;
import com.oraclesinau.sinaukodingraka.utils.RestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("transaksi")
public class TransaksiController {
    @Autowired
    private TransaksiService service;

    @GetMapping("/find-all")
    public RestResult getData(){
        return service.getData();
    }

    @PostMapping("/save-transaksi")
    public RestResult saveTransaksi(@RequestBody TransaksiDTO param){
        return service.saveTransaksi(param);
    }
}