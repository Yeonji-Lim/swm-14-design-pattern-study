import java.util.HashMap;

public class Album extends Item{

    private String artist;
    private String etc;

    public Album(String name, Integer price, Integer quantity, String artist, String etc) {
        super(name, price, quantity);
        this.artist = artist;
        this.etc = etc;
    }

    @Override
    public void getInfomation() {
        System.out.println("Information : artist=" + artist+", etc="+etc);
    }
}
