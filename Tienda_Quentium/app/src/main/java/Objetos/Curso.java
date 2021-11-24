package Objetos;

import java.util.Arrays;
import java.util.Objects;

public class Curso {

    private int id;
    private String[] curso ={"USD","CLP"};
    private int [] precios = {50000,58000,};
    private int cupos;

    public Curso()
    {


    }

    public Curso(int id, String[] curso, int[] precios, int cupos) {
        this.id = id;
        this.curso = curso;
        this.precios = precios;
        this.cupos = cupos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getCurso() {
        return curso;
    }

    public void setCurso(String[] curso) {
        this.curso = curso;
    }

    public int[] getPrecios() {
        return precios;
    }

    public void setPrecios(int[] precios) {
        this.precios = precios;
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso1 = (Curso) o;
        return id == curso1.id && cupos == curso1.cupos && Arrays.equals(curso, curso1.curso) && Arrays.equals(precios, curso1.precios);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, cupos);
        result = 31 * result + Arrays.hashCode(curso);
        result = 31 * result + Arrays.hashCode(precios);
        return result;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", curso=" + Arrays.toString(curso) +
                ", precios=" + Arrays.toString(precios) +
                ", cupos=" + cupos +
                '}';
    }
}
