public class FirstClass {

    public static void main(String ...args)
    {
        System.out.println("This is enum testing");
		System.out.println(Months.FEBRUARY);
		System.out.println(Months.JANUARY);
        Months[] months = Months.values();

        for(Months month : months)
        {
            System.out.println("Object "+month.ordinal()+" : " + month+"\n   Value : "+month.getMonth());
        }
    }

}
 // Used for same types of Constants Values
 enum Months {
    JANUARY("January"),FEBRUARY("February"),MARCH("March"),APRIL("April");
    String monthName;
    Months(String s)
    {
        this.monthName = s;
    }

    String getMonth()
    {
        return this.monthName;
    }
}

