package pets_amok;

public abstract class VirtualPet {
    protected int happinessLevel;
    protected int healthLevel;
    protected String virtualPetName;
    protected String virtualPetDescriptor;
    protected int boredomLevel;

    public VirtualPet(String virtualPetName, String virtualPetDescriptor) {
        this.virtualPetName = virtualPetName;
        this.virtualPetDescriptor = virtualPetDescriptor;
        this.boredomLevel = 15;
        this.healthLevel = 100;
        this.happinessLevel = 100;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public String getVirtualPetName() {
        return virtualPetName;
    }

    public String getVirtualPetDescriptor() {
        return virtualPetDescriptor;
    }


    public int getBoredomLevel() {
        return boredomLevel;
    }

//    public int giveWater() {
//        thirstLevel = thirstLevel - 15;
//        if (thirstLevel < 0) {
//            thirstLevel = 0;
//        }
//        return thirstLevel;
//    }
//
//    public int giveFood() {
//        hungerLevel = hungerLevel - 15;
//        if (hungerLevel < 0) {
//            hungerLevel = 0;
//        }
//        return hungerLevel;
//    }

    public int playWithPet() {
        boredomLevel = boredomLevel - 25;
        if (boredomLevel < 0) {
            boredomLevel = 0;
        }
        return boredomLevel;
    }

    public abstract void tick();

    public abstract int getHungerLevel();

    public abstract int getThirstLevel();
}
