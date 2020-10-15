package Pattern.Creational;

public class Builder {
    private final int year;
    private final String name;
    private final String lastName;

    private Builder(Builder1 builder1){
        this.year = builder1.year;
        this.name = builder1.name;
        this.lastName = builder1.lastName;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "year=" + year +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public static class Builder1{
        private int year;
        private String name;
        private String lastName;

        public Builder1 setYear(int year) {
            this.year = year;
            return this;
        }

        public Builder1 setName(String name) {
            this.name = name;
            return this;
        }

        public Builder1 setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder build(){
            return new Builder(this);
        }
    }

    public static void main(String[] args) {
        Builder builder = new Builder1().setYear(20).setName("Lol").setLastName("Kol").build();
        System.out.println(builder.toString());
    }
}
