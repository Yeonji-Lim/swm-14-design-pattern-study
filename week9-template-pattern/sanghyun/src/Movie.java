public class Movie extends Item{

    private String actor;
    private String director;

    public Movie(String name, Integer price, Integer quantity, String actor, String director) {
        super(name, price, quantity);
        this.actor = actor;
        this.director = director;
    }

    @Override
    public void getInfomation() {
        System.out.println("Information : actor=" + actor+", director="+director);
    }
}
