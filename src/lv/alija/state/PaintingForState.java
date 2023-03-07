package lv.alija.state;

public class PaintingForState {

    private PaintingState currentState;

    public PaintingForState(){
        this.currentState = new PaintingStarted(this);
    }
    public void setNewState(final PaintingState paintingState){
        currentState = paintingState;
    }

    public String getStateDescription() {
        return currentState.getStateDescription();
    }
    public void pushTheButton() {
        currentState.pushButton();
    }
}
