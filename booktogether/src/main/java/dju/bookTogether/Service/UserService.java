package dju.bookTogether.Service;

import dju.bookTogether.Domain.Users;
import dju.bookTogether.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Long join(Users users){
        userRepository.save(users);
        return users.getId();
    }
}
