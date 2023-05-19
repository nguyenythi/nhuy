package com.demo.autoOrangeHRM;

import org.testng.annotations.Test;

import com.demo.page.autoOrangeHRM.navigationPage;
import com.demo.utils.BaseTest;

public class OpenBrowser extends BaseTest{
    @Test
    public void openBrowserOnWeb() throws InterruptedException {
        navigationPage open = new navigationPage();
        open.openOrangeHRMWebsite();
    }
}
