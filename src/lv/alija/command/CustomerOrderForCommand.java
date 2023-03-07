package lv.alija.command;

public class CustomerOrderForCommand implements OrderForCommand {

    @Override
    public void createOrder() {
        System.out.println("Creating a new order");
    }

    @Override
    public void deleteOrder() {
        System.out.println("Deleting order");
    }
}
