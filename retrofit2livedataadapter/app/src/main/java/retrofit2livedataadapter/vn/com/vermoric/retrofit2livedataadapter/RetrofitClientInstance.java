package retrofit2livedataadapter.vn.com.vermoric.retrofit2livedataadapter;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2livedataadapter.vn.com.vermoric.retrofit2livedataadapter.livedataadapter.LiveDataCallAdapterFactory;

/**
 * http://innotech.vn
 * Created by Huynh Van Duc on 11/1/2018.
 */
public class RetrofitClientInstance {
    private static final String BASE_URL = "https://api.myjson.com/bins/";
    private static Retrofit retrofit;

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(LiveDataCallAdapterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
