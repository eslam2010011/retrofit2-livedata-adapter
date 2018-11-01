package retrofit2livedataadapter.vn.com.vermoric.retrofit2livedataadapter;

import android.arch.lifecycle.LiveData;

import retrofit2.http.GET;

/**
 * http://innotech.vn
 * Created by Huynh Van Duc on 11/1/2018.
 */
public interface GetDataService {
    @GET("tzry2")
    LiveData<User> getUser();
}
