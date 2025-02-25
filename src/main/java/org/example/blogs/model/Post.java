package org.example.blogs.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@Table("POSTS")
@Getter
@NoArgsConstructor
@Setter
@AllArgsConstructor
public class Post {

    @Id
    private UUID uuid;
    private String title;
    private String content;
    private UUID userUUID;


}
