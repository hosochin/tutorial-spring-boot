package com.example.demo.controller.resource;

import com.example.demo.domain.entity.UserEntity;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class GetUserTaleResponse {
    private List<UserEntity> userEntities;
}
