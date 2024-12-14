package inventory.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import inventory.entity.Product;
import inventory.utilities.SessionFactoryUtilites;

public class Model {
	public static void saveProduct(Product product) {
		try (SessionFactory factory = SessionFactoryUtilites.getSeesionFactory();
				Session session = factory.openSession()) {
			Transaction transaction = session.getTransaction();
			transaction.begin();
			session.persist(product);
			transaction.commit();
			System.out.println("saved");
		}
	}

	public static void updateProduct(String prodId, Product product) {
		try (SessionFactory factory = SessionFactoryUtilites.getSeesionFactory();
				Session session = factory.openSession()) {
			Product exiProduct = session.find(Product.class, prodId);
			if (product.getName() != null) {
				exiProduct.setName(product.getName());
			}
			if (product.getDescription() != null) {
				exiProduct.setDescription(product.getDescription());
			}
			if (product.getPrice() != exiProduct.getPrice()) {
				exiProduct.setPrice(product.getPrice());
			}

			Transaction beginTransaction = session.beginTransaction();
			session.merge(exiProduct);
			beginTransaction.commit();
			System.out.println("updated");
		}
	}

	public static void deleteProduct(String prodId) {
		try (SessionFactory factory = SessionFactoryUtilites.getSeesionFactory();
				Session session = factory.openSession()) {
			Product product = session.find(Product.class, prodId);
			if (product != null) {
				Transaction beginTransaction = session.beginTransaction();
				session.remove(product);
				beginTransaction.commit();
				System.out.println("removed");
			}
		}
	}

	public static void findProduct(String prodId) {
		try (SessionFactory factory = SessionFactoryUtilites.getSeesionFactory();
				Session session = factory.openSession()) {
			Product product = session.find(Product.class, prodId);
			if (product != null) {
				System.out.println(product);
			}
		}
	}
}
