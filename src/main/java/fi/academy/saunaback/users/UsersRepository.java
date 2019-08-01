package fi.academy.saunaback.users;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
/**  Repositoria, jonka avulla saadaan käyttöön valmiit metodit. Iiris */
@RepositoryRestResource
public interface UsersRepository extends CrudRepository<Users, Long> {

}

