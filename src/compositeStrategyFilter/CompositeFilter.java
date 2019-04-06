package compositeStrategyFilter;

import java.util.ArrayList;

public class CompositeFilter implements FilterStrategy {
	
	private ArrayList<FilterStrategy> filterList = new ArrayList<FilterStrategy>(); 
    

	@Override
	public void filter(ArrayList<String> a) {
		// TODO Auto-generated method stub
		for(FilterStrategy fs:filterList) 
        { 
            fs.filter(a); 
        }
	}
	
	public void addFilter(FilterStrategy fs) 
    { 
		filterList.add(fs); 
    } 
       
    public void removeFilter(FilterStrategy fs) 
    { 
    	filterList.remove(fs); 
    }
}