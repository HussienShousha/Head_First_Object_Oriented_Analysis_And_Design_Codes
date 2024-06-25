import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory=new Inventory();
        initializeInventory(inventory);
        GuitarSpec whatErinLikes=new GuitarSpec(Builder.FENDER,"Stratocastor","6-string",Type.ELECTRIC,Wood.ALDER,Wood.ALDER);
        List matchingGuitars=inventory.search(whatErinLikes);
        if(!matchingGuitars.isEmpty()){
            System.out.println("Erin, you might like these guitars:");
            for (Iterator i= matchingGuitars.iterator(); i.hasNext();) {
                Guitar guitar=(Guitar) i.next();
                GuitarSpec guitarSpec=guitar.getSpec();
                System.out.println(" We have a "+guitarSpec.getBuilder()+" "+guitarSpec.getModel()+" "+guitarSpec.getNumStrings()+" "+guitarSpec.getType()+" "+" guitar:\n\t"+guitarSpec.getBackWood()+" back and sides,\n\t"+guitarSpec.getTopWood()+" top.\n you can have it for only $"+guitar.getPrice()+"!\n  ----");
            }
        }
        else{
            System.out.println("Sorry, Erin, We have nothing for you. ");
        }

    }
    private static void initializeInventory(Inventory inventory){
        GuitarSpec guitarSpec=new GuitarSpec(Builder.FENDER,"Stratocastor","6-string",Type.ELECTRIC,Wood.ALDER,Wood.ALDER);
        inventory.addGuitar("V95693",1499.95,guitarSpec);
        inventory.addGuitar("V9512",1549.95,guitarSpec);


    }
}
