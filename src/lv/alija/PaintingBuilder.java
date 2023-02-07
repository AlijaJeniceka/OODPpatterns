package lv.alija;

public class PaintingBuilder {

    private String paper_type;
    private String color_type;
    private String painter;

    private PaintingBuilder(){

    }

    public static PaintingBuilder aPainting(){
        return new PaintingBuilder();
    }

    public PaintingBuilder withPaperType(String paper_type){
        this.paper_type = paper_type;
        return this;
    }
    public PaintingBuilder withColorType(String color_type){
        this.color_type = color_type;
        return this;
    }
    public PaintingBuilder withPainter(String painter){
        this.painter = painter;
        return this;
    }

    public Painting build(){
        return new Painting(paper_type, color_type, painter);
    }
}
