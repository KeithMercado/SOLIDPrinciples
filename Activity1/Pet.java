class Pet {
    private String petName;
    private String owner;

    public Pet(String petName, String owner) {
        this.petName = petName;
        this.owner = owner;
    }

    public String getPetName() {
        return petName;
    }

    public String getOwner() {
        return owner;
    }
}