package lv.alija.bridge;

public class CustomerOrder extends Order{
    @Override
    public void showOrderDetails() {
        System.out.println("Customer order with details only needed for customer ");
    }
}
