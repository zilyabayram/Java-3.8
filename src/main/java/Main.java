public class Main {
    public static void main(String[] args) {

        Post post = new Post();
        post.bithday = new FormDate();
        post.bithday.day = 13;
        post.bithday.month = 06;
        post.bithday.year = 1999;
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phoneNumber = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;
    }
}