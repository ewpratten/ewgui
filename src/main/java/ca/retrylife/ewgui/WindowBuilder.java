package ca.retrylife.ewgui;

import ca.retrylife.ewgui.Window.ConfigurationFlags;
import ca.retrylife.ewgui.content.components.Component;
import ca.retrylife.ewgui.content.containers.EmptyContainer;
import ca.retrylife.ewgui.theming.Style;
import ca.retrylife.ewgui.theming.styles.DefaultStyle;

public class WindowBuilder {

    private Component content = new EmptyContainer();
    private Component navbar = new EmptyContainer();
    private ConfigurationFlags[] flags;
    private String title;
    private Style style = new DefaultStyle();

    public WindowBuilder(String title) {
        this.title = title;
    }

    public WindowBuilder withNavbar(Component navbar) {
        this.navbar = navbar;
        return this;
    }

    public WindowBuilder withContent(Component content) {
        this.content = content;
        return this;
    }

    public WindowBuilder withConfiguration(ConfigurationFlags... flags) {
        this.flags = flags;
        return this;
    }

    public WindowBuilder withStile(Style style) {
        this.style = style;
        return this;
    }

    public Window build() {
        return new Window(title, navbar, content, style, flags);
    }

}