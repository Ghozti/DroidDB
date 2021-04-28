import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class Listener implements MessageCreateListener {
    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        if (event.getMessageContent().contains("clanker pin this")){
            event.getMessage().pin();
            event.getChannel().sendMessage("roger roger");
        }
    }
}
