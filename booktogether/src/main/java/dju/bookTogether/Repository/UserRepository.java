package dju.bookTogether.Repository;

import dju.bookTogether.Domain.Users;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    @PersistenceContext
    private final EntityManager em;

    public void save(Users users){em.persist(users);}

    public Users findOne(Long id){ return em.find(Users.class, id);}

}
