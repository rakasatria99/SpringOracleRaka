package com.oraclesinau.sinaukodingraka.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Transaksi {
    @JsonProperty("ID")
    private Integer id;

    @JsonProperty("NAMA_BARANG")
    private String namaBarang;

    @JsonProperty("QTY")
    private Integer qty;

    @JsonProperty("RP_BAYAR")
    private Integer rpBayar;

}
