package com.example.restfulwebservice.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue
    private Integer id;

    private String description;

    //User : Post -> 1:N, main : sub -> parent:child
    @JsonIgnore
    @ManyToOne(fetch =  FetchType.LAZY) //지연로딩방식: 포스트데이터가 로딩되는 시점에 필요한 데이터를 가져오곘다.
    private User user;
}
