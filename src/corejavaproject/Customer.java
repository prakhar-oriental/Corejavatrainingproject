package corejavaproject;

public class Customer implements Library {
   public int cusid;
   public String cusname;
   public String cusmobno;
public Customer(int cusid, String cusname, String cusmobno) {
	super();
	this.cusid = cusid;
	this.cusname = cusname;
	this.cusmobno = cusmobno;
}

@Override
public String toString() {
	return "Customer [cusid=" + cusid + ", cusname=" + cusname + ", cusmobno=" + cusmobno + "]";
}
public int getCusid() {
	return cusid;
}
public void setCusid(int cusid) {
	this.cusid = cusid;
}
public String getCusname() {
	return cusname;
}
public void setCusname(String cusname) {
	this.cusname = cusname;
}
public String getCusmobno() {
	return cusmobno;
}
public void setCusmobno(String cusmobno) {
	this.cusmobno = cusmobno;
}
   
   
}
