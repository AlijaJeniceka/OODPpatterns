package lv.alija.command;

public class CreateCustomerOrder implements Command{
    OrderForCommand orderForCommand;

    public CreateCustomerOrder(OrderForCommand orderForCommand) {
        this.orderForCommand = orderForCommand;
    }

    @Override
    public void execute() {
        orderForCommand.createOrder();
    }
}
