
public class Main {


    public static void main(String[] args) {
        for (int i = 6; i <= 78; i++) {
            try {
                String currentAttempt = new UglyNumber((i % 7 == 0)?i+"abcd":i+"").toString();
                System.out.println("Number "+currentAttempt +" processed successfully");
            } catch (TooPrettyNumberException e)
            {
                System.out.println("Oops - beauty contest? "+ e.getMessage());
            }
            catch (Exception e)
            {
                System.out.println("Strange error occured: "+ e.getClass().getName() +" " + e.getMessage());
            }

        }


    }

}
