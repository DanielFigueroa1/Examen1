package Model;

import java.util.Comparator;

public class CompararNombreModel implements Comparator<ItemModel>{

	@Override
	public int compare(ItemModel o1, ItemModel o2) {
		// TODO Auto-generated method stub
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
