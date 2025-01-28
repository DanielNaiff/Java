import java.util.Objects;

public class Alunos {
    int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alunos alunos = (Alunos) o;
        return id == alunos.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public Alunos(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
