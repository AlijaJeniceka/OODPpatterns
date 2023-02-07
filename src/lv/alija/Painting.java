package lv.alija;

public class Painting {

    private final String paper_type;
    private final String color_type;
    private final String painter;

    public Painting(final String paper_type, final String color_type, final String painter) {
        this.paper_type = paper_type;
        this.color_type = color_type;
        this.painter = painter;
    }

    public String getPaper_type() {
        return paper_type;
    }

    public String getColor_type() {
        return color_type;
    }

    public String getPainter() {
        return painter;
    }
}
