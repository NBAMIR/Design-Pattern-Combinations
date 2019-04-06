package singletonDecoratorEventBoard;

public class eventBoard {
	
	   private static eventBoard instance = new eventBoard();
	   
	   public String filter;

	   private eventBoard(){}

	   public static eventBoard getInstance(){
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("Event Board created using Singleton Design Pattern.");
	   }
	   
	   public void displayEvents(){
		      System.out.println("Events Displayed.");
		   }
	   
	   public void getEvents(){
		   filter="Retreiving All Events.";
		      System.out.println(filter);
		   }
	   
}
