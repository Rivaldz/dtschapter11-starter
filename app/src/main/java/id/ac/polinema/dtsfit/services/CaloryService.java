package id.ac.polinema.dtsfit.services;

import android.telecom.Call;

import java.util.List;

import id.ac.polinema.dtsfit.models.Calory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface CaloryService{

    // TODO: Definisikan service getCalories()
    @GET("/polinema-mobile/dts-fit/calories")
    retrofit2.Call<List<Calory>> getCalories();

    // TODO: Definisikan service addCalory()
    @POST("/rivaldosetyo/dts-fit/calories")
    retrofit2.Call<Calory> addCalory(@Body Calory calory);

    // TODO: Definisikan service editCalory()
    @PUT("/polinema-mobile/dts-fit/calories/{id}")
    retrofit2.Call<Calory> editCalory(@Path("id") int id, @Body Calory calory);
}
