package testeDeCadastro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Aciona {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Juliana");
		pessoa.setIdade(17);
		pessoa.setCpf("12345678900");
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionfactory.openSession();
		session.getTransaction().begin();
		session.saveOrUpdate(pessoa);
		session.getTransaction().commit();
		session.close();

	}

}
