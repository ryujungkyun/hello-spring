package hello.hellospring.domain;

import jakarta.persistence.*;

@Entity
public class Member {

    //id는 값을 자동으로 활당해주는것을 원하기 떄문에 GenerationType.IDENTITY

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //해당 데이터베이스의 컬럼이 username인 경우 애노테이션을 통한 매핑이 가능하다
    //@Column(name = "username")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
