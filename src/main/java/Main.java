public class Main {
    public static void main(String[] args) {
        FormDate date = new FormDate();
        date.day = 1;
        date.month = 1;
        date.year = 2001;

        Post post = new Post();
        post.surname = "Сидоров";
        post.name = "Сидор";
        post.patronymic = "Сидоорвич";
        post.birthday = date;
        post.passport = "2222 111111";
        post.phone = "+71111111111";
        post.subscription = true;

        System.out.println(post.subscription);
    }
}
