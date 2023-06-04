package dju.bookTogether.Repository;

import dju.bookTogether.Domain.Party;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PartyRepository {

    @PersistenceContext
    private final EntityManager em;

    public void save(Party party) {em.persist(party);}

}
