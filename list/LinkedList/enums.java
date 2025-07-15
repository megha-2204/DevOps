public class enums {

    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        //these are public, static, final
        // cannot create child enums, since it is final
        //these are enum constants
        //type is Week


        Week(){
            System.out.println("This constructor is called "+this);
        }
        //this is not public nor protected, this is default or private
        //Internally, public static final Week Monday = new Week();

    }
    public static void main(String[] args) {
        // Week week;
        // week = Week.Saturday;

        // for(Week days: Week.values()){
        //     System.out.println(days);
        // }
    }
    
}
