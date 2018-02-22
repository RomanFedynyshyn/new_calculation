public class Calculation {

    private float firstDigit;
    private float secondDigit;

    public void setFirstDigit(float firstDigit) {
        this.firstDigit = firstDigit;
    }

    public void setSecondDigit(float secondDigit) {
        this.secondDigit = secondDigit;
    }

    public float getFirstDigit() {
        return firstDigit;
    }

    public float getSecondDigit() {
        return secondDigit;
    }

    public float add() {
        float result = firstDigit + secondDigit;
        return result;
    }

    public float subtraction(){
        float result=firstDigit-secondDigit;
        return result;
    }

    public float multiplication(){
        float result=firstDigit*secondDigit;
        return result;
    }

    public float concatenation(){
        float result = firstDigit/secondDigit;

        return result;
    }


}
