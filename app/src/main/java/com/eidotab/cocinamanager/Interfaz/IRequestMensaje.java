package com.eidotab.cocinamanager.Interfaz;

import com.eidotab.cocinamanager.Model.Mensaje;
import com.eidotab.cocinamanager.Model.Turno;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface IRequestMensaje {

    @GET("api/mensajes")
    Call<ArrayList<Mensaje>> getJSONMensajes();

    @POST("api/mensajes")
    Call<Mensaje> addMensaje(@Body Mensaje mensaje);

    @PUT("api/mensajes/{id}")
    Call<Mensaje> updateMensaje(@Path("id") String mensajeId, @Body Mensaje mensaje);

    @DELETE("api/mensajes/{id}")
    Call<Mensaje> deleteMensaje(@Path("id") String mensajeId);

    @GET("api/turnosact")
    Call<ArrayList<Turno>> getJSONTurnos();

    @PUT("api/turnos/{id}")
    Call<Turno> updateTurno(@Path("id") String mensajeId, @Body Turno turno);

}
