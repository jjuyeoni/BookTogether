package dju.bookTogether.Domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Party {

    @Id @GeneratedValue
    @Column(name="party_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users users;

    private String title;

    // 파티 생성
    public static Party createParty(Users users, String title){

        Party party = new Party();
        party.setUsers(users);
        party.setTitle(title);

        return party;
    }
}
