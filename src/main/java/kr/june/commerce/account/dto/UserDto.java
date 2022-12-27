package kr.june.commerce.account.dto;

import kr.june.commerce.account.entity.UserEntity;
import lombok.Getter;

@Getter
public class UserDto {
    private final Long id;

    private final String name;

    private final String userName;

    public UserDto(UserEntity userEntity) {
        this.id = userEntity.id;
        this.name = userEntity.name;
        this.userName = userEntity.userName;
    }
}
