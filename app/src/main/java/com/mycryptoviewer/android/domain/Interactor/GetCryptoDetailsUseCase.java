package com.mycryptoviewer.android.domain.Interactor;


import com.mycryptoviewer.android.domain.Model.Crypto;
import com.mycryptoviewer.android.domain.Repository.CryptoRepository;

public class GetCryptoDetailsUseCase implements UseCase<String,Crypto> {

    private final CryptoRepository cryptoRepository;

    GetCryptoDetailsUseCase(CryptoRepository cryptoRepository) {
        this.cryptoRepository = cryptoRepository;
    }

    @Override
    public void execute(String cryptoName, Callback<Crypto> callback) {
        try {
            callback.onSuccess(cryptoRepository.getCryptoDetails(cryptoName));
        } catch (Throwable throwable) {
            callback.onError(throwable);
        }

    }
}
