package com.revature.model;

import java.util.Objects;

public class Gremlin {
    private String name;
    private Integer age;
    private Integer colorId;
    private boolean isEvil;

    public String getName() {
        return name;
    }

    public Gremlin setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Gremlin setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Integer getColorId() {
        return colorId;
    }

    public Gremlin setColorId(Integer colorId) {
        this.colorId = colorId;
        return this;
    }

    public boolean isEvil() {
        return isEvil;
    }

    public Gremlin setEvil(boolean evil) {
        isEvil = evil;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gremlin gremlin = (Gremlin) o;
        return isEvil == gremlin.isEvil && Objects.equals(name, gremlin.name) && Objects.equals(age, gremlin.age) && Objects.equals(colorId, gremlin.colorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, colorId, isEvil);
    }

    @Override
    public String toString() {
        return "Gremlin{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colorId=" + colorId +
                ", isEvil=" + isEvil +
                '}';
    }
}
