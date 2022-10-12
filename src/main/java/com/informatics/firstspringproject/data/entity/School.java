package com.informatics.firstspringproject.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "school")
public class School extends BaseEntity{

    private String name;

    private int maxNumberOfStudents;

    private boolean isHighSchool;

    @OneToMany(mappedBy = "school")
    @JsonIgnoreProperties("school")
    private List<Teacher> teachers;
}
