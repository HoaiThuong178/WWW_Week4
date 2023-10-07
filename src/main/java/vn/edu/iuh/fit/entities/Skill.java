package vn.edu.iuh.fit.entities;

import lombok.*;
import vn.edu.iuh.fit.enums.SkillType;

import java.util.UUID;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Skill {
    private UUID skill_id;
    private String skill_decription;
    private String skill_name;
    private SkillType type;
}
