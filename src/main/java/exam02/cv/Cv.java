package exam02.cv;

import java.util.ArrayList;
import java.util.List;

public class Cv {

    private String name;
    private List<Skill> skills = new ArrayList<>();

    public Cv(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void addSkills(String... skill) {
        for (String s : skill) {
            String skillName = s.substring(0, s.lastIndexOf(" "));
            String skillLevel = s.substring(s.indexOf("(") + 1, s.lastIndexOf(")"));
            skills.add(new Skill(skillName, Integer.parseInt(skillLevel)));
        }
    }

    public int findSkillLevelByName(String name) {
        for (Skill skill : skills) {
            if (skill.getName().equals(name)) {
                return skill.getLevel();
            }
        } throw new SkillNotFoundException("Skill not found: " + name);
    }
}
