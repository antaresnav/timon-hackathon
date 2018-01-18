package com.geox.timon.hackathon.googleplaces;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GooglePlacesService {

    @GET("api/place/nearbysearch/json")
    Call<PlacesResponse> getNearbyPlaces(@Query("key") String key, @Query("type") String type, @Query("location") String location, @Query("radius") int radius);

}