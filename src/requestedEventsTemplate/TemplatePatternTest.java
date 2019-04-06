package requestedEventsTemplate;

public class TemplatePatternTest {
	public static void main(String[] args){
		RequestEventsTemplate sret = new StudentRequest();
		RequestEventsTemplate aret = new AdminRequest();
		RequestEventsTemplate oret = new OutsiderRequest();
		System.out.println("Student Request");
		sret.run();
		System.out.println("");
		System.out.println("Admin Request");
		aret.run();
		System.out.println("");
		System.out.println("Outsider Request");
		oret.run();
	}

}


