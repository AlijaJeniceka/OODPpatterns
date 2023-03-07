package lv.alija.command;

public class OrderRemoteControl {

    private Command command;

    public OrderRemoteControl(Command command){
        this.command=command;
    }

    public void pressButton(){
        command.execute();
    }
}
