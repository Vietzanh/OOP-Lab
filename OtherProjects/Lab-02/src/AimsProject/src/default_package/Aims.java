package default_package;

public class Aims{
    public static void main(String[] args) {
//  create a new cart
        Cart anOrder = new Cart();

//  create new DVD and add to cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers",
                87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        System.out.println("The total cost is: ");
        System.out.println(anOrder.totalCost());

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas",
                87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        System.out.println("The total cost is: ");
        System.out.println(anOrder.totalCost());

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);
        System.out.println("The total cost is: ");
        System.out.println(anOrder.totalCost());

//  print total cost
        anOrder.removeDigitalVideoDisc(dvd1);
//
        System.out.println("The total cost is: ");
        System.out.println(anOrder.totalCost());

    }

}