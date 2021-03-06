package com.ams.catalog.actions.navigation;

import org.openqa.selenium.By;

class SidebarMenuComponent {
    static final String DEPARTMENT = "//a[@class='hmenu-item'][.='{0}']";
    static final By CUSTOMER_AVATAR = By.id("hmenu-customer-avatar-icon");

    static String categoryEntry(String categoryName) {
        return "//a[@class='hmenu-item'][.='" + categoryName + "']";
    }
}
