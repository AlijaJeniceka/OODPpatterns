package lv.alija;


import lv.alija.bridge.CustomerOrder;
import lv.alija.bridge.ReceivedOrder;
import lv.alija.command.CreateCustomerOrder;
import lv.alija.command.CustomerOrderForCommand;
import lv.alija.command.DeleteCustomerOrder;
import lv.alija.command.OrderForCommand;
import lv.alija.command.OrderRemoteControl;
import lv.alija.decorator.PaperDecorator;
import lv.alija.decorator.SimplePainting;
import lv.alija.state.PaintingForState;


public class Main {

    public static void main(String[] args) {
	   //Build a new painting using Builder pattern
        System.out.println("BUILDER");
        final Painting paint = PaintingBuilder.aPainting()
                .withPaperType("300 g/m^2, A4")
                .withColorType("Acrylic colors")
                .withPainter("Name, Surname")
                .build();
        printPaintingInfo(paint);

        //Decorator in use. Decorator helps to add additional behavior in an existing method of an object.
        System.out.println();
        System.out.println("DECORATOR");
        lv.alija.decorator.Painting painting = new SimplePainting();
        System.out.println(painting.use());
        painting = new PaperDecorator(painting);
        System.out.println(painting.use());

        //Bridge - Decouples an abstraction from its implementation so that the two can vary independently.
        // Bridge is designed up-front to let the abstraction and the implementation vary independently.
        System.out.println();
        System.out.println("BRIDGE:");
        CustomerOrder customerOrder = new CustomerOrder();
        customerOrder.showOrderDetails();
        ReceivedOrder receivedOrder = new ReceivedOrder();
        receivedOrder.showOrderDetails();

        //State - Allows an object to alter its behavior when its internal state changes.
        System.out.println();
        System.out.println("STATE: ");
        final int PUSH_TIMES = 3;
        final PaintingForState paintingForState = new PaintingForState();
        System.out.println(paintingForState.getStateDescription());
        System.out.println("Let's push the button " + PUSH_TIMES + " times");
            for (int i = 0; i < PUSH_TIMES; ++i) {
                paintingForState.pushTheButton();
            }

        //Command - Creates objects which encapsulate actions and parameters.
        // Allows the client to issue a request without knowing anything
        // about the operation or the receiver of the request.
        System.out.println();
        System.out.println("COMMAND:");
        OrderForCommand customerOrderCommand = new CustomerOrderForCommand();
        OrderRemoteControl createOrder = new OrderRemoteControl(new CreateCustomerOrder(customerOrderCommand));
        createOrder.pressButton();

        OrderRemoteControl deleteOrder = new OrderRemoteControl(new DeleteCustomerOrder(customerOrderCommand));
        deleteOrder.pressButton();
        System.out.println();
    }

    private static void printPaintingInfo(final Painting painting){

    System.out.println("Printing Painting information: "
            + "\n"  + "Paper Type and size: " + painting.getPaper_type()
            + "\n" + "Color type: " + painting.getColor_type()
            + "\n" + "Painter: " + painting.getPainter());
    }

}
