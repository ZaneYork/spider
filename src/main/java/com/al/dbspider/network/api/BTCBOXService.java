package com.al.dbspider.network.api;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by 郭青枫 on 2018/1/3 0003.
 */
public interface BTCBOXService {

    @GET("selectCoinMarketbyCoinName?payCoinName=HKD&")
    Call<ResponseBody> hkd(@Query("coinName") String coinName);


}
