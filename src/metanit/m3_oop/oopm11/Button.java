package metanit.m3_oop.oopm11;

public class Button {

    EventHandler handler;

    public Button(EventHandler handler) {
        this.handler = handler;
    }

    public void click() {
        handler.execute();
    }


}

