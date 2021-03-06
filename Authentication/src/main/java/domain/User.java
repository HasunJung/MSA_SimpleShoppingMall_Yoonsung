package domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by yoon on 15. 8. 5..
 */
@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @OneToMany(fetch = FetchType.EAGER)
    List<Authority> authorities;
}
