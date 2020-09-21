package com.yanm;

import com.yanm.app.command.CommandExecutor;
import com.yanm.app.event.EventBus;
import com.yanm.app.state.StateRegistry;
import com.yanm.gol.view.MainView;

public class ApplicationContext {

    private EventBus eventBus;
    private CommandExecutor commandExecutor;
    private StateRegistry stateRegistry;

    private MainView mainView;

    private int boardWidth;
    private int boardHeight;

    public ApplicationContext(EventBus eventBus, CommandExecutor commandExecutor, StateRegistry stateRegistry, MainView mainView, int boardWidth, int boardHeight) {
        this.eventBus = eventBus;
        this.commandExecutor = commandExecutor;
        this.stateRegistry = stateRegistry;
        this.mainView = mainView;
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
    }

    public EventBus getEventBus() {
        return eventBus;
    }

    public CommandExecutor getCommandExecutor() {
        return commandExecutor;
    }

    public StateRegistry getStateRegistry() {
        return stateRegistry;
    }

    public MainView getMainView() {
        return mainView;
    }

    public int getBoardWidth() {
        return boardWidth;
    }

    public int getBoardHeight() {
        return boardHeight;
    }
}
