package es.upm.miw.apiArchitectureSport.daos;

import java.util.List;

import es.upm.miw.apiArchitectureSport.entities.Sport;
import es.upm.miw.apiArchitectureSport.entities.User;

public interface UserDao extends GenericDao<User, Integer> {
	List<String> findByUser(String nick);

	List<Integer> findOneUser(String nick);

	List<Sport> findSport(Integer idUser);

	List<User> findUserBySport(String sportName);
}
