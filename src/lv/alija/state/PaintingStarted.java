package lv.alija.state;

public class PaintingStarted extends PaintingState{

    public PaintingStarted(PaintingForState painting){
        super(painting);
    }

    @Override
    public void pushButton() {
        System.out.println(getStateDescription());
        painting.setNewState(new PaintingInProgress(painting));

    }

    @Override
    public String getStateDescription() {
        return "Started to paint.";
    }
}
