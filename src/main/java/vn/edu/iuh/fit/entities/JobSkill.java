package vn.edu.iuh.fit.entities;

import lombok.*;
import vn.edu.iuh.fit.enums.SkillLevel;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class JobSkill {
    private Skill skill_id;
    private Job job_id;
    private SkillLevel skill_level;
    private String more_infos;

}
