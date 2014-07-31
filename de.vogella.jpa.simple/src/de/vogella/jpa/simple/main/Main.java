package de.vogella.jpa.simple.main;

import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import de.vogella.jpa.simple.model.Family;
import de.vogella.jpa.simple.model.Female;
import de.vogella.jpa.simple.model.Male;
import de.vogella.jpa.simple.model.Person;

public class Main {
	private static final String PERSISTENCE_UNIT_NAME = "people";
	private static EntityManagerFactory factory;

	public static void main(String[] args) {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();

		// Begin a new local transaction so that we can persist a new entity
		em.getTransaction().begin();

		// read the existing entries
		Query q = em.createQuery("select m from Person m");

		List<Person> persontList = q.getResultList();
		for (Person person : persontList) {
			System.out.println(person.getFirstName() + " "
					+ person.getLastName());
		}

		// Persons should be empty

		// do we have entries?
		boolean createNewEntries = (q.getResultList().size() == 0);

		// No, so lets create new entries
		if (createNewEntries) {
			assertTrue(q.getResultList().size() == 0);
			Family family = new Family();
			family.setDescription("Family for the Knopfs");
			em.persist(family);
			for (int i = 0; i < 40; i++) {
				Person person;
				if(i%2 == 0){
					person = new Male();
					((Male)person).setM(i+"");
				}
				else{
					person = new Female();
					((Female)person).setF(i+"");
				}
				
				person.setFirstName("Jim_" + i);
				person.setLastName("Knopf_" + i);
				em.persist(person);
				// now persists the family person relationship
				family.getMembers().add(person);
				em.persist(person);
				em.persist(family);
			}
		}

		// Commit the transaction, which will cause the entity to
		// be stored in the database
		em.getTransaction().commit();

		// It is always good practice to close the EntityManager so that
		// resources are conserved.
		em.close();

	}
}