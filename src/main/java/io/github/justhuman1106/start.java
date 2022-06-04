package io.github.justhuman1106;

import io.github.justhuman1106.command.Test;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Guild;

import javax.security.auth.login.LoginException;

public class start {
    public static void main(String[] args) throws LoginException {
        JDA jda = JDABuilder.createDefault("OTc5NjUxNzY3NjY5MjI3NTcw.GlidCD.FX8nXSPfpPJdeBiquIOItjoQfubWDJ9xM8pJpM")
                .addEventListeners(new Test())
                .build();
        Guild guid = jda.getGuildById("967811503539503124");
        if (guid != null){
            guid.upsertCommand("test","test").queue();
        }
    }
}
