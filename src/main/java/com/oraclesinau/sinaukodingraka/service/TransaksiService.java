package com.oraclesinau.sinaukodingraka.service;

import com.oraclesinau.sinaukodingraka.model.Transaksi;
import com.oraclesinau.sinaukodingraka.model.TransaksiDTO;
import com.oraclesinau.sinaukodingraka.repository.TransaksiRepository;
import com.oraclesinau.sinaukodingraka.utils.ManyData;
import com.oraclesinau.sinaukodingraka.utils.RestResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransaksiService {
    private final TransaksiRepository repository;

    public RestResult getData(){
        ManyData<Transaksi> result = new ManyData<>(repository.getTransaksi(), Transaksi.class);

        return new RestResult(
                result.getData(),
                result.getMessage(),
                result.getError()
        );
    }

    public RestResult saveTransaksi(TransaksiDTO param){
        ManyData<Transaksi> result = new ManyData<>(repository.saveTransaksi(param), Transaksi.class);

        return new RestResult(
                result.getData(),
                result.getMessage(),
                result.getError()
        );
    }


}
