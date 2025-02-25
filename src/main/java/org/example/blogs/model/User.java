package org.example.blogs.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Table("users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User  {
    @Id
    private UUID uuid;
    private String name;
    private String email;
    private String password;
    private List<Post> posts;


}
