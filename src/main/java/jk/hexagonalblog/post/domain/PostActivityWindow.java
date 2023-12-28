package jk.hexagonalblog.post.domain;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;

public class PostActivityWindow {
    private List<PostActivity> activities;


    // 첫 활동시간 가져오기
    public LocalDateTime getStartTimestamp() {
        return activities.stream()
                .min(Comparator.comparing(PostActivity::getTimestamp))
                .orElseThrow(IllegalStateException::new)
                .getTimestamp();
    }

    // 마지막 활동시간 가져오기
    public LocalDateTime getEndTimestamp() {
        return activities.stream()
                .max(Comparator.comparing(PostActivity::getTimestamp))
                .orElseThrow(IllegalStateException::new)
                .getTimestamp();
    }


}
