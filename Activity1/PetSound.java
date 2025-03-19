class PetSound {
    public String makeSound(Pet pet, String sound) {
        System.out.println(pet.getPetName() + " makes a " + sound + " sound.");
        return sound;
    }
}