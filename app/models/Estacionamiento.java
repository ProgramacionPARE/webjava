package models;

import net.vz.mongodb.jackson.Id;
import net.vz.mongodb.jackson.JacksonDBCollection;
import net.vz.mongodb.jackson.ObjectId;
import play.modules.mongodb.jackson.MongoDB;

import java.util.List;

/**
 * Created by oscar on 23/02/15.
 */

public class Estacionamiento {
    @Id
    @ObjectId
    private String id;

    private String nombre;
    private String direccion;
    private String nick;
    private int    __v;

    

    private static JacksonDBCollection<Estacionamiento, String>
            coll = MongoDB.getCollection("estacionamientos", Estacionamiento.class, String.class);

    public static List<Estacionamiento> all() {
        return Estacionamiento.coll.find().toArray();
    }


    public static void create(Estacionamiento e) {
        coll.save(e);
    }

    public static void delete(String id) {
        Estacionamiento e = Estacionamiento.coll.findOneById(id);
        if (e != null)
            Estacionamiento.coll.remove(e);
    }

    public static void removeAll(){
        Estacionamiento.coll.drop();
    }

    public Estacionamiento(){
    }

    public Estacionamiento(String nombre,String direccion,   String nick) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nick = nick;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }

}
