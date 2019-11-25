package database;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

import domain.Article;
import domain.Purchase;
import domain.User;

import database.ForumDAOInterface;

public class ForumInMemoryDAO implements ForumDAOInterface  {
	HashMap<String, User> dbUsers=new HashMap<String,User>();
	HashMap<String, Article> dbArticles=new HashMap<String,Article>();

	
	
	public User addUserDAO(String id, String name, String tel) {
		User u=new User(id, name, tel);
		dbUsers.put(id, u);
		return u;
	}
	
	
	public User removeUserDAO(String id) {
		User u=dbUsers.remove(id);
		return u;
	}
	
	
	public User getUserDAO(String id) {
		return dbUsers.get(id);
	}

	
	public void addBasketDAO(User u, Article art,int quantity) {
		u.addBasket(art, quantity);
	}

	
	public void buyDAO(User u, Date d) {
		 u.buy(d);
	}
	
	
	public Iterator<Purchase> getPurchasesDAO(User u, Date firstDate, Date lastDate) {
		return u.getPurchases(firstDate, lastDate);
	}

	
	public Article addStockDAO(String id, String desc, int price, boolean isOutlet, int stock) {
		Article art=new Article(id,  desc,  price,  isOutlet,stock);
		dbArticles.put(id, art);
		return art;
	}

	
	public Article removeStockDAO(String id) {
		return dbArticles.remove(id);
		}
	
	
	public boolean existUserDAO(String id) {
		// TODO Auto-generated method stub
		return dbUsers.get(id)!=null;
	}

}
