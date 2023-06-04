package dju.bookTogether.Service;

import dju.bookTogether.Domain.Users;
import dju.bookTogether.Repository.UserRepository;
import dju.bookTogether.Repository.PartyRepository;
import dju.bookTogether.Domain.Party;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class PartyService {

    private final UserRepository userRepository;
    private final PartyRepository partyRepository;

    public Long party(Long memberId, String title){

        Users users = userRepository.findOne(memberId);
        Party party = Party.createParty(users, title);

        partyRepository.save(party);

        return party.getId();

    }
}
