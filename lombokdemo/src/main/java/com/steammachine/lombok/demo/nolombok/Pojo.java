package com.steammachine.lombok.demo.nolombok;

/**
 * #STEP 1
 *
 * pojo object without lombok is very much longer
 */
public class Pojo {

    private long id;

    public Pojo() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pojo{" +
                "id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Pojo pojo = (Pojo) o;
        return id == pojo.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
