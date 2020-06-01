package utils;

public enum InputData {
    HOMEPAGE_URL("https://mail.ru/"),
    SENDTOADRESS("lena.khalopitsa@gmail.com");

    String personalData;

    InputData(String personalData) {
        this.personalData = personalData;
    }

    public String getPersonalData(){
        return personalData;
    }
}
