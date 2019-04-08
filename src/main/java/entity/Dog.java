package entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
public class Dog extends AbstractVo implements Comparable<Dog> {
    private static final long serialVersionUID = -2016494634953667871L;
    String color;
    int size;

    public Dog(String color) {
        this.color = color;
    }

    public Dog(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(color, dog.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Dog o) {
        return o.size - this.size;
    }
}