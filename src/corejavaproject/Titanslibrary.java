package corejavaproject;

import java.util.Scanner;

public class Titanslibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 Admin ad = new Admin();
		    int num;
		      do{
		        System.out.println("1 Add Book");
		        System.out.println("2 Remove Book");
		        System.out.println("3 Show All Book");
		        System.out.println("4 Add Customer");
		        System.out.println("5 Remove Customer");
		        System.out.println("6 Show All Customer");
		        System.out.println("7 Borrow book");
		        System.out.println("0 Exit"); 

		        
		        System.out.println("Enter your choice");
		         num = sc.nextInt();
		       
		       
		       
		       switch(num)
		       {
		         case 1:
		           {
		                System.out.println("Enter bookid");
		                int bookid = sc.nextInt();sc.nextLine();
		                System.out.println("Enter bookname");
		                String bookname = sc.nextLine();
		                System.out.println("Enter booktype");
		                String booktype = sc.nextLine();
		                System.out.println("Enter bookauthor");
		                String bookauthor = sc.nextLine();
		                Book b  = new Book(bookid, bookname, booktype, bookauthor);
		                
		        	   ad.addbook(b);
		             break;
		           }
		           case 2:
		           {
		              
		        	   System.out.println("Enter bookid");
		               int bookid = sc.nextInt();
		               ad.removebook(bookid);
		             break;
		           }
		         case 3:
		           {
		             ad.showallbook();
		             break;
		           } 
		           case 4:
		           {
		        	   System.out.println("Enter Customer id");
		                int cusid = sc.nextInt();sc.nextLine();
		                System.out.println("Enter Custoer name");
		                String cusname = sc.nextLine();
		                System.out.println("Enter Customer Mobile no");
		                String cusmobno = sc.nextLine();
		                Customer c = new Customer(cusid, cusname, cusmobno);
		             ad.addcustomer(c);
		             break;
		           }
		           case 5:
		           {
		        	   System.out.println("Enter Customer id");
		               int cusid = sc.nextInt();
		               ad.removecustomer(cusid);
		             break;
		           } 
		           case 6:
		           {
		        	   ad.showallcustomer();
		             break;
		           }
		           case 7:
		           {
		        	   System.out.println("Enter Customer id");
		                int cusid = sc.nextInt();sc.nextLine();
		                System.out.println("Enter Custoer name");
		                String cusname = sc.nextLine();
		                System.out.println("Enter bookid");
		                int bookid = sc.nextInt();sc.nextLine();
		                System.out.println("Enter bookname");
		                String bookname = sc.nextLine();
		                ad.Borrowbook(cusid, cusname,bookid, bookname);
		             break;
		           }
		           default:
		           {
		            System.out.println("wrong option");
		           }
		       }
		          }while(num!=0);
		      
	}
}


