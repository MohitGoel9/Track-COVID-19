package com.mohit.covid19tracker.Network;

import com.mohit.covid19tracker.Models.IndianStateDistrictWise;
import com.mohit.covid19tracker.Models.India;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IndiaApiService {

    @GET("/data.json")
    Call<India> getNationalData();

    @GET("/v2/state_district_wise.json")
    Call<List<IndianStateDistrictWise>> getStateData();
}
