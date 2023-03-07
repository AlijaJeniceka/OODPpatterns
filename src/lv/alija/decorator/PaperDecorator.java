package lv.alija.decorator;

public class PaperDecorator extends PaintingDecorator{

    public PaperDecorator(Painting customPainting) {
        super(customPainting);
    }

    @Override
    public String use(){
        return customPainting.use() + addPaperColor();
    }

    private String addPaperColor() {
        return "in black color";
    }
}
