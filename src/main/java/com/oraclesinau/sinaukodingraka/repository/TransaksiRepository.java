package com.oraclesinau.sinaukodingraka.repository;

import com.oraclesinau.sinaukodingraka.model.TransaksiDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
@RequiredArgsConstructor
public class TransaksiRepository {

    private final JdbcTemplate jdbcTemplate;

    public Map<String, Object> getTransaksi(){
        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withCatalogName("PKG_TRANSAKSI_RAKA")
                .withFunctionName("getTransaksi");

        return jdbcCall.execute();
    }

    public Map<String, Object> saveTransaksi(TransaksiDTO param){
        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withCatalogName("PKG_TRANSAKSI_RAKA")
                .withFunctionName("saveTransaksi");

        SqlParameterSource source = new MapSqlParameterSource()
                .addValue("in_id_barang", param.getIdBarang())
                .addValue("in_qty", param.getQty());

        return jdbcCall.execute(source);
    }
}
