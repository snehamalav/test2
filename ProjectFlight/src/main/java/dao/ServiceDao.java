package dao;
import model.Booking;
import model.Flight;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;




public class ServiceDao {

/*public boolean addPlace(Places place)
	{
		boolean result=false;
		try{
		
		//code for jpa
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(place);
		em.getTransaction().commit();
		 result=true;
		
	}
		catch(Exception e)
		{
			System.out.println("error:"+e);
		}
		return result;
}
	public Places getPlace(Places place)
	{
		Places p=null;
		try{
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
			EntityManager em=emf.createEntityManager();
			p=em.find(Places.class, place.getPlaceid());
			
			
		}
		catch(Exception ee)
		{
			System.out.println("error"+ee);
		}
		return p;
	}*/
	
/*public boolean addFlight(Flight flight1){
		
		boolean result = false;
		try{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(flight1);
			em.getTransaction().commit();
			result = true;
		}
		
		catch(Exception e)
		{
			System.out.println("Error "+e);
		}
		
		
		return result;
	}
*/
public List<Flight> getFlight(Flight flight)
{

	List<Flight> flist=null;
	try
	{
		System.out.println(flight.getSource()+" "+flight.getDestination());
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		Query q=em.createQuery("select f from Flight f where f.source=:src and f.destination=:des");
		q.setParameter("src", flight.getSource());
		q.setParameter("des", flight.getDestination());
	 @SuppressWarnings("unchecked")
	List<Flight> f11=( List<Flight>)q.getResultList();
		for(Flight ff: f11)
		{
			System.out.println(ff);
		}

	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return flist;
}
	

/*public Booking getBooking(Booking booking)
{
	Booking bb=null;
	try
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		bb=em.find(Booking.class,booking.getBookingid());
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return bb;
}*/


}
