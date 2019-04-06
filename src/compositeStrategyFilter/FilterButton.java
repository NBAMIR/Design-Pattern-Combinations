package compositeStrategyFilter;

import java.util.ArrayList;

public class FilterButton {
	private FilterStrategy filter;

	   public FilterButton(FilterStrategy filter){
	      this.filter = filter;
	   }

	   public void executeStrategy(ArrayList<String> a){
	      filter.filter(a);
	   }
}
