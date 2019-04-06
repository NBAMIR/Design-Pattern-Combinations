package requestedEventsTemplate;

public class OutsiderRequest extends RequestEventsTemplate{

	@Override
	public void showpending() {
		System.out.println("This Feature is not available for NonNustians.");
	}

	@Override
	public void showDeleteButton() {
		System.out.println("Event Controls are not available for NonNustians.");
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
	
	@Override
	public boolean disablePost() {
		return false;
	}
	
	@Override
	public boolean disableFeature() {
		return false;
	}
}
