package org.vaadin.jouni.restrain;

import org.vaadin.jouni.restrain.client.RestrainState;

import com.vaadin.ui.AbstractComponent;

public class Restrain extends com.vaadin.server.AbstractExtension {

    public Restrain(AbstractComponent target) {
        super.extend(target);
    }

    @Override
    protected RestrainState getState() {
        return (RestrainState) super.getState();
    }

    public Restrain setMinWidth(String minWidth) {
        getState().minWidth = minWidth;
        return this;
    }

    public Restrain setMaxWidth(String maxWidth) {
        getState().maxWidth = maxWidth;
        return this;
    }

    public Restrain setMinHeight(String minHeight) {
        getState().minHeight = minHeight;
        return this;
    }

    public Restrain setMaxHeight(String maxHeight) {
        getState().maxHeight = maxHeight;
        return this;
    }

}
