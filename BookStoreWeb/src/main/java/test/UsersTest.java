package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bookstore.entity.Users;

public class UsersTest {

	public static void main(String[] args) {
		Users user1 = new Users();
		user1.setEmail("testmail@codezmr.net");
		user1.setFullName("Zamiruddin");
		user1.setPassword("@Password#code");
		
		//Step-1: Create an EntityManagerFactory
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWeb");
		
		//Step-2: Create an EntityManager
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		//Step-3: Begin a transaction
		entityManager.getTransaction().begin();
		
		//Step-4: Persist a Users object
		entityManager.persist(user1);
		
		//Step-5: Commit the transaction 
		entityManager.getTransaction().commit();
		
		//Step-6: Close the EntityManger
		entityManager.close();
		
		//Step-7: Close the EntityMangerFactory
		entityManagerFactory.close();
		
		System.out.println("A User object was persisted.");
	
	}

}
