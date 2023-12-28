package jk.hexagonalblog.post.domain;


import lombok.Value;

public class Post {
    private Long id;

    private Long likes;
    private Long views;
    private String content;

    private PostActivityWindow postActivityWindow;  // 게시글의 활동(생성,수정,삭제)들을 모아둔 활동창

    //==== 비즈니스 로직 ====//
    // 생성
    public boolean createPost(Long id) {
        return false;

    }




    // 수정



    // 삭제


}
