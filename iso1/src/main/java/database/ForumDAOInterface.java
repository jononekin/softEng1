package database;

import java.util.Date;
import java.util.Iterator;

import domain.Article;
import domain.Purchase;
import domain.User;

public interface ForumDAOInterface {

	boolean existUserDAO(String id);
	
	User addUserDAO(String id, String name, String tel);

	User removeUserDAO(String id);

	User getUserDAO(String id);
	
	void addBasketDAO(User u, Article art, int quantity);

	void buyDAO(User u, Date d);

	Iterator<Purchase> getPurchasesDAO(User u, Date firstDate, Date lastDate);

	Article addStockDAO(String id, String desc, int price, boolean isOutlet, int stock);

	Article removeStockDAO(String id);

}