package Objetos;

import java.util.Objects;

public class Usuario {

    private int id;
    private String user;
    private String pass;

    public Usuario()
    {
        user="Ema";
        pass="xupalox";

    }

    public Usuario(int id, String user, String pass) {
        this.id = id;
        this.user = user;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id == usuario.id && user.equals(usuario.user) && pass.equals(usuario.pass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, pass);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
