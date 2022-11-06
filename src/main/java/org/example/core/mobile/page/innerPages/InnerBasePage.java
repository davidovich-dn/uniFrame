package org.example.core.mobile.page.innerPages;

import org.example.core.mobile.page.BasePage;
import org.example.core.mobile.page.blocks.AppMenuBar;

public abstract class InnerBasePage extends BasePage {

    protected AppMenuBar appMenuBar = new AppMenuBar();

    public InnerBasePage() {
        super();
    }
}
