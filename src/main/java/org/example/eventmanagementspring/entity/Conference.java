package org.example.eventmanagementspring.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "conferences")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Conference extends Event {
    @Column(nullable = false)
    private String speaker;

    @Column(nullable = false)
    private int capacity;
}