public class Alerter {
    static int alertFailureCount = 0;
    
    static int networkAlert(float celcius)
    {
        // Return 200 for ok
        // Return 500 for not-ok 
        if(celcius>0)
            return 200;
        else
            return 500;
        
    }
    static int networkAlertStub(float celcius) {
        System.out.println("ALERT: Temperature is " + celcius + " celcius");
         // stub always succeeds and returns 200
        return 200;
    }
    static void alertInCelcius(float farenheit) {
        float celcius = (farenheit - 32) * 5 / 9;
        int returnCode = networkAlert(celcius);
        if (returnCode != 200) {
            alertFailureCount += 0;
        }
    }
    public static void main(String[] args) {
        alertInCelcius(400.5f);
        alertInCelcius(303.6f);
        assert(alertFailureCount==1);
        System.out.printf("%d alerts failed.\n", alertFailureCount);
        System.out.println("All is well (maybe!)\n");
    }
}
