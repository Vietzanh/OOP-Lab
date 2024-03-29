package default_package;

public class Cart {
//    create a list of DigitalVideoDisc
    public static final int MAX_NUMBER_ORDERD = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERD];

//    how many DVDs are in the cart
    private static int qtyOrdered;

//    add item to list
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered == MAX_NUMBER_ORDERD){
            System.out.println("The cart is full. Cannot add more item.");
            return;
        }
        itemsOrdered[qtyOrdered] = disc;
        qtyOrdered++;
        System.out.println("The DVD \"" + disc.getTitle() + "\" has been added to cart.");
        return;
    }

//    remove item from the list
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered == 0){
            System.out.println("The cart is empty. Cannot remove any item.");
            return;
        }
        for(int i=0;i<qtyOrdered;i++){
            if(itemsOrdered[i].equals(disc)){
                for(int j=i;j<qtyOrdered-1;j++){
                    itemsOrdered[j] = itemsOrdered[j+1];
                }
                itemsOrdered[qtyOrdered-1] = null;
                qtyOrdered--;
                System.out.println("The DVD \"" + disc.getTitle() + "\" has been removed from the cart.");
                return;
            }
        }
        System.out.println("No item found.");
        return;
    }

//    calculate total cost
    public float totalCost(){
        float sum = 0;
        if (itemsOrdered.equals(null)){
            return 0;
        }
        for(int i=0;i<qtyOrdered;i++){
            sum+=itemsOrdered[i].getCost();
        }
        return sum;
    }

}
