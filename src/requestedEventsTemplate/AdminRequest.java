package requestedEventsTemplate;

public class AdminRequest extends RequestEventsTemplate {

	@Override
	public void showpending() {
		System.out.println("Admin_showpending: All pending student events and admin's events displayed.");
	}

	@Override
	public void showDeleteButton() {
		System.out.println("Admin_showDeleteButton: Remove pending event from database and add to disapproved for students.");
		
	}
	
	//Hook methods
	@Override
	public boolean disableApproved() {
		return false;
	}
	
	@Override
	public boolean disableDisApproved() {
		return false;
	}
}
