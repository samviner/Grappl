package io.grappl.client;

import io.grappl.client.commands.CommandHandler;

/**
 * Represents a single running instance of the Grappl application.
 * Not a tunnel, the entire program.
 */
public class Application {

    private static CommandHandler commandHandler;
    private static ClientLog clientLog;

    public static void create(String[] args) {
        clientLog = new ClientLog();
        commandHandler = new CommandHandler();
    }

    public static ClientLog getClientLog() {
        return clientLog;
    }

    public static CommandHandler getCommandHandler() {
        return commandHandler;
    }
}
