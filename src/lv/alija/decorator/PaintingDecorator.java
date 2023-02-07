package lv.alija.decorator;

public abstract class PaintingDecorator implements Painting{

    protected Painting customPainting;

    public PaintingDecorator(Painting customPainting){
        this.customPainting = customPainting;
    }

    @Override
    public String use() {
        return customPainting.use();
    }
}
