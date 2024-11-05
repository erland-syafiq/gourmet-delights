package com.gourmetdelights.api.user;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private UUID userId;
    private String username;
    private String firstName;
    private String lastName;
}
