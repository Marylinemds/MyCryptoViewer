package com.mycryptoviewer.android.domain.Repository;

import com.mycryptoviewer.android.domain.Model.Crypto;

import java.util.List;

public interface CryptoRepository {

    Crypto getCryptoDetails(String symbol);
    List<Crypto> getCryptoList();

}
