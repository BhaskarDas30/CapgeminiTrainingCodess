package SetInterface;

import java.util.*;

public class PriceComparator implements Comparator<Mobile>{
	public int compare(Mobile b1, Mobile b2) {
		return Double.compare(b1.price, b2.price);
	}
}
