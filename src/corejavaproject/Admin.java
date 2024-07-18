package corejavaproject;

import java.util.ArrayList;

public class Admin {
 ArrayList<Book> bl = new ArrayList();
 ArrayList<Customer> cl = new ArrayList();
 
 public void Showbook(Book b)
 {
 	System.out.println(b.toString());
 }
 public void Borrowbook(int bookid,String bookname,int cusid,String cusname)
 {
 	 for(int i =  0;i<cl.size();i++)
 	 {
 		 if(cl.get(i).getCusid()== cusid && cl.get(i).getCusname().equals(cusname))
 		 {
 			for(int j =  0;j<bl.size();j++)
 			{
 				if(bl.get(j).getBookid() == bookid && bl.get(j).getBookname().equals(bookname))
 				{
 					System.out.println("Book"+bookname+"will issued to "+cusname);
 					break;
 				}else
 				{
 					System.out.println("Book is not available");
 				}
 			}
 		 }else
 		 {
 			 System.out.println("Customer is invalid");
 		 }
 	 }
 }
 public void Returnbook()
 {
 	
 }
 public void addcustomer(Customer b)
 {
	 cl.add(b);
 }
 public void removecustomer(int a)
 {
	 cl.remove(a);
 }
 
 public  void addbook(Book b)
 {
	 bl.add(b);
 }
 public void removebook(int a)
 {
	 bl.remove(a);
 }
 public void showallbook()
 {
	 for(Book b : bl)
	 {
		 System.out.println(b);
	 }
 }
 public void showallcustomer()
 {
	 for(Customer c : cl)
	 {
		 System.out.println(c);
	 }
 }
}
