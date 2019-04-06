package compositeStrategyFilter;

import java.util.ArrayList;

public class FilterCompositeStrategyTest {
	public static void main (String[] args) 
    { 
        BusinessFilter bf = new BusinessFilter();
        OutsiderFilter sf = new OutsiderFilter();
        CompositeFilter categoryFilter = new CompositeFilter(); 
        categoryFilter.addFilter(bf); 
        categoryFilter.addFilter(sf); 
          
        UniversityHoursFilter uhf = new UniversityHoursFilter(); 
        DayFilter df = new DayFilter(); 
          
        CompositeFilter timeFilter = new CompositeFilter(); 
        timeFilter.addFilter(uhf); 
        timeFilter.addFilter(df); 
      
        CompositeFilter compositeFilter = new CompositeFilter(); 
        compositeFilter.addFilter(categoryFilter); 
        compositeFilter.addFilter(timeFilter); 
        
        ArrayList<String> a = new ArrayList<String>();
        a.add("a");
//        compositeFilter.filter(a); 
        FilterButton fb= new FilterButton(compositeFilter);
        fb.executeStrategy(a);
    }

}
