import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class SILab2Test {
    private final SILab2 silab2 = new SILab2();
    private User makeUser(String username,String password,String email)
    {
        return new User(username,password,email);
    }
    private List<String> makeUsers(String ... users)
    {
        return new ArrayList<>(Arrays.asList(users));
    }
    @Test
    void testEveryBranch()
    {
        assertFalse(silab2.function(null, makeUsers("User1", "User2")));
        assertFalse(silab2.function(makeUser(null, "anything", "anything"), makeUsers("User1")));
        assertTrue(silab2.function(makeUser("urmi", "vojdan1A@", "anything"), makeUsers("User1")));
        assertFalse(silab2.function(makeUser("urmi", "vojce", "anything"), makeUsers("User1")));
        assertFalse(silab2.function(makeUser("urmi", "vojdan1A", "anything"), makeUsers("User1")));
    }
    @Test
    void testEveryPath()
    {
        //1,2,3,22,23
        assertFalse(silab2.function(null,makeUsers("User1","User3")));
        //1,2,3,4,22,23
        assertFalse(silab2.function(makeUser(null, "anything", "anything"), makeUsers("User5")));
        //1,2,3,4,5,6,7,22,23
        assertFalse(silab2.function(makeUser("urmi", "vojce", "anything"), makeUsers("User1")));
        //1,2,3,4,5,6,7,8,9.1,9.2,17,18,23 - ne moze da se sluci bidejki lenghtot na passwordot se proveruva prethodno
        //1,2,3,4,5,6,7,8,9.1,9.2,17,22,23 - ne moze da ne vlezeme vo forot (password.length <= 0), bidejki takva proverka pravime pogore vo funkcijata.
        //1,2,3,4,5,6,7,8,9.1,9.2,(10,11,12,13,14,9.3,9.2),17,22,23
        assertFalse(silab2.function(makeUser("urmi","ristovskiV3","anything"),makeUsers("Users...")));
        //1,2,3,4,5,6,7,8,9.1,9.2,(10,11,12,13,14,9.3,9.2),17,18,23 - ne moze funkcijata da bide true bidejki korisnikot nema specijalen znak vo negoviot password
        //1,2,3,4,5,6,7,8,9.1,9.2,(10,11,12,13,14,15,9.3,9.2),17,22,23 - ne moze funkcijata da vrati false, bidejki korisnikot ima passsword so site ispolneti kriteriumi
        //1,2,3,4,5,6,7,8,9.1,.9.2,(10,11,12,13,14,15,9.2,9.2),17,18,23
        assertTrue(silab2.function(makeUser("urmi", "kompjuteR1!", "anything"), makeUsers("User14","User18")));
        //1,2,3,4,5,6,7,8,9.1,9.2,(10,11,12,14,9.3,9.2),17,22,23
        assertFalse(silab2.function(makeUser("mouse", "tastatura8", "anything"), makeUsers("User1","User23")));
        //1,2,3,4,5,6,7,8,9.1,9.2,(10,11,12,14,9.3,9.2),17,18,23 - ne moze funkcijata da vrati true bidejki korisnikot nema golema bukva i specijalen znak vo negoviot password
        //1,2,3,4,5,6,7,8,9.1,9.2,(10,11,12,14,15,9.3,9.2),17,22,23
        assertFalse(silab2.function(makeUser("monitor", "kafence12$", "anything"), makeUsers("Users..")));
        //1,2,3,4,5,6,7,8,9.1,9.2,(10,11,12,14,15,9.3,9.2),17,18,22,23 - ne moze funkcijata da vrati true bidejki korisnikot nema golema bukva vo negoviot password
        //1,2,3,4,5,6,7,8,9.1,9.2,(10,12,13,14,9.3,9.2),17,22,23
        assertFalse(silab2.function(makeUser("cigari", "Slusalka", "anything"), makeUsers("User3","User32")));
        //1,2,3,4,5,6,7,8,9.1,9.2,(10,12,13,14,9.3,9.2),17,18,23 - ne moze funkcijata da vrati true bidejki korisnikot nema brojka i specijalen znak vo negoviot password
        //1,2,3,4,5,6,7,8,9.1,9.2,(10,12,13,14,15,9.3,9.2),17,22,23
        assertFalse(silab2.function(makeUser("alkohol","kesiceE%","email"),makeUsers("User23")));
        //1,2,3,4,5,6,7,8,9.1,9.2,(10,12,13,14,15,9.3,9.2),17,18,23 - ne moze funkcijata da vrati true bidejki korisnikot nema brojka vo negoviot password
        //1,2,3,4,5,6,7,8,9.1,9.2,(10,12,14,9.3,9.2),17,22,23
        assertFalse(silab2.function(makeUser("marlboro","zejtince","email@hotmail.com"),makeUsers("User0","User5")));
        //1,2,3,4,5,6,7,8,9.1,9.2,(10,12,14,9.3,9.2),17,18,23 - ne moze funkcijata da vrati true bidejki korisnikot nema brojka, golema bukva i specijalen znak vo negoviot password
        //1,2,3,4,5,6,7,8,9.1,9.2,(10,12,14,15,9.3,9.2),17,22,23
        assertFalse(silab2.function(makeUser("cveklo","aluminium.","finki@finki.com"),makeUsers("Users...")));
        //1,2,3,4,5,6,7,8,9.1,9.2,(10,12,14,15,9.3,9.2),17,18,23 - ne moze funkcijata da vrati true bidejki korisnikot nema golema bukva i brojka vo negoviot password




    }
}