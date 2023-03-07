package lv.alija.bridge;

public class ReceivedOrder extends Order{
    @Override
    public void showOrderDetails() {
        System.out.println("Order from the client with all Client data");
    }
}
