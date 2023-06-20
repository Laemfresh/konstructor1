public class Popugai {
    String birdName;
    String whatHedo;
    int year;
    public Popugai(String birdName, String whatHedo,int year){
        this.birdName = birdName;
        this.whatHedo = whatHedo;
        this.year = year;

    }

    @Override
    public String toString() {
        return "Popugai" +
                "birdName='" + birdName + "\n" +
                "whatHedo='" + whatHedo + "\n" +
                "year=" + year ;
    }
}
