package requestedEventsTemplate;

public class StudentRequest extends RequestEventsTemplate {

	@Override
	public void showpending() {
		System.out.println("Student_showpending:Student's own pending events displayed.");
		
	}

	@Override
	public void showDeleteButton() {
		System.out.println("Student_showDeleteButton: Remove pending event from database.");
	}
	
	//Hooks
	
	@Override
	public boolean disablePost() { //override in student, outsider
		// TODO Auto-generated method stub
		return false;
	}

}
