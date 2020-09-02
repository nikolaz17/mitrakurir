package id.go.kominfobms.mitrakurirlangit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Simpkb {
    @GET("apiandroid/index")
    Call<BannerModel> getBanner();

}
