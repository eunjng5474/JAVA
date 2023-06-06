package hello.hellospring.domain;

public class Member {

    // 두 가지 요구사항 - id(시스템에 저장), name
    private Long id;
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
