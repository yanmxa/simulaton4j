package com.yanm.gol.components.editor;

import com.yanm.app.command.Command;

public interface EditorCommand extends Command<EditorState> {

    @Override
    void execute(EditorState editorState);

    @Override
    default Class<EditorState> getStateClass() {
        return EditorState.class;
    }
}
