package corejavaproject;

public class Book implements Library {
  public int bookid;
  public String bookname;
  public String booktype;
  public String bookauthor;
public Book(int bookid, String bookname, String booktype, String bookauthor) {
	super();
	this.bookid = bookid;
	this.bookname = bookname;
	this.booktype = booktype;
	this.bookauthor = bookauthor;
}
@Override
public String toString() {
	return "Book [bookid=" + bookid + ", bookname=" + bookname + ", booktype=" + booktype + ", bookauthor=" + bookauthor
			+ "]";
}
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public String getBooktype() {
	return booktype;
}
public void setBooktype(String booktype) {
	this.booktype = booktype;
}
public String getBookauthor() {
	return bookauthor;
}
public void setBookauthor(String bookauthor) {
	this.bookauthor = bookauthor;
}
  
}
