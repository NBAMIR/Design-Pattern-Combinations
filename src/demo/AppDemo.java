package demo;
import java.util.Scanner;

import facadeAccounts.*;
import singletonDecoratorEventBoard.*;

public class AppDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Log in or Sign up:");
		String mode = scanner.next();
		if(mode=="s"){
			System.out.println("Select User:");
			String user = scanner.next();
			System.out.println("Enter Name:");
			String name = scanner.next();
			
			//Enter email, password, confirm password
			//Enter special alloted ID for admin
			
			Person person;
			
			AccountMaker ac = new AccountMaker();
			if(user=="student"){
				person=ac.makeStudent(name);
			}
			else if(user=="admin"){
				person=ac.makeAdmin(name);
			}
			else{
				person=ac.makeOutsider(name);
			}
		}else{
			//Enter email and password
			//retreive account from db
		}
		
		eventBoard eventboard = eventBoard.getInstance();
		eventboard.showMessage();
		
		System.out.println("Enter filters:");
		String filters = scanner.nextLine();
      
		eventboard.getEvents();
		eventboard.displayEvents();		
		scanner.close();

	}

}
