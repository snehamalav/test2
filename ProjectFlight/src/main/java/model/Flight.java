package model;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Flight")
@NamedQuery(name="findflights",query="Select f from Flight f")
@NamedNativeQuery(name="query1",query="select * from Flight where flightid=:fid order by flightid desc",resultClass=Flight.class)
public class Flight {

@Id
private int flightid;
private String airline;
private String source;
private String destination;

@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="flightid")
 private java.util.List<Booking> bookinglist= new ArrayList<Booking>();

public int getFlightid() {
	return flightid;
}

public void setFlightid(int flightid) {
	this.flightid = flightid;
}

public String getAirline() {
	return airline;
}

public void setAirline(String airline) {
	this.airline = airline;
}

public String getSource() {
	return source;
}

public void setSource(String source) {
	this.source = source;
}

public String getDestination() {
	return destination;
}

public void setDestination(String destination) {
	this.destination = destination;
}

public java.util.List<Booking> getBookinglist() {
	return bookinglist;
}

public void setBookinglist(java.util.List<Booking> bookinglist) {
	this.bookinglist = bookinglist;
}

@Override
public String toString() {
	return "Flight [flightid=" + flightid + ", airline=" + airline + ", source=" + source + ", destination="
			+ destination + "]";
}

public Flight() {
	super();
}


		
}
