package shop.mtcoding.hiberapp.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<User, Long>{// 엔티티 오브젝트, 프라이머리 키
    
}
