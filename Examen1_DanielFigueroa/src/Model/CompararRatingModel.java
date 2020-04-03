package Model;

import java.util.Comparator;

public class CompararRatingModel implements Comparator<ItemModel>{

	@Override
	public int compare(ItemModel o1, ItemModel o2) {
		// TODO Auto-generated method stub
		return Integer.parseInt(o1.getRating())-Integer.parseInt(o2.getRating());
	}

}
