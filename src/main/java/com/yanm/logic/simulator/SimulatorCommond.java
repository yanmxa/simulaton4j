package com.yanm.logic.simulator;

import com.yanm.command.Command;
import com.yanm.state.SimulatorState;

public interface SimulatorCommond extends Command<SimulatorState> {
    @Override
    void execute(SimulatorState simulatorState);

    @Override
    default Class<SimulatorState> getStateClass() {
        return SimulatorState.class;
    }
}
