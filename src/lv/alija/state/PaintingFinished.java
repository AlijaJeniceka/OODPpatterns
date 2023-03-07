package lv.alija.state;

public class PaintingFinished extends PaintingState{

    public PaintingFinished(PaintingForState painting){
        super(painting);
    }

    @Override
    public void pushButton() {
        System.out.println(getStateDescription());
        painting.setNewState(new PaintingStarted(painting));

    }

    @Override
    public String getStateDescription() {
        return "Finished painting.";
    }
}
