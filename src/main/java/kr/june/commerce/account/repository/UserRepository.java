package kr.june.commerce.account.repository;

import kr.june.commerce.account.entity.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    List<UserEntity> findByName(String name);
    Page<UserEntity> findAll(Pageable pageable);
    UserEntity findById(long id);
}
