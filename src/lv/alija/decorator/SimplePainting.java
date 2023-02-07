package lv.alija.decorator;

public class SimplePainting implements Painting{

    @Override
    public String use() {
        return "Paper ";
    }
}
