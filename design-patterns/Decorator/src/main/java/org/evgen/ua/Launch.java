package org.evgen.ua;

public class Launch {

    public static void main(String[] args) {
        Race orc = new Orc();
        Race human = new Human();
        Race elf = new Elf();
        //basic hp and attack
        System.out.println("org.evgen.ua.Orc hp - " + orc.hp() + ", attack - " + orc.attack());
        System.out.println("org.evgen.ua.Human hp - " + human.hp() + ", attack - " + human.attack());
        System.out.println("org.evgen.ua.Elf hp - " + elf.hp() + ", attack - " + elf.attack());
        //upgrade them skills
        //orc 1x hp up and 1x attack up
        UpgradeDecorator orcWithUpgradedAttackAndHP = new HPUpgrade(new AttackUpgrade(orc));
        System.out.println("Upgraded orc hp - " + orcWithUpgradedAttackAndHP.hp() + ", attack - " + orcWithUpgradedAttackAndHP.attack());
        //elf 2x hp up
        UpgradeDecorator elfWithUpgradedHP = new HPUpgrade(new HPUpgrade(elf));
        System.out.println("Upgraded elf hp - " + elfWithUpgradedHP.hp() + ", attack - " + elfWithUpgradedHP.attack());
        //human 2x attack up
        UpgradeDecorator humanWithUpgradedAttack = new AttackUpgrade(new AttackUpgrade(human));
        System.out.println("Upgraded human hp - " + humanWithUpgradedAttack.hp() + ", attack - " + humanWithUpgradedAttack.attack());
    }
}
