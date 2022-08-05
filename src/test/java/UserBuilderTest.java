import org.junit.Assert;
import org.junit.Test;

import com.caionilson.core.tema12.User;
import com.caionilson.core.tema12.UserBuilder;

public class UserBuilderTest {

    @Test
    public void createUserTest() {
        User user = UserBuilder.builder()
                .userName("Caio Eguchi Nilson")
                .userBirthday("27/09/1995")
                .userAddress("Jorge Salomao", "823", "SP", "Mogi das Cruzes")
                .build();
        
        Assert.assertEquals("Caio Eguchi Nilson", user.getName());
        Assert.assertEquals("27/09/1995", user.getBirthday());
        Assert.assertEquals("Jorge Salomao", user.getAddress().getRoad());
        Assert.assertEquals("823", user.getAddress().getNumber());
        Assert.assertEquals("Mogi das Cruzes", user.getAddress().getCity());
        Assert.assertEquals("SP", user.getAddress().getState());
    }
}
