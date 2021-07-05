package Control;

import java.util.Scanner;
import Model.parent;
public class Assignment 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Kindly provide your info for signup or login");
		System.out.println("Click 1.Sign up                  2.login");
		int n=s.nextInt();
		boolean validate;
		parent h=new parent();
		switch(n)
		{
		case 1:
			
			System.out.println("Kindly enter your name");
			 h.setName(s.next()); 
			 System.out.println("Now enter your username");
			 h.setUsername(s.next());
			 System.out.println("Now enter your password");
			h.setPassword(s.next());
			System.out.println("Hi "+h.getName()+ " welocome to our page");
		case 2:
			System.out.println("Kindly enter your username to login");
			h.setUser1(s.next());
			System.out.println("Enter password to login");
			h.setPassword1(s.next());
			details x=new details();
			if(validate=h.getUser1().equals(h.getUsername())?(h.getPassword1().equals(h.getPassword())?true:false):false )
			{
				x.display();
			}
			else
			{
				System.out.println("Wrong user and password");
			}
			break;
			default:
				System.out.println("Wrong input pls login again");
			
	      }
	}
}
	class details
	{
		void display()
		{
			System.out.println("Successfully logged in");
			parent k=new parent();
			System.out.println("welcome to my world and a Grand Welcome to you "+k.getName());
			System.out.println("Do you want to change password");
			System.out.println("Click 1.To change password");
			System.out.println("2.no need to change password");
			Scanner sc=new Scanner(System.in);
			int n1=sc.nextInt();
			switch(n1)
			{
			case 1:
				System.out.println("Type the new password which ever not used before");
				parent q=new parent();
				q.setPassword(sc.next());
				if(q.getPassword1().equals(q.getPassword()))
				{
					System.out.println("Password is matching with pervious");
					System.out.println("Kindly go back");
				}
				else
				{
				System.out.println(q.getPassword()+" This is your new password");
				System.out.println("Password is successfully changed");
				}
				break;
			case 2:
				System.out.println("Good luck and have a nice day");
				break;
				default:
					System.out.println("Wrong input");
			}
		}
	}
