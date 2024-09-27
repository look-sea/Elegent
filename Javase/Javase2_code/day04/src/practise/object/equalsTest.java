package practise.object;

import java.util.Objects;

public class equalsTest {
    private String name;
    private int age;

    public equalsTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public equalsTest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        equalsTest that = (equalsTest) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

