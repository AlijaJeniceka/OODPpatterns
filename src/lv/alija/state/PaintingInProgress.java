package lv.alija.state;


public class PaintingInProgress extends PaintingState{


    public PaintingInProgress(PaintingForState painting) {
        super(painting);
    }

    @Override
    public void pushButton() {
        System.out.println(getStateDescription());
        painting.setNewState(new PaintingFinished(painting));

    }

    @Override
    public String getStateDescription() {
        return "Painting in progress. ";
    }
}
