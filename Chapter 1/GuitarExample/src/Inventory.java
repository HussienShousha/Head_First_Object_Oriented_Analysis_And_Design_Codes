import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Inventory {
    private List guitars;
    public Inventory(){

        guitars= new LinkedList();
    }
    public void addGuitar(String serialNumber,double price, GuitarSpec guitarSpec) {
    Guitar guitar=new Guitar(serialNumber,price,guitarSpec);
    guitars.add(guitar);
    }
    public Guitar getGuitar(String SerialNumber){
        for (Iterator i = guitars.iterator(); i.hasNext() ; ) {
            Guitar guitar = (Guitar) i.next();
            if(guitar.getSerialNumber().equals(SerialNumber)){
                return guitar;
            }
        }
        return null;
    }
    public List search(GuitarSpec searchGuitar){
        List matchGuitars=new LinkedList();
        for (Iterator i=guitars.iterator();i.hasNext();){
            Guitar guitar=(Guitar) i.next();
            if(guitar.getSpec().matches(searchGuitar))
                matchGuitars.add(guitar);
        }
        return matchGuitars;

    }
}
