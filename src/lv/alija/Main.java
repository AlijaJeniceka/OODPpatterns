package lv.alija;


import lv.alija.decorator.PaperDecorator;
import lv.alija.decorator.SimplePainting;


public class Main {

    public static void main(String[] args) {
	   //Build a new painting using Builder pattern
        final Painting paint = PaintingBuilder.aPainting()
                .withPaperType("300 g/m^2, A4")
                .withColorType("Acrylic colors")
                .withPainter("Name, Surname")
                .build();
        printPaintingInfo(paint);


        //Decorator in use. Decorator helps to add additional behavior in an existing method of an object.
        lv.alija.decorator.Painting painting = new SimplePainting();
        System.out.println(painting.use());
        painting = new PaperDecorator(painting);
        System.out.println(painting.use());

        //Composite - composes zero-or-more similar objects to manipulate them as one object.

    }

    private static void printPaintingInfo(final Painting painting){

    System.out.println("Printing Painting information: "
            + "\n"  + "Paper Type and size: " + painting.getPaper_type()
            + "\n" + "Color type: " + painting.getColor_type()
            + "\n" + "Painter: " + painting.getPainter());
}

}
