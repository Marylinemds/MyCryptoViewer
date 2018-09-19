package com.mycryptoviewer.android.domain.Interactor;


import com.mycryptoviewer.android.domain.Model.Crypto;
import com.mycryptoviewer.android.domain.Repository.CryptoRepository;

import java.util.List;

public class GetCryptoListUseCase implements UseCase<Void,List<Crypto>> {

private final CryptoRepository cryptoRepository;

   GetCryptoListUseCase(CryptoRepository cryptoRepository) {
       this.cryptoRepository = cryptoRepository;
   }

   @Override
   public void execute(Void parameter, Callback<List<Crypto>> callback) {
     try {
         callback.onSuccess(cryptoRepository.getCryptoList());
     } catch (final Throwable throwable){
         callback.onError(throwable);
     }
   }
}

