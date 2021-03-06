package edu.fsu.cs.cen5035;

/**
 *
 * @author Javier
 */
public class MagicStaff extends BasicWeapon implements Weapon {

    public MagicStaff() {
        super(80);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int damage = DAMAGE - (int)(armor - (armor * 0.2));
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

}
