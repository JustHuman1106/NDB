package io.github.justhuman1106.command;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Test extends ListenerAdapter {
    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if (event.getName().equals("test")){
            event.deferReply().queue();
            event.getHook().sendMessage("?").setEphemeral(true).queue();
        }
    }
}
