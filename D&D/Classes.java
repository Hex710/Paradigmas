
public class Classes {

    protected int level;
    protected int hitPointDice;
    protected boolean lightArmor;
    protected boolean mediumArmor;
    protected boolean heavyArmor;
    protected boolean shields;
    protected boolean simpleWeapons;
    protected boolean martialWeapons;
    protected String savingThrows[];
    protected String skills[];
    protected int dc;

    public Classes(int level, int hitPointDice, boolean lightArmor, boolean mediumArmor, boolean heavyArmor, boolean shields, boolean simpleWeapons, boolean martialWeapons, String savingthrows[], String skills[], int dc) {
        this.setLevel(level);
        this.sethitPointDice(hitPointDice);
        this.setLightArmor(lightArmor);
        this.setMediumArmor(mediumArmor);
        this.setHeavyArmor(heavyArmor);
        this.setShields(shields);
        this.setSimpleWeapons(simpleWeapons);
        this.setMartialWeapons(martialWeapons);
        this.setSavingThrows(savingthrows);
        this.setSkills(skills);
        this.setDC(dc);
    }

    public int getLevel() {
        return this.level;
    }

    public int gethitPointDice() {
        return this.hitPointDice;
    }

    public boolean isLightArmor() {
        return this.lightArmor;
    }

    public boolean isMediumArmor() {
        return this.mediumArmor;
    }

    public boolean isHeavyArmor() {
        return this.heavyArmor;
    }

    public boolean isShields() {
        return this.shields;
    }

    public boolean isSimpleWeapons() {
        return this.simpleWeapons;
    }

    public boolean isMartialWeapons() {
        return this.martialWeapons;
    }

    public String[] getSavingThrows() {
        return this.savingThrows;
    }

    public String[] getSkills() {
        return this.skills;
    }

    public int getDC() {
        return this.dc;
    }

    public void setLevel(int level) {
        if ((level > 0) && (level <= 20)) {
            this.level = level;
        }
    }

    public void sethitPointDice(int hitPointDice) {
        if ((hitPointDice == 6) || (hitPointDice == 8) || (hitPointDice == 10) || (hitPointDice == 12)) {
            this.hitPointDice = hitPointDice;
        }
    }

    public void setLightArmor(boolean lightArmor) {
        this.lightArmor = lightArmor;
    }

    public void setMediumArmor(boolean mediumArmor) {
        this.mediumArmor = mediumArmor;
    }

    public void setHeavyArmor(boolean heavyArmor) {
        this.heavyArmor = heavyArmor;
    }

    public void setShields(boolean shields) {
        this.shields = shields;
    }

    public void setSimpleWeapons(boolean simpleWeapons) {
        this.simpleWeapons = simpleWeapons;
    }

    public void setMartialWeapons(boolean martialWeapons) {
        this.martialWeapons = martialWeapons;
    }

    public void setSavingThrows(String savingThrows[]) {
        if (savingThrows != null) {
            this.savingThrows = savingThrows;
        }
    }

    public void setSkills(String skills[]) {
        if (skills != null) {
            this.skills = skills;
        }
    }

    public void setDC(int dc) {
        if (dc >= 6) {
            this.dc = dc;
        }
    }

    public void levelUp() {
        this.level += 1;
    }

    public String toString() {
        return "class level: " + this.level + "\n" + "class abilities DC: " + this.dc;
    }

}
