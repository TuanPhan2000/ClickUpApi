package com.phan.clickupapi.entity;

import com.phan.clickupapi.enums.UserRole;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity(name = "user_permission")
@Getter
@Setter
public class UserPermission {

    @Id
    private String email;

    @Id
    @Enumerated(EnumType.STRING)
    private UserRole role;

    @Id
    private String workspaceId;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(nullable = false)
    private LocalDateTime updatedAt;

}
