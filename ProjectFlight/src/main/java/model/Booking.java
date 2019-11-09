package model;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Booking")
public class Booking {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int bookingid ;
private String pname;
private int page;
@Temporal(TemporalType.DATE)
private Date bookingdate;

@ManyToOne
@JoinColumn(name="flightid")
private Flight flight;

public int getBookingid() {
	return bookingid;
}

public void setBookingid(int bookingid) {
	this.bookingid = bookingid;
}

public String getPname() {
	return pname;
}

public void setPname(String pname) {
	this.pname = pname;
}

public int getPage() {
	return page;
}

public void setPage(int page) {
	this.page = page;
}

public Date getBookingdate() {
	return bookingdate;
}

public void setBookingdate(Date bookingdate) {
	this.bookingdate = bookingdate;
}

public Flight getFlight() {
	return flight;
}

public void setFlight(Flight flight) {
	this.flight = flight;
}

@Override
public String toString() {
	return "Booking [bookingid=" + bookingid + ", pname=" + pname + ", page=" + page + ", bookingdate=" + bookingdate
			+ "]";
}

public Booking() {
	super();
}


}
