public class Main {
    public static void main(String[] args) {
        Sorting sort = new Sorting();
        Email mailing = new Email();
        Delivery delivery = new Delivery();
        sort.registerObserver(mailing);
        sort.registerObserver(delivery);

        User[] UsersToSort;
        UsersToSort = new User[3];
        UsersToSort[0] = new User("user1@email.com", "user1", "00000-001");
        UsersToSort[1] = new User("user2@email.com", "user2", "00000-002");
        UsersToSort[2] = new User("user3@email.com", "user3", "00000-003");

        sort.sort(UsersToSort);
    }
}