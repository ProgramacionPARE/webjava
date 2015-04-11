package controllers;

import play.mvc.*;
import play.data.*;

import models.*;

import java.util.List;


public class Admin extends Controller {
  


    public static Result index() {
      List<Estacionamiento> estacionamientos = Estacionamiento.all();
      return ok(views.html.index.render(estacionamientos));
    }

    public static Result estacionamiento(String name) {
        List<Estacionamiento> estacionamientos = Estacionamiento.all();
        return ok(views.html.estacionamiento_menu.render(estacionamientos));
    }

    public static Result operaciones(String name) {
        List<Estacionamiento> estacionamientos = Estacionamiento.all();
        return ok(views.html.operaciones.render(estacionamientos));
    }




}
