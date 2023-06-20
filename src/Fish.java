public class Fish {
    String breed;
    double weigth;
    String food;
    public Fish(String breed,double weigth,String food){
        this.breed = breed;
        this.weigth = weigth;
        this.food = food;

    }

    @Override
    public String toString() {
        return " Fish " +
                "breed='" + breed + "\n"+
                "weigth=" + weigth +"\n"+
                "food='" + food ;
    }
}
