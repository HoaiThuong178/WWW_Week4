package vn.edu.iuh.fit.entities;

import lombok.*;
import vn.edu.iuh.fit.enums.SkillLevel;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CandidateSkill {
    private Candidate can_id;
    private Skill skill_id;
    private String more_infos;
    private SkillLevel skill_level;
}
