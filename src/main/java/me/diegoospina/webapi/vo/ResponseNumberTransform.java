package me.diegoospina.webapi.vo;

public class ResponseNumberTransform {
    public int arabicNumber;
    public String romanNumber;

    public int getArabicNumber() {
        return arabicNumber;
    }

    public void setArabicNumber(int arabicNumber) {
        this.arabicNumber = arabicNumber;
    }

    public String getRomanNumber() {
        return romanNumber;
    }

    public void setRomanNumber(String romanNumber) {
        this.romanNumber = romanNumber;
    }

    public static class Builder {

        private final ResponseNumberTransform object;

        public Builder() {
            object = new ResponseNumberTransform();
        }

        public Builder withArabicNumber(int value) {
            object.arabicNumber = value;
            return this;
        }

        public Builder withRomanNumber(String value) {
            object.romanNumber = value;
            return this;
        }

        public ResponseNumberTransform build() {
            return object;
        }
    }
}
