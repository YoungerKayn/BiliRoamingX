package tv.danmaku.bili.ui.main.event.model;

import androidx.annotation.Nullable;

public class EventEntranceModel {
    @Nullable
    private String hash;
    @Nullable
    private Online online;

    public void setHash(String hash) {
        this.hash = hash;
    }

    public void setOnline(Online online) {
    }

    public static class Online {
    }
}
