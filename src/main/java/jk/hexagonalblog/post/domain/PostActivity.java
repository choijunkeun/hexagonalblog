package jk.hexagonalblog.post.domain;


import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import java.time.LocalDateTime;

@Value  // 객체를 불변으로 만들어준다. 객체 내부 모든 필드에 private과 final을 붙여준다.
@RequiredArgsConstructor
public class PostActivity { // 게시글의 활동

    PostActivityId id;
    Post postId;
    LocalDateTime timestamp;

    public PostActivity(
            @NonNull PostActivityId id,
            @NonNull Post postId,
            @NonNull LocalDateTime timestamp,
            @NonNull String status) {
        this.id = id;
        this.postId = postId;
        this.timestamp = timestamp;

    }




    // record : 불변 데이터 객체를 쉽게 생성하는 새로운 클래스, JDK 16에서 정식 스펙으로 포함
    public record PostActivityId(Long value) {
    }

}
