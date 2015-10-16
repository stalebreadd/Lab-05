// Lab05Est.java
// The Speeding Ticket Program
// This is the student, starting version of Lab 05E.


public class Lab05Est
{
    public static void main(String args[])
    {
        int first = 0;
        int moremoney = 0;   //not used in last step
        int tootal = 0;      //not used in final
        int toofast = 0;
        int seriously = 0;   
        int actuality = 0;
        
        System.out.println("Lab 05E");
        System.out.println();
        System.out.print("What is the posted speed limit? -->");
        int spedlimit = Expo.enterInt();
        
        
        System.out.println();
        System.out.print("How fast was the car travelling in MPH? -->");
        int superfast = Expo.enterInt();
        
        
        System.out.println();
        System.out.print("Did the violation occur in a school zone? {Y/N}  -->");
        char answerthequestion = Expo.enterChar();
             // 30 over the limit
        if( superfast - spedlimit > 30)
        {
            toofast = 160;      // don't put as int in here
        }
        
             //initial ticket + 6 dollars over the limit
        if( spedlimit < superfast)
        {
            first = 75;
            moremoney = superfast - spedlimit;
            actuality = moremoney * 6;
        }
        tootal = first + toofast + actuality;
            // if in a school zone
        if( answerthequestion == 'Y')
        {
            seriously = tootal * 2;
        }    
        
           // if not in a school zone
        if( answerthequestion == 'N')
        {
            seriously = tootal;
        }    
        
        
        System.out.println("Ticket amount: " + '$' + seriously);
        
        
        System.out.println();
    }
}
