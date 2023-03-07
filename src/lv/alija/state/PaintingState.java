package lv.alija.state;


public abstract class PaintingState {

    public abstract void pushButton();
    public abstract String getStateDescription();
    protected final PaintingForState painting;

    public PaintingState(PaintingForState painting){
        this.painting = painting;
    }
}
