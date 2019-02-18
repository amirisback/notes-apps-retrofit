package com.frogobox.notesappsretrofit;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * NotesAppsRetrofit
 * Copyright (C) 18/02/2019.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Line     : bullbee117
 * Phone    : 081357108568
 * Majors   : D3 Teknik Informatika 2016
 * Campus   : Telkom University
 * -----------------------------------------
 * id.amirisback.frogobox
 */
public interface ApiInterface {

    @FormUrlEncoded
    @POST("save.php")
    Call<Note> saveNote (
            @Field("title") String title,
            @Field("note") String note,
            @Field("color") int color
            );

}
