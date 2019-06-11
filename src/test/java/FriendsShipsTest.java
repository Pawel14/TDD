import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FriendsShipsTest {

//    private Friendships friendships;
//    @BeforeEach
//    public void setUp(){
//        friendships = new Friendships(); //zamiast linijki given
//    }

    @Test
    public void shouldAddTwoPersonAFriends() {
        //given
        Friendships friendships = new Friendships();

        //when
        friendships.makeFriends( "Ala", "Jacek");

        //then
        List<String> friend = friendships.getFriends("Ala");
        assertTrue(friend.contains("Jacek"));
    }

    @Test
        public void shouldReturnEmptyListWithFriends() {
            //given
            Friendships friendships = new Friendships();

            //when
            List<String> friends = friendships.getFriends("Kasia");

            //then
           assertTrue(friends.isEmpty());

    }

    @Test
    public void twoPersonShouldBeFriends() {
        //given
        Friendships friendships = new Friendships();
        friendships.makeFriends("Ala", "Jacek");

        //when
        boolean areFriends = friendships.areFriends("Ala", "Jacek")
                && friendships.areFriends("Jacek","Ala");

        //then
        assertTrue(areFriends);
    }

    @Test
    public void shouldRemovePerson() {
        //given
        Friendships friendships = new Friendships();

        //when
        friendships.makeFriends( "Ma", "Jacek");

        //then
        List<String> friend = friendships.removeFriends("Ma");
        assertTrue(friend.contains("Jacek"));
    }



}