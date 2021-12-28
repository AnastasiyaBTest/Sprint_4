public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {

       boolean isNameValid;

        try {
            if(name == null)
                name.replaceAll("[^ ]", "").length();

        } catch (NullPointerException exception) {
            isNameValid = false;
            return isNameValid;
        }

       int countSpaces = name.replaceAll("[^ ]", "").length();
       String nameWithoutSpaces = name.trim();
        isNameValid = name.length() >= 3 && name.length() <= 19 &&
                countSpaces == 1 && name.equals(nameWithoutSpaces);

        return isNameValid;
    }
}
