package org.vaadin.jouni.restrain.client;

import org.vaadin.jouni.restrain.Restrain;

import com.google.gwt.user.client.ui.Widget;
import com.vaadin.client.ServerConnector;
import com.vaadin.client.communication.StateChangeEvent;
import com.vaadin.client.extensions.AbstractExtensionConnector;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.shared.ui.Connect;

@Connect(Restrain.class)
public class RestrainConnector extends AbstractExtensionConnector {

    /**
     * The target component which will be restrained
     */
    protected AbstractComponentConnector target;

    @Override
    protected void extend(ServerConnector target) {
        this.target = (AbstractComponentConnector) target;
    }

    @Override
    public void onStateChanged(StateChangeEvent stateChangeEvent) {
        super.onStateChanged(stateChangeEvent);
        Widget widget = this.target.getWidget();

        widget.getElement().getStyle()
                .setProperty("minWidth", getState().minWidth);
        widget.getElement().getStyle()
                .setProperty("maxWidth", getState().maxWidth);

        widget.getElement().getStyle()
                .setProperty("minHeight", getState().minHeight);
        widget.getElement().getStyle()
                .setProperty("maxHeight", getState().maxHeight);
    }

    @Override
    public RestrainState getState() {
        return (RestrainState) super.getState();
    }

}
