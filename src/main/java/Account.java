public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {

       boolean isNameValid;
       int countSpaces = name.replaceAll("[^ ]", "").length();
       String nameWithoutSpaces = name.trim();

        if(name.length() >= 3 && name.length() <= 19 &&
                countSpaces == 1 && name.equals(nameWithoutSpaces))
            isNameValid = true;
        else isNameValid = false;

        return isNameValid;
    }
}
