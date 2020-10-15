package Pattern.Creational;

import java.util.Objects;

public class
FactoryMethod {

    private int year;

    private String name;

    private String lastName;

    private FactoryMethod(int year, String name, String lastName){
        this.year = year;
        this.name = name;
        this.lastName = lastName;
    }

    public static FactoryMethod getInstance(int year){
        if (year <= 30)
            return new FactoryMethod(year, "young", null);
        return new FactoryMethod(year, "old", null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FactoryMethod that = (FactoryMethod) o;
        return year == that.year &&
                Objects.equals(name, that.name) &&
                Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, name, lastName);
    }
}
