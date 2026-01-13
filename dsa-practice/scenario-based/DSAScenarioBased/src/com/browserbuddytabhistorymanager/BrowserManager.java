package com.browserbuddytabhistorymanager;

import java.util.Stack;

class BrowserManager {
	private TabHistory currentTab;
	private Stack<TabHistory> closedTabs;

	BrowserManager() {
		currentTab = new TabHistory();
		closedTabs = new Stack<>();
	}

	public void openPage(String url) {
		currentTab.visit(url);
	}

	public void back() {
		currentTab.back();
	}

	public void forward() {
		currentTab.forward();
	}

	public void closeTab() {
		closedTabs.push(currentTab);
		currentTab = new TabHistory();
		System.out.println("Tab closed");
	}

	public void reopenTab() {
		if (closedTabs.isEmpty()) {
			System.out.println("No tabs to restore");
			return;
		}
		currentTab = closedTabs.pop();
		System.out.println("Tab restored. Current page: " + currentTab.getCurrentPage());
	}
}
