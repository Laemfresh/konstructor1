public class Cat {
    String name;
    String color;
    int year;
    public Cat(String name, String color,int year){
        this.name = name;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Cat" +
                "name='" + name + "\n" +
                "color='" + color + "\n" +
                "year=" + year ;
    }
}
