public class Dog {
    String name;
    String color;
    int year;
    public Dog( String name, String color,int year){
        this.name = name;
        this.color = color;
        this.year = year;

    }

    @Override
    public String toString() {
        return "Dog" +
                "name='" + name + "\n" +
                "color='" + color + "\n" +
                "year=" + year ;
    }
}
