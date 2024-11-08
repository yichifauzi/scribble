package me.chrr.scribble.config;

import com.google.gson.annotations.SerializedName;

public class Config {
    public static int VERSION = 1;

    @SerializedName("version")
    public int version = VERSION;

    @SerializedName("copy_formatting_codes")
    public boolean copyFormattingCodes = true;

    @SerializedName("center_book_gui")
    public boolean centerBookGui = true;

    public void upgrade() {
        this.version = VERSION;
    }
}
