package Model;

import java.util.Comparator;

public class CompararAnoEstrenoModel implements Comparator<ItemModel>{

	@Override
	public int compare(ItemModel o1, ItemModel o2) {
		// TODO Auto-generated method stub
		return Integer.parseInt(o1.getAnoEstreno())-Integer.parseInt(o2.getAnoEstreno());
	}

}