package kr.june.commerce.account.services;

import kr.june.commerce.account.dto.UserDto;
import kr.june.commerce.account.entity.UserEntity;
import kr.june.commerce.account.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserDto getById(Long id) {
        UserEntity entity = userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("test"));
        return new UserDto(entity);
    }

    public List<UserDto> findByName(String name) {
        return userRepository.findByName(name).stream().map(UserDto::new).collect(Collectors.toList());
    }

    public Page<UserEntity> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

}

