public class WhichDayIs {
    public static void main(String[] args){
        int month = 11;
        int day = 9;

        String MyFavSeason = 5 <= month && day >= 20 || month <= 6 && day <=20 ? "true" : "false";
        System.out.println(MyFavSeason);

    }
}
