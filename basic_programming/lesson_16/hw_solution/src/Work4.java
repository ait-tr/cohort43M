public class Work4 {
    public static void main(String[] args) {
        int note = 9;
        int timeWithTv = 45;

        switch (note){
            case 12:
            case 11:
            case 10:
                timeWithTv +=60;
                System.out.println("Молодчина, отличная работа\nМожешь смотреть Теливизор "+ timeWithTv + " минут");
                break;
            case 9:
            case 8:
            case 7:
                timeWithTv +=45;
                System.out.println("Неплохо но вчера было лучше\nМожешь смотреть Теливизор "+ timeWithTv + " минут");
                break;
            case 6:
            case 5:
            case 4:
                timeWithTv +=15;
                System.out.println("Телевизор плохо влияет\nМожешь смотреть Теливизор " + timeWithTv + " минут");
                break;
            default:
                timeWithTv = 0;
                System.out.println("Трагедия... Сегодня ТВ смотреть запрещено " + timeWithTv + " минут");
        }
    }
}
