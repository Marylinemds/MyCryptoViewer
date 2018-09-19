package com.mycryptoviewer.android.domain.Interactor;

public interface UseCase<P, R> {
    interface Callback<R> {
        void onSuccess(R response);
        void onError(Throwable throwable);
    }
    void execute(P parameter, Callback<R> callback);
}
