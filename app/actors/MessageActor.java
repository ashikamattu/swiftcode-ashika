package actors;

import actors.MessageActor;
import akka.actor.UntypedActor;
import data.LoginForm;
import play.Configuration;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.LegacyWebSocket;
import play.mvc.Result;
import play.mvc.Results;
import play.mvc.WebSocket;
import views.html.chat;
import views.html.login;

import javax.inject.Inject;
import java.util.Objects;

public class MessageActor extends UntypedActor {

    @Override
    public void onReceive(Object message) throws Throwable {

    }
}