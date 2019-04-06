package requestedEventsTemplate;

public abstract class RequestEventsTemplate {
	
//	hooks
	private boolean isApprovedEnabled = true; 		//enabled for students
	private boolean isDisApprovedEnabled = true; 	//enabled for students
	private boolean isPostEnabled = true; 			//enabled for admin
	private boolean isFeatureEnabled = true; 		//enabled for admin,student
	
	public boolean disableApproved() { 				//override in admin, outsider
		return true;
	}
	
	public boolean disableDisApproved() { 			//override in admin, outsider
		return true;
	}
	
	public boolean disablePost() { 					//override in student, outsider
		return true;
	}
	
	public boolean disableFeature() {				//override in outsider
		return true;
	}
	
	public RequestEventsTemplate(){
		isApprovedEnabled=disableApproved();
		isDisApprovedEnabled=disableDisApproved();
		isPostEnabled=disablePost();
		isFeatureEnabled=disableFeature();
	}

	//template method
	public final void run(){
		showpending();
		showapproved(); 
		showdisapproved();
		showAddButton();
		showDeleteButton();
		showEditButton();
		showPostButton();
		}

	public abstract void showpending(); 			//varies
	public abstract void showDeleteButton(); 		//varies
	
	public void showapproved(){
		if(isApprovedEnabled){
			System.out.println("showApproved.");
		}
	}
	
	public void showdisapproved(){
		if(isDisApprovedEnabled){
			System.out.println("showDisapproved.");
		}
	}
	
	public void showAddButton(){
		if(isFeatureEnabled){
			System.out.println("showAddButton: Add to own pending list");
		}
	}
	
	public void showEditButton(){
		if(isFeatureEnabled){
			System.out.println("showEditButton: edit pending and disapproved");
		}
		
	}
	
	public void showPostButton(){
		if(isPostEnabled){
			System.out.println("showPostButton.");
		}
	}
}
