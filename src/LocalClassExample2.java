public class LocalClassExample2 {
    static String regularExpression = "[^0-9]";
    public static void validatePhoneNumber(String phoneNumber1, String phoneNumbner2){
        final int numberLength =10;
        class PhoneNumber{
            String formattedPhoneNumber =null;
            PhoneNumber(String phoneNumber){
                String currentNumber = phoneNumber.replaceAll(regularExpression, "");
                if (currentNumber.length()==numberLength)
                    formattedPhoneNumber = currentNumber;
                else
                    formattedPhoneNumber =null;
            }
        }
    }
}
