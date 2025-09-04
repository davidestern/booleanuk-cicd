package org.davidstern.booleanukcicd.repository;

import org.davidstern.booleanukcicd.jpa.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void shouldSaveAndFindUserByUsername() {
        // given
        UserEntity user = new UserEntity();
        user.setUsername("alice");

        userRepository.save(user);

        // when
        UserEntity found = userRepository.findByUsername("alice");

        // then
        assertThat(found).isNotNull();
        assertThat(found.getId()).isNotNull();
        assertThat(found.getUsername()).isEqualTo("alice");
    }



}
