package jk.hexagonalblog.member.adapter.out.persistence;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberEntity { // JPA가 관리하는 MemberEntity

    @Id @GeneratedValue
    private Long id;

    private String email;

}
