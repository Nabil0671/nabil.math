package core.dao;

import org.hibernate.Session;


public interface IDAO<T> {
	
	public T load(long id, Session ss);
	public void update(T object, Session ss);
	public void delete(T object, Session ss);
	public T create (T object, Session ss);

}
