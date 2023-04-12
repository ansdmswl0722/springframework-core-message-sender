import com.nhnacademy.edu.springframework.messagesender.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class anotationTest {

    @InjectMocks
    private MessageSendService messageSendService;

    @Mock
    private MessageSender messageSender;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testSmsMessageSender() {

        when(messageSender.sendMessage(any(User.class),anyString())).thenReturn(false);
        boolean actual = messageSendService.doSendMessage();
        Assertions.assertThat(actual).isEqualTo(false);
    }
}
